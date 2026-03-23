//Programa que muestra un menú para realizar tres operaciones: generar la tabla de multiplicar de un número, determinar si es par o impar y mostrar la serie de Fibonacci.
//Jose Angel Romero Cordova
//Viernes 13 de Marzo de 2026

import java.util.Scanner;

public class MenuOperaciones {

    public static void main(String[] args) {

        // Scanner para que el usuario ingrese los valores
        Scanner in = new Scanner(System.in);

        int opcion;
        int numero;

        do {

            // Mostrar menú
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tabla de multiplicar");
            System.out.println("2. Número par o impar");
            System.out.println("3. Fibonacci");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = in.nextInt();

            switch (opcion) {

                case 1:
                    // Tabla de multiplicar
                    System.out.print("Ingrese un número: ");
                    numero = in.nextInt();

                    System.out.println("Tabla de multiplicar del " + numero);

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    break;

                case 2:
                    // Determinar si es par o impar
                    System.out.print("Ingrese un número: ");
                    numero = in.nextInt();

                    if (numero % 2 == 0) {
                        System.out.println("El número es PAR");
                    } else {
                        System.out.println("El número es IMPAR");
                    }
                    break;

                case 3:
                    // Serie de Fibonacci
                    System.out.print("Ingrese la cantidad de números Fibonacci: ");
                    numero = in.nextInt();

                    int a = 0;
                    int b = 1;

                    System.out.println("Serie de Fibonacci:");

                    for (int i = 0; i < numero; i++) {
                        System.out.print(a + " ");

                        int siguiente = a + b;
                        a = b;
                        b = siguiente;
                    }

                    System.out.println();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");

            }

        } while (opcion != 4);
    }
}