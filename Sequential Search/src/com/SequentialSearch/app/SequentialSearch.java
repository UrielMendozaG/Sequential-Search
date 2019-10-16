package com.SequentialSearch.app;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearch {
	public static void main(String[] args) {
		//variables
		int[] arregloDesordenado = new int[10];
		int elementoBuscar = 0;
		boolean isEncontrado = false;
		int numeroVecesEncontrado = 0;
		
		
		//creacion de objetos
		Random randomNumber = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//llenamos el arreglo de numeros aleatorios
		for(int i=0; i<10; i++) {
			arregloDesordenado[i] = randomNumber.nextInt(11);
			System.out.print(arregloDesordenado[i]+" ");
		}
		
		//salto de linea
		
		System.out.println("");
		
		//pedimos el valor al usuario
		
		System.out.println("Ingresa el numero a buscar");
		elementoBuscar = input.nextInt();
		
		
		//metodo de busqueda secuencial
		for(int i = 0; i<10; i++){
			if(arregloDesordenado[i] == elementoBuscar){
				isEncontrado = true;
				numeroVecesEncontrado++;
			}
		}
		
		//output
		if(isEncontrado)
			System.out.println("El numero "+elementoBuscar+" esta en el arreglo"+ 
		     " "+numeroVecesEncontrado+" veces");
		else 
			System.out.println("No se encontro");
			
		
		//objeto input cerrado
		input.close();
	}	
}
