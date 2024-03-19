package ru.efimov.hibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.efimov.hibernatedemo.entity.Person;

import java.util.List;
import java.util.Optional;


@Repository
public interface HibRepository extends JpaRepository<Person, Integer> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeLessThanOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}