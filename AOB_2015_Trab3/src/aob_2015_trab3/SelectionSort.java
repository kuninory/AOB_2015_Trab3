package aob_2015_trab3;

public class SelectionSort {

    static int indiceExterno;
    static int indiceInterno;
    static int elementoMinimo;
    static int[] a;

    public static void selectionSorter(Vetor vetorFonte) throws CloneNotSupportedException {

        Vetor vetorExemplo = new Vetor(vetorFonte.meuTamanho);
        vetorExemplo.meuVetor = (int[]) vetorFonte.meuVetor.clone();

        int tamanho = vetorExemplo.meuVetor.length;
        long startTimeMilli = System.currentTimeMillis();
        long startTimeNano = System.nanoTime();

        for (indiceExterno = 0; indiceExterno < tamanho - 1; indiceExterno++) {
            elementoMinimo = indiceExterno;

            for (indiceInterno = (indiceExterno + 1); indiceInterno < tamanho; indiceInterno++) {
                if (vetorExemplo.meuVetor[indiceInterno] < vetorExemplo.meuVetor[elementoMinimo]) {
                    elementoMinimo = indiceInterno;
                    trocaPosicao(vetorExemplo.meuVetor, indiceExterno, indiceInterno);
                }
            }
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

    public static void trocaPosicao(int[] array, int primeiro, int segundo) {
        int indiceTemporario = array[primeiro];
        array[primeiro] = array[segundo];
        array[segundo] = indiceTemporario;
    }
}
