package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Salas;
import com.example.demo.repositorio.SalasRepositorio;

@Service
public class SalasServicio {
	@Autowired
	private SalasRepositorio salasRepositorio;
	
	public Salas create(Salas salas) {
		return salasRepositorio.save(salas);
	}
	public List<Salas>getAllSalas(){
		return salasRepositorio.findAll();
	}
	public void delete(Salas salas) {
		salasRepositorio.delete(salas);
	}
	public Salas FindSalas(Long id){
		return salasRepositorio.findById(id).get();
		
	}
	public Salas editarSalas(Salas salas){
		return salasRepositorio.save(salas);
		
	}
}
