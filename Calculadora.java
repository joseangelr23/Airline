//Programa de una calculadora basica, puedes sumar, restar, multiplicar y dividir.
//Jose Angel Romero Cordova
//Viernes 13 de Marzo de 2026


import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        // Scanner para que el usuario ingrese los valores
        Scanner in = new Scanner(System.in);

        int numero1;
        int numero2;
        int opcion;
        int resultado;

        // Menú de opciones
        System.out.println("===== CALCULADORA BASICA =====");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Seleccione una opción: ");
        opcion = in.nextInt();

        // Solicitar números al usuario
        System.out.print("Ingrese el primer número: ");
        numero1 = in.nextInt();

        System.out.print("Ingrese el segundo número: ");
        numero2 = in.nextInt();

        switch(opcion) {

            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado de la suma: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado de la resta: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;

            case 4:
                // Validación para evitar división entre cero
                if(numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }
}