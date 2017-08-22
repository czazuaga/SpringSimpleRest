package com.example.rest_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_project.model.PersonModel;
import com.example.rest_project.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	@Qualifier("personService")
	PersonService personService;
	
	@GetMapping("/all")
	private List<PersonModel> getAllPersons(){
		return personService.getAllPersons();
	}
	
	@GetMapping("{id}")
	private PersonModel getPerson (@PathVariable("id") int id) {
		return personService.getPerson(id);
	}
	
	
	
}
