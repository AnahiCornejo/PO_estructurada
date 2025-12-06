package com.javatutor;

import java.util.Scanner;

// No borrar el paquete o el codigo nunca va funcionar

// Tampoco la clase, siempre debe ser App
public class App {
    public static void main(String[] args) {
        // Tu codigo va aqui
        Scanner scanner = new Scanner(System.in);

        // Leer la categoría y el monto
        System.out.print("Ingrese la categoría (1-4): ");
        int CATEGORIA = scanner.nextInt();

        System.out.print("Ingrese el monto: ");
        double MONTO = scanner.nextDouble();

        // Determinar el descuento según la categoría
        double DESCUENTO_PORCIENTO;
        switch (CATEGORIA) {
            case 1:
                DESCUENTO_PORCIENTO = 35;
                break;
            case 2:
                DESCUENTO_PORCIENTO = 22;
                break;
            case 3:
                DESCUENTO_PORCIENTO = 15;
                break;
            case 4:
                DESCUENTO_PORCIENTO = 5;
                break;
            default:
                DESCUENTO_PORCIENTO = 0;
        }

        // Calcular el descuento
        double DESCUENTO = MONTO * DESCUENTO_PORCIENTO / 100;

        // Calcular el monto a pagar
        double MONTO_FINAL = MONTO - DESCUENTO;

        // Imprimir resultados
        System.out.println("Categoría: " + CATEGORIA);
        System.out.println("Monto original: " + MONTO);
        System.out.println("Porcentaje de descuento: " + DESCUENTO_PORCIENTO + "%");
        System.out.println("Descuento: " + DESCUENTO);
        System.out.println("Monto final: " + MONTO_FINAL);

        scanner.close();
    }
}
