package com.guilherme.estruturadados.pilhas.teste;

import com.guilherme.estruturadados.pilhas.Pilha;

public class Aula16 {
	
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>(20);
		
		for(int i = 0; i < 15; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println("Qual será o último item da pilha?");
		System.out.println("O último item da pilha é o: " + pilha.topo());
		
	}

}
