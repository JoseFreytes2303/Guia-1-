/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio9 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int num, suma = 0, contador = 0;
        do {
           System.out.println("Ingrese un numero");
           Scanner sc = new Scanner(System.in);
           num = sc.nextInt();
           
           if (num > 0){
               suma = suma + num;  
           }
           contador = contador + 1;
           if (num ==0){
               System.out.println("Se capturo el numero cero");
               break;
           }
        }while (contador < 20);
        System.out.println("La suma de los numeros ingresados es: " + suma );
        
    }
}
//Escriba un programa que lea 20 números. Si el número leído es igual a cero se
//debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
//programa deberá calcular y mostrar el resultado de la suma de los números
//leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
//de la sentencia brea