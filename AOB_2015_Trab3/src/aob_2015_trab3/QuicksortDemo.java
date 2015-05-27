package aob_2015_trab3;

import java.util.Random;

public class QuicksortDemo {

    static Random random = new Random();
    static int[] array = new int[1000];
    
    public static void main(String args[]) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        
        System.out.println("Array Original : ");
        imprimeArray();
        QuickSort.qsort(array);
        System.out.println();
        System.out.println("\nArray Ordenado: ");
        imprimeArray();
    }

    public static void imprimeArray() {
        
        for (int i=0; i<array.length; i++) {
            if (i%10==0) {
            System.out.println("\n");
        }
            System.out.print(array[i] + "\t");
            
        }
    }
}
