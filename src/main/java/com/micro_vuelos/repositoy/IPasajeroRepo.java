package com.micro_vuelos.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;


import com.micro_vuelos.entity.Pasajero;


public interface IPasajeroRepo extends JpaRepository<Pasajero, Long>{
	
}	
