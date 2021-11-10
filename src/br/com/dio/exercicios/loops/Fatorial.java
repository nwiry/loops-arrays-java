package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scanner.nextInt();
        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(fatorial + "! = " + multiplicacao);

    }
}
