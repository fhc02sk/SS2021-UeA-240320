package org.campus02.persondemo;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstname;
    private String lastname;
    private double age;

    public Person(String firstname, String lastname, double age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
