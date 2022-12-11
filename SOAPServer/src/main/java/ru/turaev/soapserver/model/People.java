package ru.turaev.soapserver.model;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private String name;
    private String surname;
    private Date dateOfBirth;
    private List<People> children;
    private Gender gender;
    private boolean hasWork;
    private int countOfCars;
    private double height;
}
