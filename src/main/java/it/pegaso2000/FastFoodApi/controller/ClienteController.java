package it.pegaso2000.FastFoodApi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.pegaso2000.FastFoodApi.dto.ClienteDto;
import it.pegaso2000.FastFoodApi.model.Cliente;
import it.pegaso2000.FastFoodApi.service.ClienteSevice;

@RestController("api/cliente")
public class ClienteController {

	private ClienteSevice service;

	@Autowired
	public ClienteController(ClienteSevice service) {
		super();
		this.service = service;
	}
	
	//metodi
	@GetMapping("all")
	public ResponseEntity<List<ClienteDto>>all(){
		List<Cliente> list =service.findAll();
		List<ClienteDto>result= list.stream().map(cliente ->{
			return entityToDto(cliente);
		}).collect(Collectors.toList());
		return new ResponseEntity<List<ClienteDto>>(result,HttpStatus.OK);
	}
	
	@GetMapping("getById/{id}")
	public ResponseEntity<ClienteDto> getById(@PathVariable int id){
		Cliente c = service.findById(id);
		
		if(c==null) return new ResponseEntity<ClienteDto>(HttpStatus.NO_CONTENT);
		ClienteDto dto= entityToDto(c);
		return new ResponseEntity<ClienteDto>(dto,HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<ClienteDto>save(@RequestBody ClienteDto dto){
		Cliente saving =dtoToEntity(dto);
		Cliente saved =service.save(saving);
		return new ResponseEntity<ClienteDto>(entityToDto(saved),HttpStatus.OK);
	}
	
	
	
	private ClienteDto entityToDto(Cliente c) {
		ClienteDto dto = new ClienteDto();
		dto.setId(c.getId());
		dto.setNome(c.getNome());
		dto.setEta(c.getEta());
		dto.setIs_vegetariano(c.isIs_vegetariano());
		return dto;
	}
	
	private Cliente dtoToEntity (ClienteDto dto) {
		Cliente c= new Cliente();
	
		c.setNome(dto.getNome());
		c.setEta(dto.getEta());
		c.setIs_vegetariano(dto.isIs_vegetariano());
		return c;
		
	}
}
