package com.guilherme.estruturadados.pilhas.labs;

import java.util.Stack;

public class Exercicio04MV {
	
	public static void main(String[] args) {
		
		Stack<Livro> stack = new Stack<>();
		
		Livro livro1 = new Livro("Odisseia", "ISBN 982-2189-2131", 2009, "Homero");
		Livro livro2 = new Livro("Estrutura de dados", "ISBN 3892-2732-0835", 2015, "Loiane Groiner");
		Livro livro3 = new Livro("Algoritmos com Java", "ISBN 273-2953-0352", 1999, "Steven");
		Livro livro4 = new Livro("Spring Boot Avançado", "ISBN 738722-29834-3586", 2018, "Joana");
		Livro livro5 = new Livro("Aprendendo Apache Kafka", "ISBN 9743-7483-2321", 2020, "Tom Brady");
		Livro livro6 = new Livro("Como ser um GOAT", "ISBN 3859-343-384", 2023, "Lebron James");
		
		//Verify if the stack is empty
		System.out.println("Is the stack empty? " + stack.empty());
		
		//Pushing books to the stack
		stack.push(livro1);
		stack.push(livro2);
		stack.push(livro3);
		stack.push(livro4);
		stack.push(livro5);
		stack.push(livro6);
		
		System.out.println(stack);
		
		//Looking for the top
		System.out.println("The book on the top is: " + stack.peek());
		
		
		//removing the itens from the stack
		while(!stack.empty()) {
			System.out.println("Popping the item: " + stack.pop());
		}
		
		
		System.out.println("Now the stack should be empty, right? " + stack.empty());
	}

}
