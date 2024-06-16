package com.java.mydemo.Controller;

import com.java.mydemo.Entity.Person;
import com.java.mydemo.Service.PersoneServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/welcome")
public class MyDemoController {

    @Autowired
    PersoneServiceImp personeService;

    @GetMapping("/data/get")
    public List<Person> getData(){
        return personeService.getAllPersone();
    }
    @GetMapping("getPersone/{id}")
    public Optional<Person> getPersoneById(@PathVariable Long id){
        return personeService.getPersonByID(id);
    }
    @PostMapping("/create/person")
    public Person createPersone(@RequestBody Person person ){
        return personeService.createPerson(person);
    }

}
