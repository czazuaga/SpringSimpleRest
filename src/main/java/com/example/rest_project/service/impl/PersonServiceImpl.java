package com.example.rest_project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.rest_project.converter.PersonConverter;
import com.example.rest_project.entity.Person;
import com.example.rest_project.model.PersonModel;
import com.example.rest_project.repository.PersonRepository;
import com.example.rest_project.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	@Qualifier("personRepository")
	PersonRepository personRepository;

	@Autowired
	@Qualifier("personConverter")
	PersonConverter personConverter;

	@Override
	public PersonModel getPerson(int id) {
		PersonModel personModel = personConverter.person2Model(personRepository.findById(id));
		return personModel;
	}

	@Override
	public List<PersonModel> getAllPersons() {
		List<Person> persons = personRepository.findAll();
		List<PersonModel> personModels = new ArrayList<>();
		if (persons != null) {
			for (Person person : persons) {
				personModels.add(personConverter.person2Model(person));
			}
		}

		return personModels;
	}

}
