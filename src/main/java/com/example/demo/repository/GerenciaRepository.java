package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Gerencia;

public interface GerenciaRepository extends JpaRepository<Gerencia, Long> {

    Gerencia findByNombre(String nombre);

}
