/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio10 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2,num3,num4;
    System.out.println("Ingrese 4 numeros entre el 1 y el 10");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();
    num4 = sc.nextInt();
    System.out.print(num1 + ": ");
        for (int i = 1; i <= num1; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(num2 + ": ");
        for (int i = 1; i <= num2; i++) {
           System.out.print("*");
            
        }
        System.out.println();
        System.out.print(num3 + ": ");
        for (int i = 1; i <= num3; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(num4 + ": ");
        for (int i = 1; i <= num4; i++) {
            System.out.print("*");
        }
    
    }
    }
    
