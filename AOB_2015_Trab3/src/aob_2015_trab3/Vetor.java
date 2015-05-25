package aob_2015_trab3;

import java.util.Random;

public class Vetor implements Cloneable {

    public static Random gerador = new Random();
    public int meuTamanho;
    public int[] meuVetor;

    public Vetor(int tamanho) {
        meuTamanho = tamanho;
        meuVetor = new int[meuTamanho];
    }

    public void popularVetor() {

        int numGerado;

        for (int i = 0; i < this.meuTamanho; i++) {
            numGerado = gerador.nextInt(100);
            this.meuVetor[i] = numGerado;
        }
    }

    public void imprimirVetor() {
        int j = 0;

        System.out.println("\nImprimido o vetor:");

        for (int i : this.meuVetor) {

            if (j == 0 || (j % 10) == 0) {
                System.out.println("");
                System.out.print(("Linha " + (j) / 10));
            }

            System.out.print("\t" + i);
            j++;
        }
        System.out.println("\n");
    }

    @Override
    public Vetor clone() throws CloneNotSupportedException {
        return (Vetor) super.clone();
    }

}
