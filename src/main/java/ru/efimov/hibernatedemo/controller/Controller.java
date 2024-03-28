package ru.efimov.hibernatedemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.efimov.hibernatedemo.entity.Person;
import ru.efimov.hibernatedemo.repository.HibRepository;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class Controller {

    HibRepository repository;

    @GetMapping("/persons/by-city")
        public List<Person> getPersons(@RequestParam String city){
        return repository.findByCityOfLiving(city);
    }
    @GetMapping("/persons/by-age")
    public List<Person> findByAgeLessThanOrderByAge(@RequestParam int age){
        return repository.findByAgeLessThanOrderByAge(age);
    }
    @GetMapping("/persons/by-name-and-surname")
    public Optional<Person> findByNameAndSurname(@RequestParam String name, @RequestParam String surname){
        return repository.findByNameAndSurname(name,surname);
    }
    @GetMapping("/persons/all")
    public List<Person> findAll() {
        return repository.findAll();
    }

}
