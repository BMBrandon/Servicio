package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Salas;

public interface SalasRepositorio extends  JpaRepository<Salas, Long> {

}
