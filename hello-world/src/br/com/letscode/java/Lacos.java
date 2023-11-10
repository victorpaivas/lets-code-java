package br.com.letscode.java;

import java.util.Arrays;

public class Lacos {
    public static void main(String[] args) {
       /*for(int i = 1; i <= 10; i++) {
           System.out.println(i);
        }*/

        String[] nomes = {"Victor", "José", "Antonio", "Patrick"};
        System.out.println(Arrays.toString(nomes));
        int[] numeros = {9, 5, 2, 11, 7, 25};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }

        System.out.println("Maior: " + maior + " Menor: " + menor + " Media: " + media);

    }
}
