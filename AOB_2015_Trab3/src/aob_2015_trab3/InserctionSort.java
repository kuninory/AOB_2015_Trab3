
package aob_2015_trab3;

public class InserctionSort {

    public static void InsertionSorter(Vetor vetorFonte) throws CloneNotSupportedException {

        Vetor vetorExemplo = new Vetor(vetorFonte.meuTamanho);
        vetorExemplo.meuVetor = (int[]) vetorFonte.meuVetor.clone();
        
        int tamanho = vetorExemplo.meuVetor.length;
        long startTimeMilli = System.currentTimeMillis();
        long startTimeNano = System.nanoTime();
        
        int i, j, eleito;
        for (i = 1; i < tamanho; i++) {
            eleito = vetorExemplo.meuVetor[i];
            j = i - 1;
            while ((j >= 0) && (eleito < vetorExemplo.meuVetor[j])) {
                vetorExemplo.meuVetor[j + 1] = vetorExemplo.meuVetor[j];
                j--;
            }
            vetorExemplo.meuVetor[j + 1] = eleito;
        }
        
        long endTimeNano = System.nanoTime();
        long endTimeMilli = System.currentTimeMillis();

        long tempoTotalNano = endTimeNano - startTimeNano;
        long tempoTotalMilli = endTimeMilli - startTimeMilli;

        vetorExemplo.imprimirVetor();
        
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
