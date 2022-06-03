package com.gropp.exercicios.loops;

import java.util.Scanner;

/*
 * Receba uma nota atraves do teclado
 * So aceite notas no intervalo de 0 a 10
 */

public class Nota {
    public static void main(String[] args) {
        //captura o teclado
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite uma Nota: ");
        int nota = scan.nextInt();

        while(nota < 0 || nota > 10 ) {
            System.out.println("Nota Invalida! Digite entre 0 e 10 : ");
            nota = scan.nextInt();
        }
    }
}
