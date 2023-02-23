package com.guilherme.estruturadados.pilhas.labs;

import com.guilherme.estruturadados.pilhas.Pilha;

public class Exercicio03MV {
	
	public static void main(String[] args) {
		
		Pilha<Livro> pilha = new Pilha<>(20);
		
		Livro livro1 = new Livro("Odisseia", "ISBN 982-2189-2131", 2009, "Homero");
		Livro livro2 = new Livro("Estrutura de dados", "ISBN 3892-2732-0835", 2015, "Loiane Groiner");
		Livro livro3 = new Livro("Algoritmos com Java", "ISBN 273-2953-0352", 1999, "Steven");
		Livro livro4 = new Livro("Spring Boot Avançado", "ISBN 738722-29834-3586", 2018, "Joana");
		Livro livro5 = new Livro("Aprendendo Apache Kafka", "ISBN 9743-7483-2321", 2020, "Tom Brady");
		Livro livro6 = new Livro("Como ser um GOAT", "ISBN 3859-343-384", 2023, "Lebron James");
		
		//Utilizando método empilha
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);
		
		System.out.println(pilha);
		
		//Utilizando método topo
		System.out.println(pilha.topo());
		
		//Utilizando método desempilha
		while(!pilha.estaVazia()) {
			Livro desempilhando = pilha.desempilha();
			
			System.out.println("Desempilhando o livro: " + desempilhando);
		}
		
	}

}
