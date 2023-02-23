package com.guilherme.estruturadados.pilhas.teste;

import java.util.Stack;

public class Aula18 {
	
	public static void main(String[] args) {
		
		Stack<Integer> pilha = new Stack<>();
		
		for(int i = 0; i <= 10; i++) {
			pilha.add(i);
		}
		
		System.out.println(pilha);
		
		pilha.push(11);
		pilha.push(12);
		
		System.out.println(pilha.peek());
		System.out.println(pilha);
		
		pilha.pop();
		System.out.println(pilha);
	}

}
