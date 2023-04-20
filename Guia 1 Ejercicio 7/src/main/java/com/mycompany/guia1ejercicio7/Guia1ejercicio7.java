/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int tipoMotor;
       do {
        System.out.println("Ingrese un valor dentro del 1 al 4");
        tipoMotor = sc.nextInt();
        switch (tipoMotor) {
            case 1 :
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2 :
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3 :
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4 :
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default :
                System.out.println("No existe un valor valido para el tipo de bomba" + "n/");
                break;
                
                
            
        }
        } while (tipoMotor >= 5);
       sc.close();
       
    }
}
