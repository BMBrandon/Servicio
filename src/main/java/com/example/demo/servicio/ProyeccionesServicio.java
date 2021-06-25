package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Proyecciones;

import com.example.demo.repositorio.ProyeccionesRepositorio;

@Service
public class ProyeccionesServicio {
	@Autowired
	private ProyeccionesRepositorio proyeccionesRepositorio;
	
	public Proyecciones create(Proyecciones proyecciones) {
		return proyeccionesRepositorio.save(proyecciones);
	}
	public List<Proyecciones>getAllProyecciones(){
		return proyeccionesRepositorio.findAll();
	}
	public void delete(Proyecciones proyecciones) {
		proyeccionesRepositorio.delete(proyecciones);
	}
	public Proyecciones FindProyecciones(Long id){
		return proyeccionesRepositorio.findById(id).get();
		
	}
	public Proyecciones editarProyecciones(Proyecciones proyecciones){
		return proyeccionesRepositorio.save(proyecciones);
		
	}
}
