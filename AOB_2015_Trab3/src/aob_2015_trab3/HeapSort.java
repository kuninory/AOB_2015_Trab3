package aob_2015_trab3;

public class HeapSort {

    public static void HeapSorter(Vetor vetorFonte) {
        
        Vetor vetorExemplo = new Vetor(vetorFonte.meuTamanho);
        vetorExemplo.meuVetor = (int[]) vetorFonte.meuVetor.clone();
        
        long startTimeMilli = System.currentTimeMillis();
        long startTimeNano = System.nanoTime();
        
        buildMaxHeap(vetorExemplo.meuVetor);
        int n = vetorExemplo.meuVetor.length;

        for (int i = vetorExemplo.meuVetor.length - 1; i > 0; i--) {
            swap(vetorExemplo.meuVetor, i, 0);
            maxHeapify(vetorExemplo.meuVetor, 0, --n);
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

    private static void buildMaxHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--) {
            maxHeapify(v, i, v.length);
        }
    }

    private static void maxHeapify(int[] v, int pos, int n) {
        int maxi;
        int l = 2 * pos;
        int right = 2 * pos + 1;
        if ((l < n) && (v[l] > v[pos])) {
            maxi = l;
        } else {
            maxi = pos;
        }
        if (right < n && v[right] > v[maxi]) {
            maxi = right;
        }
        if (maxi != pos) {
            swap(v, pos, maxi);
            maxHeapify(v, maxi, n);
        }
    }

    public static void swap(int[] v, int j, int aposJ) {
        int aux = v[ j];
        v[ j] = v[ aposJ];
        v[ aposJ] = aux;
    }
}
