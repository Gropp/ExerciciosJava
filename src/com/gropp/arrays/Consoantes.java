package com.gropp.arrays;

import java.util.Scanner;

/*
 * Criar um array de seis posicoes
 * carregue com strings e diga quantos sao consoantes
 * imprimir as consoantes
 */

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //criado um array de strings com 6 posicoes
        String[] consoantes = new String[6];
        int numConsoantes = 0;
        int contador = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();
            switch (letra.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    numConsoantes++;
                    break;
                default:
                    consoantes[contador]=letra;
            }
            contador++;
        } while (contador < consoantes.length);
        for (String consoante : consoantes) {
            if( consoante != null)
                System.out.print(consoante+" ");
        }
        System.out.println('\n'+"O total de consoantes digitados são: "+numConsoantes);
    }
}
