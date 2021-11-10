package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numeros: ");;
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");;
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        }while (count < quantidadeNumeros);

        System.out.println("Quantidade de Numeros Pares: " + quantPares);
        System.out.println("Quantidade de Numeros Impares: " + quantImpares);
    }
}
