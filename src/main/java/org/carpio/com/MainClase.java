package org.carpio.com;

import java.time.LocalDate;

public class MainClase {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Franklin";
        person.dni = "12345678";
        person.age = 20;
        person.gender = "Masculino";
        person.birthday = LocalDate.of(2005, 8, 28);
        person.printPerson();
        person.breath();
        person.eat();
        person.sleep();



        final Person person1 = new Person();
        person1.name = "Carpio";
        person1.dni = "87654321";
        person1.age = 24;

        person.playing(person1);

        final Person person2 = new Person("Juan", "11223344");
        person2.printPerson();

        final Person person3 = new Person("Ana", "44332211", 30, "Femenino", LocalDate.of(1993, 5, 15));
        person3.printPerson();


    }
}
