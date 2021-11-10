package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero para ver a tabuada");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada + ":");

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + "*" + i + " = " + (tabuada * i));
        }

    }
}
