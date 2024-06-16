package com.java.mydemo.Service;

import com.java.mydemo.Entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonInfoService {

    List<Person> getAllPersone();

    Optional<Person> getPersonByID(Long id);

    Person createPerson(Person person );

}
