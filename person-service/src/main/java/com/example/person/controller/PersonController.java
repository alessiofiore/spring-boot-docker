package com.example.person.controller;

import com.example.person.dto.Person;
import com.example.person.exception.NotFoundException;
import com.example.person.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author alessiofiore
 */
@RestController
@Slf4j
public class PersonController {

    @Value("${instance.instance-id}")
    private String instanceId;

    @Autowired
    private PersonService service;

    @GetMapping("/{id}")
    public String getName(@PathVariable("id") Long id) {
        log.info("Operation executed by instance [{}]", instanceId);
        try {
            service.getName(id);
            return "World";
        } catch (NotFoundException e) {
            return "No name";
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(Person p) {
        return service.create(p);
    }
}
