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
import com.example.demo.model.Salas;
import com.example.demo.servicio.ProyeccionesServicio;
import com.example.demo.servicio.SalasServicio;

@RestController
@RequestMapping(value= "/api/salas/")
@CrossOrigin(origins="*")
public class SalasRest {
	@Autowired
	private SalasServicio salaServicio;
	@PostMapping
	public ResponseEntity<Salas> guardar(@RequestBody Salas salas){
		return new ResponseEntity<Salas>(salaServicio.create(salas), HttpStatus.CREATED);
	}
	@GetMapping
	private ResponseEntity<List<Salas>>listarSalas() {
		return new ResponseEntity<List<Salas>>(salaServicio.getAllSalas(),HttpStatus.OK);
	}
	@GetMapping("{id}")
	private ResponseEntity<Salas>buscarSalas(@PathVariable("id")Long id){
		return new ResponseEntity<Salas>(salaServicio.FindSalas(id),HttpStatus.OK);
	}
	@DeleteMapping
	private ResponseEntity<String>eliminarCliente(@RequestBody Salas salas){
		salaServicio.delete(salas);
		return new ResponseEntity<String>("Correcto",HttpStatus.OK);
	}
	@PutMapping(path="/{id}")
	private Salas modificarSalas(@RequestBody Salas salas, @PathVariable("id")String id){
		salas.setId(Long.parseLong(id));
		return salaServicio.editarSalas(salas);
	}
}
