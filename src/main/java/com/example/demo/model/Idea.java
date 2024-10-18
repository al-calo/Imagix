package com.example.demo.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Idea {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Proponente> proponentes;

}
