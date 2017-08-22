package com.example.rest_project.service;

import java.util.List;

import com.example.rest_project.model.PersonModel;

public interface PersonService {

	public PersonModel getPerson(int id);

	public List <PersonModel> getAllPersons();
}
