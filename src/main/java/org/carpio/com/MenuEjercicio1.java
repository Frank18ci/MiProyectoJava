package org.carpio.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuEjercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcion;
        do{
            System.out.println("Bienvenido al sistema de menús");
            System.out.println("1. Curso Java");
            System.out.println("2. Fecha y hora");
            System.out.println("3. Sesión");
            System.out.println("4. Operacion de dos numeros");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Buen dia estas en el curso de Java");
                    break;
                case 2:
                    System.out.println("Hoy estamos " + LocalDateTime.now());
                    break;
                case 3:
                    System.out.println("Estamos en la sesión 2 de Java");
                    break;
                case 4:
                    Integer operacion;
                    Boolean resultExit = false;
                    do{
                        if(resultExit) break;
                        System.out.println("Ingrese el primer número:");
                        Double num1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo número:");
                        Double num2 = scanner.nextDouble();
                        System.out.println("Seleccione la operación a realizar:");
                        System.out.println("1. Suma");
                        System.out.println("2. Resta");
                        System.out.println("3. Multiplicación");
                        System.out.println("4. División");
                        System.out.println("5. Volver al menú principal");
                        operacion = scanner.nextInt();
                        scanner.nextLine();
                        switch (operacion) {
                            case 1:
                                System.out.println("La suma es: " + (num1 + num2));
                                resultExit = questionAboutOut(scanner);
                                break;
                            case 2:
                                System.out.println("La resta es: " + (num1 - num2));
                                resultExit = questionAboutOut(scanner);
                                break;
                            case 3:
                                System.out.println("La multiplicación es: " + (num1 * num2));
                                resultExit = questionAboutOut(scanner);
                                break;
                            case 4:
                                if (num2 != 0) {
                                    System.out.println("La división es: " + (num1 / num2));
                                    resultExit = questionAboutOut(scanner);
                                } else {
                                    System.out.println("Error: División por cero no está permitida.");
                                }
                                break;
                            case 5:
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default:
                                System.out.println("Operación no válida. Por favor, seleccione una opción del 1 al 4.");
                                break;
                        }
                    }while (operacion != 5);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
                    break;
            }

        } while (opcion != 5);
        System.out.println();
    }
    private static Boolean questionAboutOut(Scanner scanner){
        System.out.println("¿Desea salir del sistema? (s/n)");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("s");
    }
}
