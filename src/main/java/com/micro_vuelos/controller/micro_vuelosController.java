package com.micro_vuelos.controller;

import java.util.List; 
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro_vuelos.entity.Pasajero;
import com.micro_vuelos.entity.Vuelo;
import com.micro_vuelos.service.PasajeroService;
import com.micro_vuelos.service.VueloService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("micro_vuelos")
public class micro_vuelosController {

	@Autowired
	private PasajeroService serviPasajero;
	private static Logger LOG = LoggerFactory.getLogger(micro_vuelosController.class);

	@GetMapping("/pasajero")
	public List<Pasajero> listarPasajero() {
		return serviPasajero.listar();
	}
	@GetMapping("/pasajero/{id}")
	public Pasajero pasajeroporID(@PathVariable(name = "id") Long idPasajero) {
		Pasajero rolid = new Pasajero();
		rolid = serviPasajero.listarId(idPasajero);
		LOG.info("Se seleciono el siguiente rol" + rolid.toString());
		return rolid;
	} 
	
	@PostMapping("/pasajero")
	public Pasajero crearPasajero(@RequestBody Pasajero u) {
		return serviPasajero.save(u);
				
	}
	@PutMapping("pasajero/{id}") 
	public Pasajero actualizarPasajero(@PathVariable(name = "id")Long idPasajero,@RequestBody Pasajero u) { 
		u.setIdPasajero(idPasajero); 	
		return serviPasajero.update(u);
	}
	@DeleteMapping("pasajero/{id}")
	public void borrarUsuario(@PathVariable(name = "id")Long idPasajero) {
		serviPasajero.delate(idPasajero);
	}
	
	@Autowired
	private VueloService serviVuelo;
	@GetMapping("/vuelo")
	public List<Vuelo> listar(){
		return serviVuelo.listar();
	}
	
	@PostMapping("/vuelo")
	public Vuelo crearVuelo(@RequestBody Vuelo v) {
		return serviVuelo.save(v);
	}
	
	@GetMapping("/vuelo/pasajero/{id}")
	public Set<Pasajero> listarUsuario(@PathVariable(name = "id") Long idVuelo) {
		
		return serviVuelo.listarUsuarios(idVuelo);
	}
	
}