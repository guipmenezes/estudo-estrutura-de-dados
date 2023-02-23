package com.guilherme.estruturadados.pilhas.labs;

import java.util.Scanner;

import com.guilherme.estruturadados.pilhas.Pilha;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>(10);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Entre com um número: ");
			
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				pilha.empilha(num);
				System.out.println("Empilhando o número " + num);
			} else {
				Integer desempilhado = pilha.desempilha();
				
				if(desempilhado == null) {
					System.out.println("Pilha está vazia");
				} else {
					System.out.println("Numero impar, desempilhando um elemento da pilha " + desempilhado);
				}
			}
		}
		System.out.println("Todos os números foram lidos, desempilhando números da pilha");
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando um elemento da pilha " + pilha.desempilha());
		}
		System.out.println("Todos os elementos foram desempilhados");
	}

}
