package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Regional;

@Repository
public interface RegionalRepository extends JpaRepository<Long, Regional> {
    
}
