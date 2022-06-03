package com.gropp.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Criar um array de 20 numeros de 0 a 100 aleatorios
 * imprimir o array
 */


public class NumerosAleatorios {
    public static void main(String[] args) {
        Random randon = new Random();
        //cria um array de inteiros com 20 posicoes
        int[] numerosAleatorios = new int[20];

        for(int i=0; i<numerosAleatorios.length; i++){
            // crio uma variavel para receber numeros inteiros randomicos até 100
            int numRnd = randon.nextInt(100);
            //preencho meu array com esses valores
            numerosAleatorios[i] = numRnd;
        }
        System.out.println("Numeros Aleatorios");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+" ");
        }
        System.out.println("\nSucessores");
        for (int numero : numerosAleatorios){
            System.out.print((numero+1)+" ");
        }
        System.out.println("\nAntecessores");
        for (int numero : numerosAleatorios){
            System.out.print((numero-1)+" ");
        }
    }
}
