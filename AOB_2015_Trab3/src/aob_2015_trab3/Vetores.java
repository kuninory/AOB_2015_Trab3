/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aob_2015_trab3;

import java.util.Random;

/**
 *
 * @author alunoinf
 */
public class Vetores {

    public static int array10_2[] = new int[100];
    public static int array10_3[] = new int[1000];
    public static int array10_4[] = new int[10000];
    public static int array10_5[] = new int[100000];
    public static int array10_6[] = new int[1000000];

    public static Random gerador = new Random();

    public static void popularVetores(int[] vetor) {

        int tamanhoVetor = vetor.length;
        int numGerado;

        for (int i = 0; i < tamanhoVetor; i++) {
            numGerado = Vetores.gerador.nextInt(100);
            vetor[i] = numGerado;
        }
    }

    public static void preencheVetores() {
        popularVetores(array10_2);
        popularVetores(array10_3);
        popularVetores(array10_4);
        popularVetores(array10_5);
        popularVetores(array10_6);
    }

    public static void imprimeVetor(int[] vetor) {
        int j = 0;

        System.out.println("Imprimido o vetor:");

        for (int i : vetor) {

            if (j == 0 || (j % 10) == 0) {
                System.out.println("");
                System.out.print(((j) / 10) + " ");
            }

            System.out.print("\t" + i);
            j++;
        }
        System.out.println("");
        System.out.println("");
    }

}
