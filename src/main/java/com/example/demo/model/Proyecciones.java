package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table 
public class Proyecciones {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String fecha;
	public int asientos;
	@ManyToOne
	private Peliculas peliculas;
	@ManyToOne
	private Salas salas;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	public Peliculas getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(Peliculas peliculas) {
		this.peliculas = peliculas;
	}
	public Salas getSalas() {
		return salas;
	}
	public void setSalas(Salas salas) {
		this.salas = salas;
	}
	
	
}
