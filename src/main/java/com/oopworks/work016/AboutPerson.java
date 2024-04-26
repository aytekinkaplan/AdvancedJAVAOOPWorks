package com.oopworks.work016;

public class AboutPerson {
    private Person person;
    private double salary;

    public AboutPerson(Person person, double salary) {
        this.person = person;
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}