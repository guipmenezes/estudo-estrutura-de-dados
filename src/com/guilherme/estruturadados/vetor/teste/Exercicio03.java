package com.guilherme.estruturadados.vetor.teste;

import java.util.ArrayList;

import com.guilherme.estruturadados.vetor.Lista;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>(10);
		
		lista1.add("A");
		lista1.add("B");
		lista1.add("C");
		lista1.add("D");
		
		System.out.println(lista1);
		
		lista1.remove("A");
		
		System.out.println(lista1);
		
		
		Lista<String> lista2 = new Lista<>(10);
		
		lista2.adiciona("A");
		lista2.adiciona("B");
		lista2.adiciona("C");
		lista2.adiciona("D");
		
		System.out.println(lista2);
		
		lista2.removeElemento("A");
		
		System.out.println(lista2);
		
	}

}
