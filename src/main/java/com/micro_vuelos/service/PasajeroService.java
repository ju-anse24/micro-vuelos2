package com.micro_vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro_vuelos.entity.Pasajero;
import com.micro_vuelos.interfaces.IPasajero;
import com.micro_vuelos.repositoy.IPasajeroRepo;

@Service
public class PasajeroService implements IPasajero {

	@Autowired
	private IPasajeroRepo repo;

	@Override
	public List<Pasajero> listar() {

		return repo.findAll();
	}

	@Override
	public Pasajero listarId(Long idPasajero) {

		return repo.findById(idPasajero).get();
	}

	@Override
	public Pasajero save(Pasajero u) {
		
		return repo.save(u);
	}

	@Override
	public Pasajero update(Pasajero u) {
		
		return repo.save(u);
	}

	@Override
	public void delate(Long idPasajero) {
		repo.deleteById(idPasajero);
	}
}
