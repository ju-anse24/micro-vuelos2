package com.micro_vuelos.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Data;

@Data
@Entity
public class Pasajero implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8529993442155113045L;
	@Id
	private Long idPasajero;
	@Column
	private String nombre;
	@Column
	private String edad;
	@Column
	private String telefono;
	@Column
	private String email;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "pasajeros")
	private Set<Vuelo> vuelos;
	
	public Pasajero() {
		super();
	}
	public Pasajero(Long idPasajero, String nombre, String edad, String telefono, String email, Set<Vuelo> vuelos) {
		super();
		this.idPasajero = idPasajero;
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
		this.vuelos = vuelos;
	}


	public Long getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(Long idPasajero) {
		this.idPasajero = idPasajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(Set<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	@Override
	public String toString() {
		return "Pasajero [idPasajero=" + idPasajero + ", nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono
				+ ", email=" + email + ", vuelos=" + vuelos + "]";
	}

	
}
