/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ingrese su nombre");
    Scanner sc = new Scanner(System.in);
    String nombre;
    nombre = sc.nextLine();
    sc.close();
    System.out.println("Su nombre es: " + (nombre) );
    }
}
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo
//muestre por pantalla.