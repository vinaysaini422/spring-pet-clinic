package com.saini.spring.pet.services.map;

import java.util.Set;

import com.saini.spring.pet.model.Person;
import com.saini.spring.pet.services.CrudService;

public class PersonServiceMap extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {

	@Override
	public Person save(Person object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Person> findAll() {
		return super.findAll();
	}

	@Override
	public Person findById(Long id) {
		return super.findById(id);
	}

	@Override
	Person save(Long id, Person object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Person object) {
		super.delete(object);
	}

}
