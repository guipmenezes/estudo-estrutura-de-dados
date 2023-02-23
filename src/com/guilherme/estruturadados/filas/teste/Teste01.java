package com.guilherme.estruturadados.filas.teste;

import com.guilherme.estruturadados.filas.Fila;

public class Teste01 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>(10);
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);

		System.out.println(fila);
		
	}
}
