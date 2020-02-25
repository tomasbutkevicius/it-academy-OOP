package com.swedbank.academy.demoserver.person;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/persons")
public class PersonController {
    private static Logger log = LoggerFactory.getLogger(PersonController.class);


    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){this.personService = personService;}


    @GetMapping
    public ResponseEntity<List<Person>> getPersons(){
        List<Person> list = personService.getAll();
        return new ResponseEntity<List<Person>>(list, HttpStatus.OK);
    }

}
