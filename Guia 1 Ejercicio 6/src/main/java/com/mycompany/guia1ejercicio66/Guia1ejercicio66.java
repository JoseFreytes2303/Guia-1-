/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio66;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio66 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num, num2;
        num = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        if (num > 25 || num2 > 25){
         System.out.println("Uno o los dos numeros son mayores a 25");   
        }else {
          System.out.println("Los numeros no son mayores a 25");
        } 
        
        
    }
}
//Implementar un programa que le pida dos números enteros al usuario y
//determine si ambos o alguno de ellos es mayor a 25.
