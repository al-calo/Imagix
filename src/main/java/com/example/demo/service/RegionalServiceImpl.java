package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Regional;
import com.example.demo.repository.RegionalRepository;

@Service
public class RegionalServiceImpl implements RegionalService {

    @Autowired
    private RegionalRepository regionalRepository;

    @Override
    public Regional findById(Long id) {
        return regionalRepository.findById(id).get();
    }

    @Override
    public List<Regional> findAll() {
        return regionalRepository.findAll();
    }

    @Override
    public Regional findByNombre(String nombre) {
        return regionalRepository.findByNombre(nombre);
    }

}
