/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio4 {

    public static void main(String[] args) {
      System.out.println("Ingrese la cantidad en grados centigrados");
      Scanner sc = new Scanner(System.in);
      int grados;
      grados = sc.nextInt();
      sc.close();
      System.out.println("Los grado en Fahrenheit es: " + (32 + (9 * grados / 5)));
    }
    
}
//Dada una cantidad de grados centígrados se debe mostrar su
//equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
//+ (9 * C / 5).
