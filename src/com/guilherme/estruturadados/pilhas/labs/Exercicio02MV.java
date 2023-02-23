package com.guilherme.estruturadados.pilhas.labs;

import java.util.Scanner;

import com.guilherme.estruturadados.pilhas.Pilha;

public class Exercicio02MV {
	
	public static void main(String[] args) {
		
		Pilha<Integer> par = new Pilha<>(10);
		Pilha<Integer> impar = new Pilha<>(10);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Entre com um número: ");
			
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				par.empilha(num);
				System.out.println("Empilhando " + num + " nos numeros pares.");
			} else {
				impar.empilha(num);
				System.out.println("Empilhando " + num + " nos numeros impares.");
			}
		}
		
		System.out.println("Agora que estão distribuidos, desempilhando os pares...");
		while(!par.estaVazia()) {
			System.out.println("Desempilhando... " + par.desempilha());
		}
		
		System.out.println("Agora que estão distribuidos, desempilhando os impares...");
		while(!impar.estaVazia()) {
			System.out.println("Desempilhando... " + impar.desempilha());
		}
		
		System.out.println("Pronto, ambas as pilhas estao vazias");
	}

}
