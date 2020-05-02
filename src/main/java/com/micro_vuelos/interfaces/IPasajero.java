package com.micro_vuelos.interfaces;

import java.util.List;

import com.micro_vuelos.entity.Pasajero;

public interface IPasajero {
	public List<Pasajero>listar();
	public Pasajero listarId(Long idPasajero);
	public Pasajero save(Pasajero u);
	public Pasajero update(Pasajero u);
	public void delate(Long idPasajero);
}
