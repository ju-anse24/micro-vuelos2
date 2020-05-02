package com.micro_vuelos.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Entity
@Table(name = "Vuelo")
public class Vuelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "native", strategy = "native")
	private Long idVuelo;
	@Column
	private String origen;
	@Column
	private String destino;
	@Column
	private String fecha;
		
	@ManyToMany
	@JoinTable(name = "vuelo_pasajero",
    joinColumns = { @JoinColumn(name = "FK_idVuelo") },
    inverseJoinColumns = { @JoinColumn(name = "FK_idPasajero") 
    })
	private Set <Pasajero> pasajeros;

	public Long getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Set<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Set<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", origen=" + origen + ", destino=" + destino + ", fecha=" + fecha
				+ ", pasajeros=" + pasajeros + "]";
	}

	public Vuelo(Long idVuelo, String origen, String destino, String fecha, Set<Pasajero> pasajeros) {
		super();
		this.idVuelo = idVuelo;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.pasajeros = pasajeros;
	}

	public Vuelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
