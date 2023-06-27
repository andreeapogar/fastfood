package it.pegaso2000.FastFoodApi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.pegaso2000.FastFoodApi.dto.PiattoDto;
import it.pegaso2000.FastFoodApi.model.Piatto;
import it.pegaso2000.FastFoodApi.service.PiattoService;

@RestController("api/piatto")
public class PiattoController {
	private PiattoService service;

	@Autowired
	public PiattoController(PiattoService service) {
		super();
		this.service = service;
		
	}
	
	//metodi
	@GetMapping("all")
	public ResponseEntity<List<PiattoDto>> all(){
		List<Piatto> list =service.findAll();
		List<PiattoDto> result = list.stream().map(piatto ->{
			return entityToDto(piatto);
		}).collect(Collectors.toList());
		return new ResponseEntity<List<PiattoDto>>(result, HttpStatus.OK);
	}
	
	
	@GetMapping("getById/{id}")
	public ResponseEntity<PiattoDto>getById(@PathVariable int id){
		Piatto p= service.findById(id);
		
		if(p==null) return new ResponseEntity<PiattoDto>(HttpStatus.OK);
		PiattoDto dto =entityToDto(p);
		return new ResponseEntity<PiattoDto>(dto, HttpStatus.OK);
			
	}
	
	
	
	private PiattoDto entityToDto (Piatto p) {
		PiattoDto dto=new PiattoDto();
		dto.setDescrizione(p.getDescrizione());
		dto.setId(p.getId());
		dto.setPrezzo(p.getPrezzo());
		dto.setIs_vegetariano(p.isIs_vegetariano());
		return dto;
	}
	
	

}
