package com.guilherme.estruturadados.pilhas.teste;

import com.guilherme.estruturadados.pilhas.Pilha;

public class Aula15 {
	
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>(20);
		
		System.out.println("A pilha esta vazia? " + pilha.estaVazia());
		System.out.println(pilha);
		
		for(int i = 0; i <= 20; i++) {
			pilha.empilha(i);
		}
		
		System.out.println("O laço está adicionando itens à pilha");
		
		System.out.println("A pilha esta vazia? " + pilha.estaVazia());
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}

}
