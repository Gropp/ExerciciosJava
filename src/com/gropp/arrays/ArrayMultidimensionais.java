package com.gropp.arrays;

/*
* Gere e imprima uma matriz 4 x 4 com valores alatorios entre 0-9
*/

import java.util.Random;

public class ArrayMultidimensionais {
    public static void main(String[] args) {
        Random random = new Random();

        //matriz com duas dimensoes
        int[][] matrizQuadrada = new int[4][4];

        //navega na linha
        for (int l=0; l < matrizQuadrada.length; l++) {
            //navega na coluna DA LINHA ACIMA [l]
            for (int c = 0; c < matrizQuadrada[l].length; c++) {
                //preenche com valores aleatorios
                matrizQuadrada[l][c] = random.nextInt(9);
            }
        }
        //com foreach navegamos na matriz
        //para cada linha que contem as colunas, por isso é um array
        for (int[] linha : matrizQuadrada) {
            //para cada coluna da linha acima selecionada imprima o valor
            for (int coluna : linha){
                System.out.print(coluna+" ");
            }
            //apos a impresao de todas as colunas da linha quebre linha
            System.out.println(); //pula linha
        }
    }
}
