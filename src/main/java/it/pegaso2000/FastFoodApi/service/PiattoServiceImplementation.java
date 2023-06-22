package it.pegaso2000.FastFoodApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pegaso2000.FastFoodApi.model.Piatto;
import it.pegaso2000.FastFoodApi.repo.PiattoRepository;

@Service
public class PiattoServiceImplementation implements PiattoService{

	private PiattoRepository prepo;
	
	@Autowired
	public PiattoServiceImplementation(PiattoRepository prepo) {
		super();
		this.prepo = prepo;
	}

	@Override
	public List<Piatto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Piatto findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Piatto save(Piatto piatto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
