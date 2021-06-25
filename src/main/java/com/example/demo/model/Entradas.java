package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table  
public class Entradas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String asientos;
	public String codigo;
	public Double precio;
	@ManyToOne
	private Proyecciones proyecciones;
	@ManyToOne
	private Persona persona;
	@ManyToOne
	private Salas salas;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAsientos() {
		return asientos;
	}
	public void setAsientos(String asientos) {
		this.asientos = asientos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Proyecciones getProyecciones() {
		return proyecciones;
	}
	public void setProyecciones(Proyecciones proyecciones) {
		this.proyecciones = proyecciones;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Salas getSalas() {
		return salas;
	}
	public void setSalas(Salas salas) {
		this.salas = salas;
	}
	
}
