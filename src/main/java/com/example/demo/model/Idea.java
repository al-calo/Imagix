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
    private Long id;

    private String descripcionIdea;

    private String descripcionProblema;

    private Date fecha;

    private String nombre;

    @OneToMany(mappedBy = "idea", cascade = CascadeType.ALL)
    private List<Proponente> proponentes;

    public Idea() {

    }

    public Idea(String descripcionIdea, String descripcionProblema, Date fecha, String nombre) {
        this.descripcionIdea = descripcionIdea;
        this.descripcionProblema = descripcionProblema;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    // Getter y Setter para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter y Setter para descripcionIdea
    public String getDescripcionIdea() {
        return descripcionIdea;
    }

    public void setDescripcionIdea(String descripcionIdea) {
        this.descripcionIdea = descripcionIdea;
    }

    // Getter y Setter para descripcionProblema
    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    // Getter y Setter para fecha
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Proponente> getProponentes() {
        return proponentes;
    }

    public void setProponentes(List<Proponente> proponentes) {
        this.proponentes = proponentes;
    }

}
