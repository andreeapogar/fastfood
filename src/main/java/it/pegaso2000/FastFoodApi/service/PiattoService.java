package it.pegaso2000.FastFoodApi.service;

import java.util.List;

import it.pegaso2000.FastFoodApi.model.Piatto;

public interface PiattoService {

	List<Piatto> findAll();
	Piatto findById(int id);
	Piatto save(Piatto piatto);
	boolean delete(int id);
		
	
}
