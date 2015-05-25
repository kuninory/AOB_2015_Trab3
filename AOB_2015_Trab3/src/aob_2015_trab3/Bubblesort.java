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

    public static void Bubblesorter(Vetor vetorFonte) throws CloneNotSupportedException {

        Vetor vetorExemplo = new Vetor(vetorFonte.meuTamanho);
        vetorExemplo.meuVetor = (int[]) vetorFonte.meuVetor.clone();
        
        int tamanho = vetorExemplo.meuVetor.length;
        int temp;
        long startTimeMilli = System.currentTimeMillis();
        long startTimeNano = System.nanoTime();

        for (int i = 0; i < tamanho; i++) {
            for (int j = 1; j < (tamanho - i); j++) {

                if (vetorExemplo.meuVetor[j - 1] > vetorExemplo.meuVetor[j]) {
                    temp = vetorExemplo.meuVetor[j - 1];
                    vetorExemplo.meuVetor[j - 1] = vetorExemplo.meuVetor[j];
                    vetorExemplo.meuVetor[j] = temp;
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
        
        vetorExemplo.imprimirVetor();
    }

}
