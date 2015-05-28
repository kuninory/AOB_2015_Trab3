package aob_2015_trab3;

import java.util.Scanner;

public class AOB_2015_Trab3 {

    public static int numDeExec = 5;
    public static Scanner ler = new Scanner(System.in);
    public static int opcMenuTipoAlgo;
    public static int opcTamanhoVetor;

    public static void main(String[] args) throws CloneNotSupportedException {

        opcMenuTipoAlgo = 99;

        while (opcMenuTipoAlgo != 0) {

            MenuAlgoritmos();

            opcTamanhoVetor = 99;
            if (opcMenuTipoAlgo > 0 && opcMenuTipoAlgo < 7) {

                while (opcTamanhoVetor != 0) {

                    MenuVetores();

                    if (opcTamanhoVetor > 0 && opcTamanhoVetor < 7) {

                        if (opcTamanhoVetor == 1) {
                            opcTamanhoVetor = 50;
                        } else if (opcTamanhoVetor == 2) {
                            opcTamanhoVetor = 100;
                        } else if (opcTamanhoVetor == 3) {
                            opcTamanhoVetor = 1000;
                        } else if (opcTamanhoVetor == 4) {
                            opcTamanhoVetor = 10000;
                        } else if (opcTamanhoVetor == 5) {
                            opcTamanhoVetor = 100000;
                        } else if (opcTamanhoVetor == 6) {
                            opcTamanhoVetor = 1000000;
                        }

                        if (opcMenuTipoAlgo == 1) {

                            System.out.println("Tamanho do vetor= " + opcTamanhoVetor);
                            Vetor vetorFonte = new Vetor(opcTamanhoVetor);
                            vetorFonte.popularVetor();
                            vetorFonte.imprimirVetor();
                            System.out.println("Vetor populado e exibido. Executando o algoritmo agora:");
                            
                            Bubblesort.Bubblesorter(vetorFonte);

                            System.out.println("\nExecutado o BubbleSort com vetor de "
                                    + "tamanho= " + opcTamanhoVetor);

                            opcTamanhoVetor = 0;
                        } else if (opcMenuTipoAlgo == 2) {

                            System.out.println("Tamanho do vetor= " + opcTamanhoVetor);
                            Vetor vetorFonte = new Vetor(opcTamanhoVetor);
                            vetorFonte.popularVetor();
                            vetorFonte.imprimirVetor();
                            System.out.println("Vetor populado e exibido. Executando o algoritmo agora:");

                            InserctionSort.InsertionSorter(vetorFonte);

                            System.out.println("\nExecutado o InserctionSort com vetor de "
                                    + "tamanho= " + opcTamanhoVetor);

                            opcTamanhoVetor = 0;
                        } else if (opcMenuTipoAlgo == 3) {

                            System.out.println("Tamanho do vetor= " + opcTamanhoVetor);
                            Vetor vetorFonte = new Vetor(opcTamanhoVetor);
                            vetorFonte.popularVetor();
                            vetorFonte.imprimirVetor();
                            System.out.println("Vetor populado e exibido. Executando o algoritmo agora:");

                            SelectionSort.selectionSorter(vetorFonte);

                            System.out.println("\nExecutado o SelectionSort com vetor de "
                                    + "tamanho= " + opcTamanhoVetor);

                            opcTamanhoVetor = 0;
                        } else if (opcMenuTipoAlgo == 4) {

                            System.out.println("Tamanho do vetor= " + opcTamanhoVetor);
                            Vetor vetorFonte = new Vetor(opcTamanhoVetor);
                            vetorFonte.popularVetor();
                            vetorFonte.imprimirVetor();
                            System.out.println("Vetor populado e exibido. Executando o algoritmo agora:");

                            ShellSort.shellSorter(vetorFonte);

                            System.out.println("\nExecutado o ShellSort com vetor de "
                                    + "tamanho= " + opcTamanhoVetor);

                            opcTamanhoVetor = 0;
                        } else if (opcMenuTipoAlgo == 5) {

                            System.out.println("Tamanho do vetor= " + opcTamanhoVetor);
                            Vetor vetorFonte = new Vetor(opcTamanhoVetor);
                            vetorFonte.popularVetor();
                            vetorFonte.imprimirVetor();
                            System.out.println("Vetor populado e exibido. Executando o algoritmo agora:");

                            QuickSort.execQuickSort(vetorFonte);

                            System.out.println("\nExecutado o QuickSort com vetor de "
                                    + "tamanho= " + opcTamanhoVetor);

                            opcTamanhoVetor = 0;
                        } else if (opcMenuTipoAlgo == 6) {

                            System.out.println("Tamanho do vetor= " + opcTamanhoVetor);
                            Vetor vetorFonte = new Vetor(opcTamanhoVetor);
                            vetorFonte.popularVetor();
                            vetorFonte.imprimirVetor();
                            System.out.println("Vetor populado e exibido. Executando o algoritmo agora:");

                            HeapSort.HeapSorter(vetorFonte);

                            System.out.println("\nExecutado o HeapSort com vetor de "
                                    + "tamanho= " + opcTamanhoVetor);

                            opcTamanhoVetor = 0;
                        }
                    }
                    opcMenuTipoAlgo = 99;
                }
            }
        }
    }

    public static void MenuAlgoritmos() {

        System.out.println("\nEscolha uma opção:"
                + "\n1- Testar o Bubblesort;"
                + "\n2- Testar o Insertionsort;"
                + "\n3- Testar o Selectionsort;"
                + "\n4- Testar o Shellsort;"
                + "\n5- Testar o Quicksort;"
                + "\n6- Testar o Heapsort;"
                + "\n0- Sair;");
        opcMenuTipoAlgo = ler.nextInt();

    }

    public static void MenuVetores() {

        System.out.println("\nEscolha um tamanho de vetor:"
                + "\n1- 50;"
                + "\n2- 100;"
                + "\n3- 1000;"
                + "\n4- 10000;"
                + "\n5- 100000;"
                + "\n6- 1000000;"
                + "\n0- Sair;");
        opcTamanhoVetor = ler.nextInt();

    }

}
