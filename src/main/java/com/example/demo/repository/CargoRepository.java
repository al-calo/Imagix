package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Long, Cargo> {
    
}
