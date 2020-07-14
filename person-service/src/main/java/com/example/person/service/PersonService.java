package com.example.person.service;

import com.example.person.dto.Person;
import com.example.person.exception.NotFoundException;
import com.example.person.model.PersonEntity;
import com.example.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author alessiofiore
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public String getName(Long id) throws NotFoundException {
        Optional<PersonEntity> opt = repository.findById(id);
        if(opt.isPresent()) {
            return opt.get().getName();
        } else {
            throw new NotFoundException();
        }
    }

    public Person create(Person p) {
        PersonEntity e = new PersonEntity();
        e.setName(p.getName());
        e = repository.save(e);
        Person res = new Person(e.getId(), e.getName());
        return res;
    }
}
