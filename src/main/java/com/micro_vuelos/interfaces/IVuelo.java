package com.micro_vuelos.interfaces;


import java.util.List;

import com.micro_vuelos.entity.Vuelo;

public interface IVuelo  {
	public List<Vuelo>listar();
	public Vuelo save(Vuelo v);
	
}
