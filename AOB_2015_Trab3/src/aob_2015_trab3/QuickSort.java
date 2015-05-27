package aob_2015_trab3;

public class QuickSort {

    static int[] qsort(int[] itens) {
        quickSorter(itens, 0, itens.length - 1);
        return itens;
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
