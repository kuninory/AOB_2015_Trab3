package aob_2015_trab3;

import java.util.Scanner;

public class AOB_2015_Trab3 {

    public static int numDeExec = 5;

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner ler = new Scanner(System.in);

        int opcMenuTipoAlgo = 99;
        int opcTamanhoVetor;

        while (opcMenuTipoAlgo != 0) {

            System.out.println("Escolha uma opção:"
                    + "\n1- Testar o Bubblesort;"
                    + "\n2- Testar o Insertionsort;"
                    + "\n3- Testar o Selectionsort;"
                    + "\n4- Testar o Shellsort;"
                    + "\n5- Testar o Quicksort;"
                    + "\n6- Testar o Heapsort;"
                    + "\n0- Sair;");
            opcMenuTipoAlgo = ler.nextInt();

            if (opcMenuTipoAlgo > 0 && opcMenuTipoAlgo < 7) {

                opcTamanhoVetor = 99;

                while (opcTamanhoVetor != 0) {
                    System.out.println("Escolha um tamanho de vetor:"
                            + "\n1- 100;"
                            + "\n2- 1000;"
                            + "\n3- 10000;"
                            + "\n4- 100000;"
                            + "\n5- 1000000;"
                            + "\n0- Sair;");
                    opcTamanhoVetor = ler.nextInt();

                    if (opcTamanhoVetor > 0 && opcTamanhoVetor < 6) {

                        if (opcTamanhoVetor == 1) {
                            opcTamanhoVetor = 100;
                        }

                        if (opcMenuTipoAlgo == 1) {

                            System.out.println("Tamanho do vetor= " + opcTamanhoVetor);
                            Vetor vetor10_2 = new Vetor(opcTamanhoVetor);
                            vetor10_2.popularVetor();
                            vetor10_2.imprimirVetor();

                            Bubblesort.Bubblesorter(vetor10_2);
                            
                            opcTamanhoVetor= 0;
                        }
                    }
                    opcMenuTipoAlgo = 0;
                }
            }
        }
    }

    public static void imprimeResultados(long[] array) {

        for (int i = 0; i < array.length; i++) {

            if (i == 0 || (i % 10) == 0) {
                System.out.println("");
                System.out.print(((i) / 10) + " ");
            }

            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
    }

}
