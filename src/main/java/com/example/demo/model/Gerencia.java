package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Gerencia {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    public Gerencia() {
    }

    public Gerencia(String nombre) {
        this.nombre = nombre;
    }

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

}
