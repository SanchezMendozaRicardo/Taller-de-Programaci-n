/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.LenguajeProgramacion;
/**
 *
 * @author RICARDO
 */
public class GestionLenguaje {
     private LenguajeProgramacion[] arregloLenguajes;
    private int contadorLenguajes = 0;
    private static final int FACTOR_CRECIENTO = 2;

    public GestionLenguaje() {
        arregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIENTO];
    }

    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        if (contadorLenguajes >= arregloLenguajes.length) {
            expandirArreglo();
        }
        arregloLenguajes[contadorLenguajes++] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
    }

    private void expandirArreglo() {
        LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[arregloLenguajes.length + FACTOR_CRECIENTO];
        System.arraycopy(arregloLenguajes, 0, nuevoArreglo, 0, arregloLenguajes.length);
        arregloLenguajes = nuevoArreglo;
    }

    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equals(nombre)) {
                return arregloLenguajes[i];
            }
        }
        return null;
    }

    public boolean eliminarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equals(nombre)) {
                arregloLenguajes[i] = arregloLenguajes[--contadorLenguajes];
                return true;
            }
        }
        return false;
    }

    public LenguajeProgramacion[] getArregloLenguajes() {
        return arregloLenguajes;
    }

    public void imprimirLenguajes() {
        for (int i = 0; i < contadorLenguajes; i++) {
            System.out.println(arregloLenguajes[i]);
        }
    }
}