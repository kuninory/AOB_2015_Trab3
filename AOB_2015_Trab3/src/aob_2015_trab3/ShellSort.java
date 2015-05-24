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
public class ShellSort {
	
	private int[] intArray;
	
	public void imprimeVetor(int [] v) {
		System.out.print("A=");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void shellSort(int [] intArray) {
		int indiceInterno;
		int indiceExterno;
		int indiceTemporario;
		
		int h = 1;
		while (h <= (intArray.length/3)) {			
			h = h*3 + 1;
		}
		
		while (h>0) {	
			
			for (indiceExterno = h; indiceExterno<intArray.length; indiceExterno++) {
				indiceTemporario = intArray[indiceExterno];
				indiceInterno = indiceExterno;
				
				while (indiceInterno > h-1 && intArray[indiceInterno-h] >= indiceTemporario) {					
					intArray[indiceInterno] = intArray[indiceInterno-h];
					indiceInterno -= h ;
				}
				
				intArray[indiceInterno] = indiceTemporario;
			}
			
			h = (h-1) / 3;
		}
	}
}

class ShellSortApp {
	public static void main(String[] args) {
		int maxSize = 10;
		ShellSort shellSort = new ShellSort();
		
		int[] vetor = {9,2,10,7,3,20,11,43,19};
		
		shellSort.imprimeVetor(vetor);
		shellSort.shellSort(vetor);
		shellSort.imprimeVetor(vetor);
	}
}
