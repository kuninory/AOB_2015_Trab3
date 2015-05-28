package aob_2015_trab3;

public class ShellSort {

    public static void shellSorter(Vetor vetorFonte) throws CloneNotSupportedException {

        Vetor vetorExemplo = new Vetor(vetorFonte.meuTamanho);
        vetorExemplo.meuVetor = (int[]) vetorFonte.meuVetor.clone();
        
        int tamanho = vetorExemplo.meuVetor.length;
        long startTimeMilli = System.currentTimeMillis();
        long startTimeNano = System.nanoTime();

        int indiceInterno;
        int indiceExterno;
        int indiceTemporario;

        int h = 1;
        while (h <= (tamanho / 3)) {
            h = h * 3 + 1;
        }

        while (h > 0) {

            for (indiceExterno = h; indiceExterno < tamanho; indiceExterno++) {
                indiceTemporario = vetorExemplo.meuVetor[indiceExterno];
                indiceInterno = indiceExterno;

                while (indiceInterno > h - 1 && vetorExemplo.meuVetor[indiceInterno - h] >= indiceTemporario) {
                    vetorExemplo.meuVetor[indiceInterno] = vetorExemplo.meuVetor[indiceInterno - h];
                    indiceInterno -= h;
                }

                vetorExemplo.meuVetor[indiceInterno] = indiceTemporario;
            }

            h = (h - 1) / 3;
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
