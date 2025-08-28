package org.carpio.com;

import java.time.LocalDate;

public class Person {
    public String name;
    public String dni;
    public Integer age;
    public String gender;
    public LocalDate birthday;

    Person() {
        System.out.println("Constructor sin parametros");
    }
    Person(String name, String dni){
        System.out.println("Constructor sin parametros");
        this.name = name;
        this.dni = dni;
    }

    public Person(String name, String dni, Integer age, String gender, LocalDate birthday) {
        this.name = name;
        this.dni = dni;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
    }

    public void printPerson(){
        System.out.println("Name: " + this.name);
        System.out.println("DNI: " + this.dni);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Birthday: " + this.birthday);
    }

    void breath(){
        System.out.println("I am breathing " + this.name);
    }
    void eat(){
        System.out.println("I am eating " + this.name);
    }
    void sleep() {
        System.out.println("I am sleeping " + this.name);
    }
    void playing(Person person){
        System.out.println( this.name + " playing with " + person.name);
    }
}
