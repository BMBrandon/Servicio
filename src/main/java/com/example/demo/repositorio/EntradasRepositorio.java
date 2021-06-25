package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Entradas;

public interface EntradasRepositorio extends JpaRepository<Entradas, Long> {

}
