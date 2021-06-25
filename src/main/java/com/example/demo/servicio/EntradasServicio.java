package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Entradas;
import com.example.demo.repositorio.EntradasRepositorio;


@Service
public class EntradasServicio {
	@Autowired
	private EntradasRepositorio entradasRepositorio;
	
	public Entradas create(Entradas entradas) {
		return entradasRepositorio.save(entradas);
	}
	public List<Entradas>getAllEntradas(){
		return entradasRepositorio.findAll();
	}
	public void delete(Entradas entradas) {
		entradasRepositorio.delete(entradas);
	}
	public Entradas FindEntradas(Long id){
		return entradasRepositorio.findById(id).get();
		
	}
	public Entradas editarEntradas(Entradas entradas){
		return entradasRepositorio.save(entradas);
		
	}
}
