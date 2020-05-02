package com.micro_vuelos.service;

import java.util.List;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro_vuelos.entity.Pasajero;
import com.micro_vuelos.entity.Vuelo;
import com.micro_vuelos.interfaces.IVuelo;
import com.micro_vuelos.repositoy.IVueloRepo;

@Service
public class VueloService implements IVuelo {
		
	@Autowired
	private IVueloRepo repo;
	
	@Override
	public Vuelo save(Vuelo v) {
		
		return repo.save(v);
	}
	@Override
	public List<Vuelo> listar() {
		
		return repo.findAll();
	}
	
	public Set<Pasajero> listarUsuarios(Long idVuelo) {
		Vuelo vuelo =  repo.findById(idVuelo).get();
		return vuelo.getPasajeros();
	}
	
}
