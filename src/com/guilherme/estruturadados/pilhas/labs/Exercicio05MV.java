package com.guilherme.estruturadados.pilhas.labs;

import java.util.Scanner;

import com.guilherme.estruturadados.pilhas.Pilha;

public class Exercicio05MV {

	public static void main(String[] args) {
		
		Pilha<Character> pilha = new Pilha<>(1);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma palavra para verificacao: ");
		String palavra = scan.nextLine();
		
		for(int i = 0; i <palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		while(!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}
		
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			System.out.println(palavra);
			System.out.println("Eh um palindromo, programa terminado.");
		} else {
			System.out.println("Nao eh um palindromo, tente novamente na proxima");
		}
	}
}
