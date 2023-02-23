package com.guilherme.estruturadados.vetor.teste;

import com.guilherme.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);
		
		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remove o elemento E");
		
		vetor.removeSemelhante("E");
		
		System.out.println(vetor);
	}
}
