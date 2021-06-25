package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repositorio.PersonaRepositorio;

@Service
public class PersonaServicio {
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	public Persona create(Persona per) {
		return personaRepositorio.save(per);
	}
	public List<Persona>getAllPersona(){
		return personaRepositorio.findAll();
	}
	public void delete(Persona per) {
		personaRepositorio.delete(per);
	}
	public Persona FindPersona(Long id){
		return personaRepositorio.findById(id).get();
		
	}
	public Persona editarPersona(Persona persona){
		return personaRepositorio.save(persona);
		
	}
}
