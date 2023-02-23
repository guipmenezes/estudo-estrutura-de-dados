package com.guilherme.estruturadados.vetor.teste;

import java.util.ArrayList;

import com.guilherme.estruturadados.vetor.Lista;

public class Exercicios05 {
	
	public static void main(String[] args) {
	
		ArrayList<String> lista1 = new ArrayList<>();
		
		lista1.add("A");
		lista1.add("B");
		lista1.add("C");
		lista1.add("D");
		lista1.add("E");
		lista1.add("F");
		lista1.add("G");
		
		System.out.println(lista1);
		
		lista1.clear();
		
		System.out.println(lista1);
		
		Lista<String> lista2 = new Lista<>(10);
		
		lista2.adiciona("A");
		lista2.adiciona("B");
		lista2.adiciona("C");
		lista2.adiciona("D");
		lista2.adiciona("E");
		lista2.adiciona("F");
		lista2.adiciona("G");
		lista2.adiciona("H");
		lista2.adiciona("I");
		
		System.out.println(lista2);
		
		lista2.limpar();
		System.out.println(lista2);
	}
}
