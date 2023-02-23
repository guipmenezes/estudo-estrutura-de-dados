package com.guilherme.estruturadados.pilhas.labs;

import java.util.Stack;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Stack<Integer> original = new Stack<>();
		Stack<Integer> objetivo = new Stack<>();
		Stack<Integer> auxiliar = new Stack<>();

		original.push(3);
		original.push(2);
		original.push(1);
		
		torreDeHanoi(original.size(), original, objetivo, auxiliar);
	}
	
	public static void torreDeHanoi(int num, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar) {
		if(num > 0) {
			torreDeHanoi(num-1, original, auxiliar, destino);
			destino.push(original.pop());
			System.out.println("----------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + destino);
			System.out.println("Auxiliar: " + auxiliar);
			torreDeHanoi(num-1, auxiliar, destino, original);
		}
	}
}
