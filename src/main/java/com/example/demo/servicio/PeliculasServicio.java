package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Peliculas;
import com.example.demo.repositorio.PeliculasRepositorios;


@Service
public class PeliculasServicio {
	@Autowired
	private PeliculasRepositorios peliculasRepositorio;
	
	public Peliculas create(Peliculas peliculas) {
		return peliculasRepositorio.save(peliculas);
	}
	public List<Peliculas>getAllPeliculas(){
		return peliculasRepositorio.findAll();
	}
	public void delete(Peliculas peliculas) {
		peliculasRepositorio.delete(peliculas);
	}
	public Peliculas FindPeliculas(Long id){
		return peliculasRepositorio.findById(id).get();
		
	}
	public Peliculas editarPeliculas(Peliculas peliculas){
		return peliculasRepositorio.save(peliculas);
		
	}
}
