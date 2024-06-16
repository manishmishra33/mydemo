package com.java.mydemo.Service;

import com.java.mydemo.Entity.Person;
import com.java.mydemo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersoneService {

    @Autowired
    UserRepository userRepository;

    public List<Person> getAllPersone(){
        return userRepository.findAll();
    }

    public Optional<Person> getPersonByID(Long id){
        return  userRepository.findById(id);

    }
    public Person createPerson(Person person ){
        return userRepository.save(person);
    }
}
