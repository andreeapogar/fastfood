package it.pegaso2000.FastFoodApi.service;

import java.util.List;

import it.pegaso2000.FastFoodApi.model.Cliente;

public interface ClienteSevice {
	List<Cliente> findAll();
	Cliente findById(int id);
	Cliente save(Cliente cliente);
	boolean delete(int id);

}
