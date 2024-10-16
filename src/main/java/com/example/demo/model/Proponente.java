package com.example.demo.model;

public class Proponente {

    private Long id;
    private String name;
    private Long cedula;
    private String email;
    private String ciudad;
    private Gerencia gerencia;
    private Area area;
    private Cargo cargo;
    private Long telefono;

    public Proponente() {
    }

    public Proponente(String name, Long cedula, String email, String ciudad, Gerencia gerencia, Area area, Cargo cargo,
            Long telefono) {
        this.name = name;
        this.cedula = cedula;
        this.email = email;
        this.ciudad = ciudad;
        this.gerencia = gerencia;
        this.area = area;
        this.cargo = cargo;
        this.telefono = telefono;
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

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

}
