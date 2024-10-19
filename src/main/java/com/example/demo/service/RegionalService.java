package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Regional;

@Service
public interface RegionalService {

    public Regional findById(Long id);

    public List<Regional> findAll();

    public Regional findByNombre(String nombre);
}
