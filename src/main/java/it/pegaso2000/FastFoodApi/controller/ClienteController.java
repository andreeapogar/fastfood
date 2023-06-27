package it.pegaso2000.FastFoodApi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.pegaso2000.FastFoodApi.dto.ClienteDto;
import it.pegaso2000.FastFoodApi.model.Cliente;
import it.pegaso2000.FastFoodApi.service.ClienteSevice;

@Controller
public class ClienteController {

	private ClienteSevice service;

	@Autowired
	public ClienteController(ClienteSevice service) {
		super();
		this.service = service;
	}
	
	//metodi
	@GetMapping("home")
	public String list(Model model) {
		List<Cliente> lista=service.findAll();
		List<ClienteDto> risultato= lista.stream().map(cliente ->{
			return entityToDto(cliente);
		}).collect(Collectors.toList());
			
		model.addAttribute("lista",risultato);
	
		return "homepage";
	}
	
	
	private ClienteDto entityToDto(Cliente c) {
		ClienteDto dto = new ClienteDto();
		dto.setId(c.getId());
		dto.setNome(c.getNome());
		dto.setEta(c.getEta());
		dto.setIs_vegetariano(c.isIs_vegetariano());
		return dto;
	}
	
	
}
