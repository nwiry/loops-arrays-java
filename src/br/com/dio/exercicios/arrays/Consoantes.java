package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] numeros = {{4,9,8,5}, {3,0,1,5},{}}
        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (letra.equalsIgnoreCase("a")
                    | letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")){

                consoantes[count] = letra;
                quantConsoantes++;
            }

                count++;
        } while (count < consoantes.length);

        for (String consoante : consoantes){
            if(consoante != null)
            System.out.print(consoante + " ");

        }

    }
}
