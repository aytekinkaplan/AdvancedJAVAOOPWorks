package com.oopworks.work016;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    public static void controller() {
        List<AboutPerson> list = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("John", 25, "Male", "123 Main St"));
        personList.add(new Person("Jane", 30, "Female", "456 Main St"));
        personList.add(new Person("Bob", 40, "Male", "789 Main St"));

        for (Person person : personList) {
            list.add(new AboutPerson(person, 50000.0));
        }

        for (AboutPerson aboutPerson : list) {
            System.out.println("----------------------------------------------------------");
            System.out.println(aboutPerson.getPerson().getName());
            System.out.println(aboutPerson.getPerson().getAge());
            System.out.println(aboutPerson.getPerson().getGender());
            System.out.println(aboutPerson.getSalary());
            System.out.println(aboutPerson.getPerson().getAddress());
            System.out.println("----------------------------------------------------------");
        }

    }
}
