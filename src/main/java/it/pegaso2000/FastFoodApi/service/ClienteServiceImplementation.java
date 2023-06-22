package it.pegaso2000.FastFoodApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pegaso2000.FastFoodApi.model.Cliente;
import it.pegaso2000.FastFoodApi.repo.ClienteRepository;


@Service
public class ClienteServiceImplementation implements ClienteSevice {

	private ClienteRepository crepo;
	
	@Autowired
	public ClienteServiceImplementation(ClienteRepository crepo) {
		super();
		this.crepo = crepo;
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
