package com.example.rest_project.converter;

import org.springframework.stereotype.Component;

import com.example.rest_project.entity.Person;
import com.example.rest_project.model.PersonModel;

@Component("personConverter")
public class PersonConverter {

	public PersonModel person2Model(Person person) {
		PersonModel personModel = new PersonModel();

		if (person != null) {
			personModel.setId(person.getId());
			personModel.setFirstName(person.getFirstName());
			personModel.setLastName(person.getLastName());
			personModel.setAge(person.getAge());
		}
		return personModel;
	}

	public Person personModel2Person(PersonModel personModel) {
		Person person = new Person();

		if (personModel != null) {
			person.setId(personModel.getId());
			person.setFirstName(personModel.getFirstName());
			person.setLastName(personModel.getLastName());
			person.setAge(personModel.getAge());
		}
		return person;
	}

}
