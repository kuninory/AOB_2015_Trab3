/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aob_2015_trab3;

/**
 *
 * @author Ulrich
 */
public class SelectionSort {
	
	int indiceExterno;
	int indiceInterno;
	int elementoMinimo;
	int[] a;
	
	public void selectionSort(int [] intArray) {
				
		for (indiceExterno=0; indiceExterno < intArray.length-1; indiceExterno++) {
			elementoMinimo = indiceExterno;
			
			for (indiceInterno=(indiceExterno+1); indiceInterno < intArray.length; indiceInterno++) {
				if (intArray[indiceInterno] < intArray[elementoMinimo]) {
					elementoMinimo = indiceInterno;
					trocaPosicao(intArray, indiceExterno, indiceInterno);
				}
				
			}
			
		}
	}
	
	public void trocaPosicao(int [] array, int primeiro, int segundo) {
		int indiceTemporario = array[primeiro];
		array[primeiro] = array[segundo];
		array[segundo] = indiceTemporario;
	}
	
	public void imprimeVetor(int [] v) {
	System.out.print("A=");
	for (int i = 0; i < v.length; i++) {
		System.out.print(v[i] + " ");
	}

	System.out.println("");
	}
}

class SelectionSortDemo {
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		
		int[] vetor = {23, 20, 33, 11, 2, 50, 99};
		
		selectionSort.imprimeVetor(vetor);
		selectionSort.selectionSort(vetor);		
		selectionSort.imprimeVetor(vetor);
	}
}
