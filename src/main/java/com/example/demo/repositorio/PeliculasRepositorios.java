package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Peliculas;

public interface PeliculasRepositorios extends JpaRepository<Peliculas, Long>{

}
