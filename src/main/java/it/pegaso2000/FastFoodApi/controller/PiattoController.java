package it.pegaso2000.FastFoodApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.pegaso2000.FastFoodApi.dto.PiattoDto;
import it.pegaso2000.FastFoodApi.model.Piatto;
import it.pegaso2000.FastFoodApi.service.PiattoService;

@Controller
public class PiattoController {
	private PiattoService service;

	@Autowired
	public PiattoController(PiattoService service) {
		super();
		this.service = service;
		
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
