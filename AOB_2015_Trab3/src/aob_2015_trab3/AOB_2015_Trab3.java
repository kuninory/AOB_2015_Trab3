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
public class AOB_2015_Trab3 {

    /**
     * @param args the command line arguments
     */
    public static int numDeExec = 5;

    public static void main(String[] args) {

        Vetores.preencheVetores();
        
        Vetores.imprimeVetor(Vetores.array10_2);
        
        Bubblesort.Bubblesorter(Vetores.array10_2);
        
        Vetores.imprimeVetor(Vetores.array10_2);
    }

    public static void imprimeResultados(long[] array) {

        for (int i = 0; i < array.length; i++) {

            if (i == 0 || (i % 10) == 0) {
                System.out.println("");
                System.out.print(((i) / 10) + " ");
            }

            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
    }

}
