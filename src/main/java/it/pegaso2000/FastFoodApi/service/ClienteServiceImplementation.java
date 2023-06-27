package it.pegaso2000.FastFoodApi.service;

import java.util.List;
import java.util.Optional;

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
		
		return crepo.findAll();
	}

	@Override
	public Cliente findById(int id) {
		Optional<Cliente> c= crepo.findById(id);
		if(c.isPresent())return c.get();
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
		return crepo.save(cliente);
	}

	@Override
	public boolean delete(int id) {
		Optional<Cliente> c = crepo.findById(id);
		if(c.isPresent()) {
			crepo.deleteById(id);
			return true;
		}
		return false;
	}

}
