package ru.efimov.hibernatedemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.efimov.hibernatedemo.entity.Person;
import ru.efimov.hibernatedemo.repository.HibRepository;
import java.util.List;

@AllArgsConstructor
@RestController
public class Controller {

    HibRepository repository;

    @GetMapping("/persons/by-city")
        public List<Person> getPersons(@RequestParam String city){
        return repository.getPersonsByCity(city);
    }
}
