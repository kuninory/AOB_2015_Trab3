/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aob_2015_trab3;

/**
 *
 * @author Felipe
 */
public class InserctionSort {

    public static void InsertionSort(int numeros[], int tam) {
        int i, j, eleito;
        for (i = 1; i < tam; i++) {
            eleito = numeros[i];
            j = i - 1;
            while ((j >= 0) && (eleito < numeros[j])) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = eleito;
        }
    }
}
