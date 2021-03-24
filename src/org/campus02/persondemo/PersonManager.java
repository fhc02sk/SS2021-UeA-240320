package org.campus02.persondemo;

import java.io.*;
import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person p) {
        persons.add(p);
    }

    public void save(String path) {

        //File f = new File(path);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                                            new BufferedOutputStream(
                                                new FileOutputStream(path)))){
            oos.writeObject(persons.size());
            for (Person p : persons) {
                oos.writeObject(p);
            }

            /* size:integer;Person;Person;Person.... */
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "PersonManager{" +
                "persons=" + persons +
                '}';
    }
}
