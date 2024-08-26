/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletadepago;

/**
 *
 * @author RICARDO
*/ import java.util.Scanner;
public class BoletaDePago {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el monto subtotal al usuario
        System.out.print("Ingrese el monto subtotal: ");
        double subtotal = scanner.nextDouble();
        
        // Solicitar el porcentaje de descuento al usuario
        System.out.print("Ingrese el porcentaje de descuento (0-100): ");
        double porcentajeDescuento = scanner.nextDouble();
        
        // Validar el porcentaje de descuento
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            System.out.println("Porcentaje de descuento no válido. Debe estar entre 0 y 100.");
            scanner.close();
            return;
        }
        
        // Calcular el descuento y el total
        double descuento = (subtotal * porcentajeDescuento) / 100;
        double total = subtotal - descuento;

        // Mostrar la boleta de pago
        System.out.println("\n--- BOLETA DE PAGO ---");
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("Total a Pagar: $%.2f%n", total);
        System.out.println("------------------------");
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
