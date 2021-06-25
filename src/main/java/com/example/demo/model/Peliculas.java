package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  
public class Peliculas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String nombre;
	public int minutos;
	public String fechaestreno;
	public String categoria;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public String getFechaestreno() {
		return fechaestreno;
	}
	public void setFechaestreno(String fechaestreno) {
		this.fechaestreno = fechaestreno;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
