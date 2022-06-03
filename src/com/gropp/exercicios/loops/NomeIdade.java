package com.gropp.exercicios.loops;

import java.util.Scanner;

/*
 * Receba os nomes e as idades atraves do teclado
 * Somente saia do loop quando o nome receber o caracter 0
 */

public class NomeIdade {
    public static void main(String[] args) {
        //captura o teclado
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Volte Sempre...");
    }
}
