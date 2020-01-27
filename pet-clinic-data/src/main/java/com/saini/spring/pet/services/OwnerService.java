package com.saini.spring.pet.services;

import java.util.List;

import com.saini.spring.pet.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
 }
