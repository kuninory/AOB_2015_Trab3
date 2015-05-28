package aob_2015_trab3;

public class QuickSort {

    public static void execQuickSort(Vetor vetorFonte) throws CloneNotSupportedException {

        Vetor vetorExemplo = new Vetor(vetorFonte.meuTamanho);
        vetorExemplo.meuVetor = (int[]) vetorFonte.meuVetor.clone();
        
        int tamanho = vetorExemplo.meuVetor.length;
        long startTimeMilli = System.currentTimeMillis();
        long startTimeNano = System.nanoTime();

        quickSorter(vetorExemplo.meuVetor, 0, tamanho - 1);
        
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

    private static void quickSorter(int[] itens, int indiceEsquerdo, int indiceDireito) {
        int i, j;
        int pivot, temp;
        i = indiceEsquerdo;
        j = indiceDireito;
        pivot = itens[(indiceEsquerdo + indiceDireito) / 2];

        do {
            while ((itens[i] < pivot) && (i < indiceDireito)) {
                i++;
            }

            while ((pivot < itens[j]) && (j > indiceEsquerdo)) {
                j--;
            }

            if (i <= j) {
                temp = itens[i];
                itens[i] = itens[j];
                itens[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (indiceEsquerdo < j) {
            quickSorter(itens, indiceEsquerdo, j);
        }

        if (i < indiceDireito) {
            quickSorter(itens, i, indiceDireito);
        }
    }
}
