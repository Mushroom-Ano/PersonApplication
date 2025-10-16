package com.qa.PersonProject.entities;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
public class Person {


    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person() {
        this.firstname = "Unknown firstname";
        this.lastname = "Unknown lastname";
        this.age = 18;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Size(min=2, max=30)
    private String firstname;

    @Size(min=2, max=30)
    private String lastname;

    @Min(18)
    @Max(75)
    private int  age;


}
