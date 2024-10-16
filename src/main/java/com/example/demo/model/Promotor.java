package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Promotor {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Cargo cargo;

    private Gerencia gerencia;

    private Regional regional;

    public Promotor() {
    }

    public Promotor(String name, Cargo cargo, Gerencia gerencia, Regional regional) {
        this.name = name;
        this.cargo = cargo;
        this.gerencia = gerencia;
        this.regional = regional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Gerencia getGerencia() {
        return gerencia;
    }

    public void setGerencia(Gerencia gerencia) {
        this.gerencia = gerencia;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

}
