package com.example.rest_project.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest_project.entity.Person;

@Repository("personRepository")
public interface PersonRepository extends JpaRepository<Person, Serializable>{

	public abstract Person findById(int id);
	
}
