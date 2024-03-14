package ru.efimov.hibernatedemo.entity;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}