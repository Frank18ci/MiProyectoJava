package org.carpio.com;

public class Main {



    // Main method to run the application
    public static void main(String[] args)
    {
        final Integer age = 24;
        Double number = 2.52;
        Double number2 = 8.5;
        final Integer age2 = 15;
        Double number3 = number + number2;
        String name = "Carpio";
        final Boolean isActive = false;
        if(age >= 24){
            System.out.println("La edad de: " + name + " " + age);
        } else {
            System.out.println("El usuario no esta activo");
        }
        System.out.println("La edad de: " + name + " " + 24);
        name = "Juan";
        if('b' < 'a'){
            System.out.println("La edad de: " + name + " " + age2);
        } else {
            System.out.println("El usuario no esta activo");
        }
        System.out.println("La edad de: " + name + " " + 24);
        System.out.println("La suma de double de: " + number3);

        final Integer suma = 18 + 16;
        System.out.println("La suma es: " + suma);
        final Integer resta = 18 - 16;
        System.out.println("La resta es: " + resta);
        final Integer multi = 18 * 16;
        System.out.println("La multiplicacion es: " + multi);
        final Float divi = 18F / 16F;
        System.out.println("La division es: " + divi);
        final Integer mod = 18 % 16;
        System.out.println("El modulo es: " + mod);

        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de i es: " + i);
        }
    }
}