package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Proyecciones;
import com.example.demo.servicio.ProyeccionesServicio;

@RestController
@RequestMapping(value= "/api/`proyecciones/")
@CrossOrigin(origins="*")
public class ProyeccionesRest {
	@Autowired
	private ProyeccionesServicio proServicio;
	@PostMapping
	public ResponseEntity<Proyecciones> guardar(@RequestBody Proyecciones proyecciones){
		return new ResponseEntity<Proyecciones>(proServicio.create(proyecciones), HttpStatus.CREATED);
	}
	@GetMapping
	private ResponseEntity<List<Proyecciones>>listarProyecciones() {
		return new ResponseEntity<List<Proyecciones>>(proServicio.getAllProyecciones(),HttpStatus.OK);
	}
	@GetMapping("{id}")
	private ResponseEntity<Proyecciones>buscarPeliculas(@PathVariable("id")Long id){
		return new ResponseEntity<Proyecciones>(proServicio.FindProyecciones(id),HttpStatus.OK);
	}
	@DeleteMapping
	private ResponseEntity<String>eliminarCliente(@RequestBody Proyecciones proyecciones){
		proServicio.delete(proyecciones);
		return new ResponseEntity<String>("Correcto",HttpStatus.OK);
	}
	@PutMapping(path="/{id}")
	private Proyecciones modificarProyecciones(@RequestBody Proyecciones proyecciones, @PathVariable("id")String id){
		proyecciones.setId(Long.parseLong(id));
		return proServicio.editarProyecciones(proyecciones);
	}
}
