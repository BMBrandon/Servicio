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

import com.example.demo.model.Entradas;

import com.example.demo.servicio.EntradasServicio;


@RestController
@RequestMapping(value= "/api/entradas/")
@CrossOrigin(origins="*")
public class EntradasRest {
	@Autowired
	private EntradasServicio entServicio;
	@PostMapping
	public ResponseEntity<Entradas> guardar(@RequestBody Entradas entradas){
		return new ResponseEntity<Entradas>(entServicio.create(entradas), HttpStatus.CREATED);
	}
	@GetMapping
	private ResponseEntity<List<Entradas>>listarEntradas() {
		return new ResponseEntity<List<Entradas>>(entServicio.getAllEntradas(),HttpStatus.OK);
	}
	@GetMapping("{id}")
	private ResponseEntity<Entradas>buscarEntradas(@PathVariable("id")Long id){
		return new ResponseEntity<Entradas>(entServicio.FindEntradas(id),HttpStatus.OK);
	}
	@DeleteMapping
	private ResponseEntity<String>eliminarCliente(@RequestBody Entradas entradas){
		entServicio.delete(entradas);
		return new ResponseEntity<String>("Correcto",HttpStatus.OK);
	}
	@PutMapping(path="/{id}")
	private Entradas modificarEntradas(@RequestBody Entradas entradas, @PathVariable("id")String id){
		entradas.setId(Long.parseLong(id));
		return entServicio.editarEntradas(entradas);
	}
}
