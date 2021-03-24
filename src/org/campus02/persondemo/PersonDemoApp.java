package org.campus02.persondemo;

public class PersonDemoApp {

    public static void main(String[] args) {

        Person susi = new Person("Susi", "Sorglos", 33.7);
        Person max = new Person("Max", "Muster", 41.3);
        
        PersonManager pm = new PersonManager();
        //pm.add(susi);
        //pm.add(max);

        System.out.println("pm = " + pm);

        //pm.save("D:\\temp\\persons_20210324.txt");

        pm.load("D:\\temp\\persons_20210324.txt");
        System.out.println("pm = " + pm);
    }
}
