package com.qa.PersonProject.services;

import com.qa.PersonProject.entities.Person;
import com.qa.PersonProject.entities.PersonRepo;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private PersonRepo repo;



    //private List<Person> people = new ArrayList<>();

    public PersonService(PersonRepo repo) {
        super();
        this.repo = repo;
    }

    public String health() {
        return "Testing 1, 2, 3";
    }

    public boolean addPerson(Person person) {
        Person savedPerson = repo.save(person);
        if (savedPerson.getId() >0) {
            return true;
        }
        else{
            return false;
        }}

    public List<Person> getAll() {
        return this.repo.findAll();
    }

    public Person updatePerson(Long id, Person person) {
        Optional<Person> existingOptionalPerson = this.repo.findById(id);
        Person existing = existingOptionalPerson.get();
        existing.setAge(person.getAge());
        existing.setFirstname(person.getFirstname());
        existing.setLastname(person.getLastname());
        return this.repo.save(existing);

    }

    public boolean removePerson(Long id) {
        this.repo.deleteById(id);
        boolean stillExists = this.repo.existsById(id);
        return !stillExists;

    }



}
