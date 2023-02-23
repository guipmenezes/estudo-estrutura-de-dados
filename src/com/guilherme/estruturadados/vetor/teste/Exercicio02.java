package com.guilherme.estruturadados.vetor.teste;

import java.util.ArrayList;

import com.guilherme.estruturadados.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>(10);
		
		lista1.add("A");
		lista1.add("B");
		lista1.add("C");
		lista1.add("D");
		lista1.add("A");
		lista1.add("B");
		
		System.out.println(lista1.lastIndexOf("B"));
		
		
		Lista<String> lista = new Lista<>(10);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("A");
		lista.adiciona("B");
		
		int ultimo =  lista.ultimoIndice("B");
		
		System.out.println(ultimo);
	}
}
