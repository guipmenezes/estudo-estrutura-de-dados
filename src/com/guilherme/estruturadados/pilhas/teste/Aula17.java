package com.guilherme.estruturadados.pilhas.teste;

import com.guilherme.estruturadados.pilhas.Pilha;

public class Aula17 {
	
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>(10);
		
		for(int i = 0; i <= 10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		
		//Desempilhando 7 elementos dos 11 adicionados
		for(int i = 0; i < 7; i++) {
			pilha.desempilha();
		}
		System.out.println(pilha);
	}

}
