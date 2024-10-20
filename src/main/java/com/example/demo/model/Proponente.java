package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Proponente {

    @Id
    @GeneratedValue
    Long id;
    Integer cedula;
    String nombre;
    String email;
    String clave;
    String ciudad;
    Integer puntosAsignados;
    Integer puntosRedimidos;
    Integer puntosDisponibles;

    @ManyToOne
    @JoinColumn(name = "gerencia_id")
    private Gerencia gerencia;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "idea_id")
    private Idea idea;

    public Proponente() {
    }

    public Proponente(Integer cedula, String nombre, String email, String ciudad,
            Integer puntosAsignados, Integer puntosRedimidos, Integer puntosDisponibles, Gerencia gerencia, Area area,
            Cargo cargo, String telefono, Idea idea) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.ciudad = ciudad;
        this.puntosAsignados = puntosAsignados;
        this.puntosRedimidos = puntosRedimidos;
        this.puntosDisponibles = puntosDisponibles;
        this.gerencia = gerencia;
        this.area = area;
        this.cargo = cargo;
        this.telefono = telefono;
        this.idea = idea;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getPuntosAsignados() {
        return puntosAsignados;
    }

    public void setPuntosAsignados(Integer puntosAsignados) {
        this.puntosAsignados = puntosAsignados;
    }

    public Integer getPuntosRedimidos() {
        return puntosRedimidos;
    }

    public void setPuntosRedimidos(Integer puntosRedimidos) {
        this.puntosRedimidos = puntosRedimidos;
    }

    public Integer getPuntosDisponibles() {
        return puntosDisponibles;
    }

    public void setPuntosDisponibles(Integer puntosDisponibles) {
        this.puntosDisponibles = puntosDisponibles;
    }

    public Gerencia getGerencia() {
        return gerencia;
    }

    public void setGerencia(Gerencia gerencia) {
        this.gerencia = gerencia;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    

}
