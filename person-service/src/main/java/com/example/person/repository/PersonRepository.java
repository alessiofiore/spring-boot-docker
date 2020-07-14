package com.example.person.repository;

import com.example.person.model.PersonEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author alessiofiore
 */
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
}
