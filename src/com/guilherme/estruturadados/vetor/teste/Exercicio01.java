package com.guilherme.estruturadados.vetor.teste;

import com.guilherme.estruturadados.vetor.Lista;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<>(10);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		
		System.out.println(lista);
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("C"));
		System.out.println(lista.contem("D"));
		System.out.println(lista.contem("E"));
		
	}

}
