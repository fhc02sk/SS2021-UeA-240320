package org.campus02.persondemo;

import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.age, age) == 0
                && Objects.equals(firstname, person.firstname)
                && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age);
    }
}
