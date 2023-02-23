package com.guilherme.estruturadados.pilhas.labs;

import com.guilherme.estruturadados.pilhas.Pilha;

public class Exercicio01MV {
	
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();
		
		Pilha<Integer> novaPilha = pilha.empilhaPares(20);
		
		System.out.println(novaPilha);
	}

}
