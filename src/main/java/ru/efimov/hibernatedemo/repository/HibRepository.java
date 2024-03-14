package ru.efimov.hibernatedemo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.efimov.hibernatedemo.entity.Person;

import java.util.List;

@Repository
public class HibRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from Person p where p.cityOfLiving = :city order by p.cityOfLiving", Person.class).setParameter("city", city).getResultList();
    }
}