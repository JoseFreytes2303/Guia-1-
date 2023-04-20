/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio1 {

    public static void main(String[] args) {
        int num, num2;
        System.out.println("Ingrese los numeros");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        System.out.println("La suma de los numeros es igual : " + (num + num2));
    }
}
//Escribir un programa que pida dos números enteros por teclado y calcule
//la suma de los dos. El programa deberá después mostrar el resultado de
//la suma