package com.spring.exercise.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("hiding")
public interface ActorRepository<Actor> extends JpaRepository<Actor, Long>{
	
	 public com.spring.exercise.model.Actor findByName(String name);

	 Optional<Actor> findById(Long id);

	 List<Actor> findAll();
	 
	 void deleteById(Long id);
}