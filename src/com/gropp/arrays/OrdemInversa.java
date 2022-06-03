package com.gropp.arrays;

/*
 * Ordene um array em ordem inversa
 */


public class OrdemInversa {
    public static void main(String[] args) {
        //declaracao de um array com 6 elementos
        int[] vetor = {2, 4, 28, 3, 9, 1};

        //System.out.println(vetor.length);

        int count = 0;
        System.out.println("vetor original: ");
        while(count<(vetor.length)) {
            System.out.println(vetor[count]);
            count++;
        }
        System.out.println("Ordem Inversa: ");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
}
