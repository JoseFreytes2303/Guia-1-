/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int nota;
        do {
           System.out.println("Ingrese una nota"); 
            nota = sc.nextInt();
        } while (nota < 0 || nota > 10);
        sc.close();
    }
}
//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
//y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
