/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aob_2015_trab3;

/**
 *
 * @author alunoinf
 */
public class Bubblesort {

    public static void Bubblesorter(int[] intArray) {

        int n = intArray.length;
        int temp = 0;
        long startTimeNano = System.nanoTime();
        long startTimeMilli = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        long endTimeNano = System.nanoTime();
        long endTimeMilli = System.currentTimeMillis();

        long tempoTotalNano = endTimeNano - startTimeNano;
        long tempoTotalMilli = endTimeMilli - startTimeMilli;

        System.out.println("Tempos Nano: "
                + "\n Tempo Nano Inicial: " + startTimeNano
                + "\n Tempo Nano Final: " + endTimeNano
                + "\n Total Nano: " + tempoTotalNano
                + "\n\n Tempos Milli: "
                + "\n Tempo Milli Inicial: " + startTimeMilli
                + "\n Tempo Milli Final: " + endTimeMilli
                + "\n Total Milli: " + tempoTotalMilli);
    }

}
