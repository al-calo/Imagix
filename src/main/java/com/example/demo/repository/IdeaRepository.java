package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Idea;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long> {

}
