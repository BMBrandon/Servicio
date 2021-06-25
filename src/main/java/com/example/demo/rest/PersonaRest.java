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

import com.example.demo.model.Persona;
import com.example.demo.servicio.PersonaServicio;

@RestController
@RequestMapping(value= "/api/persona/")
@CrossOrigin(origins="*")
public class PersonaRest {
	@Autowired
	private PersonaServicio perServicio;
	@PostMapping
	public ResponseEntity<Persona> guardar(@RequestBody Persona persona){
		return new ResponseEntity<Persona>(perServicio.create(persona), HttpStatus.CREATED);
	}
	@GetMapping
	private ResponseEntity<List<Persona>>listarPersonas() {
		return new ResponseEntity<List<Persona>>(perServicio.getAllPersona(),HttpStatus.OK);
	}
	@GetMapping("{id}")
	private ResponseEntity<Persona>buscarPersona(@PathVariable("id")Long id){
		return new ResponseEntity<Persona>(perServicio.FindPersona(id),HttpStatus.OK);
	}
	@DeleteMapping
	private ResponseEntity<String>eliminarCliente(@RequestBody Persona persona){
		perServicio.delete(persona);
		return new ResponseEntity<String>("Correcto",HttpStatus.OK);
	}
	@PutMapping(path="/{id}")
	private Persona modificarCliente(@RequestBody Persona persona, @PathVariable("id")String id){
		persona.setId(Long.parseLong(id));
		return perServicio.editarPersona(persona);
	}
}
