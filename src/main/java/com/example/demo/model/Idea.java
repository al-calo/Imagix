package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Idea {

    @Id
    @GeneratedValue
    String id;
    String estado;
    String persona;
    String fechaCreacion;
    String gerencia;
    String nombreIdea;
    String costoImplementacion;
    String calificacionComite;
    String comentario;

    
}
