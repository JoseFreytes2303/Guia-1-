/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio3 {

    public static void main(String[] args) {
     System.out.println("Ingrese una frase");
     String frase, frase2, frase3;
     Scanner sc = new Scanner(System.in);
     frase = sc.nextLine();
     frase2 = frase.toUpperCase();
     frase3 = frase.toLowerCase();
     sc.close();
     System.out.println("La frase en MAYUSCULA: " + frase2);
     System.out.println("La frase en MINUSCULA: " + frase3);
    }
}
//Escribir un programa que pida una frase y la muestre toda en mayúsculas
//y después toda en minúsculas.
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.