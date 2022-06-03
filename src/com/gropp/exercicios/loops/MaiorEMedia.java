package com.gropp.exercicios.loops;

import java.util.Scanner;

/*
* Receba 5 numeros
* Diga qual o maior e qual a media aritmetica deles
*/

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int i = 0;
        int soma = 0;
        int media = 0;
        int maior = 0;

        // precisa executar 5 vezes essa entrada
        // como vai executar com certeza entao podemos usar o do-while
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            //soma os numeros
            soma += numero;
            //verifica qual o maior numero
            //se o numero recebido for maior que o numero armazenado anteriormente como maior para comparacao, entao a variavel maior recebe o novo maior valor.
            if(numero > maior) maior = numero;
            i++;
        } while(i <  5);

        media = (soma/i);
        System.out.println("A media dos numeros é: "+media);
        System.out.println("O maior numero digitado foi: "+maior);
    }
}
