/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Controlador.GestionLenguaje;
import Modelo.LenguajeProgramacion;
import java.util.Scanner;

/**
 *
 * @author RICARDO
 */
public class SistemaRegistro {
public static void main(String[] args) {
       
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        GestionLenguaje gestion = new GestionLenguaje();
        int opcion;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Agregar lenguaje");
            System.out.println("2. Buscar lenguaje");
            System.out.println("3. Eliminar lenguaje");
            System.out.println("4. Imprimir lenguajes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Año de creacion: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Caracteristica principal: ");
                    String caracteristica = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Utilizacion: ");
                    String utilizacion = scanner.nextLine();
                    gestion.agregarLenguaje(anio, caracteristica, nombre, utilizacion);
                    System.out.println("Lenguaje agregado con exito.");
                }
                case 2 -> {
                    System.out.print("Nombre del lenguaje a buscar: ");
                    String nombre = scanner.nextLine();
                    LenguajeProgramacion lenguaje = gestion.buscarLenguaje(nombre);
                    if (lenguaje != null) {
                        System.out.println("Lenguaje encontrado: " + lenguaje);
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Nombre del lenguaje a eliminar: ");
                    String nombre = scanner.nextLine();
                    if (gestion.eliminarLenguaje(nombre)) {
                        System.out.println("Lenguaje eliminado con exito.");
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                }
                case 4 -> gestion.imprimirLenguajes();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);
    }    
}