package com.gropp.exercicios.loops;

import java.util.Scanner;

/*
 * Receba numero inteiro
 * Calcule a tabuada do numero
 */

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero =  0;

        System.out.println("Digite o numero da tabuada: ");
        numero = scan.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(i + " x " + numero +  " = " + (i*numero));
        }
    }
}
