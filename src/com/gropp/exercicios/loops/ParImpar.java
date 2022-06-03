package com.gropp.exercicios.loops;

/*
 * Receba numeros inteiros
 * Calcule o numero de pares e impares
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;
        int quantidadeNumeros = 0;

        do {
            System.out.println("Digite um numero (0 encerra o programa): ");
            numero = scan.nextInt();
            quantidadeNumeros++;
            //verifica e soma a qtdade de pares e impares
            if( numero % 2 == 0) pares++;
                    else impares++;
        } while(numero != 0);
        System.out.println("Você digitou "+quantidadeNumeros+" numeros.");
        System.out.println("A quantidade de pares é: "+pares);
        System.out.println("A quantidade de impares é :"+impares);
    }
}
