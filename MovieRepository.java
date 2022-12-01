package com.spring.exercise.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.exercise.model.Movie;

public interface MovieRepository  extends JpaRepository<Movie, Long> {
	  
    public Movie findByTitle(String title);

    Optional<Movie> findById(Long id);

    List<Movie> findAll();
    
    void deleteById(Long id);
}