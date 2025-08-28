package org.carpio.com;

import clasesprueba.Cat;
import clasesprueba.Dog;

public class MainHerencia {
    public static void main(String[] args) {
        final Dog dog = new Dog();
        dog.name = "Firulais";
        dog.owner = "Franklin";
        dog.born = "2020-01-01";
        dog.eat();
        dog.bark();
        final Cat cat = new Cat();
        cat.name = "Michi";
        cat.owner = "Carpio";
        cat.born = "2021-02-02";
        cat.eat();
        cat.meow();

        final Dog dog1 = new Dog("Rex", "Juan", "2019-03-03", "Labrador");
        dog1.eat();
        dog1.bark();
        dog1.play();

        final Cat cat1 = new Cat("Luna", "Ana", "2022-04-04", true);
        cat1.eat();
        cat1.meow();
        cat1.play();

    }
}
