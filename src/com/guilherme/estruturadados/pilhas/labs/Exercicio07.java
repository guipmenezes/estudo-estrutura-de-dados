package com.guilherme.estruturadados.pilhas.labs;

import java.util.Stack;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		imprimeResultado(220);
		imprimeResultado(110);
		imprimeResultado(53);
		imprimeResultado(2);
		imprimeResultado(10032);
		
		imprimeResultadoQualquerBase(220, 2);
		
	}
	
	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em binario " + decimalBinario(numero));
	}
	
	public static void imprimeResultadoQualquerBase(int numero, int base) {
		System.out.println(numero + " na base " + base + " é: " + decimalParaQualquerBase(numero, base));
	}

	public static String decimalBinario(int numero) {
		
		Stack<Integer> pilha = new Stack<>();
		String numBinario = "";
		int resto;
		
		while(numero > 0) {
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2;
		}
		
		while(!pilha.isEmpty()) {
			numBinario += pilha.pop();
		}
		
		return numBinario;
	}
	
public static String decimalParaQualquerBase(int numero, int base) {
		
		if(base > 16) {
			throw new IllegalArgumentException("Base não suportada");
		}
	
		Stack<Integer> pilha = new Stack<>();
		String numBase = "";
		int resto;
		String bases = "0123456789ABCDEF";
		
		while(numero > 0) {
			resto = numero % base;
			pilha.push(resto);
			numero /= base;
		}
		
		while(!pilha.isEmpty()) {
			numBase += bases.charAt(pilha.pop());
		}
		
		return numBase;
	}
}
