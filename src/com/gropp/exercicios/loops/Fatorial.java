package com.gropp.exercicios.loops;

import java.util.Scanner;

/*
 * Calcular o fatorial de um numero
 * 5! = 5 X 4 X 3 X 2 X 1
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multiplicacao = 1;

        System.out.println("Digite o numero fatorial: ");
        int fatorial = scan.nextInt();

        System.out.println(fatorial+"! = ");
        for(int i=fatorial; i>=1; i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}
