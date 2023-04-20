/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio5 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Ingrese un numero");
    num = sc.nextInt();
    sc.close();
    System.out.println("El doble del numero es: " + (2*num) );
    System.out.println("El triple del numero es: " + (3*num));
    System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(num));
    }
}
//Escribir un programa que lea un número entero por teclado y muestre
//por pantalla el doble, el triple y la raíz cuadrada de ese número.
//Nota: investigar la función Math.sqrt().