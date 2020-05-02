package com.micro_vuelos.repositoy;


import org.springframework.data.jpa.repository.JpaRepository;

import com.micro_vuelos.entity.Vuelo;


public interface IVueloRepo extends JpaRepository <Vuelo, Long>{
	
}
