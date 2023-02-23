package com.guilherme.estruturadados.filas.teste;

import com.guilherme.estruturadados.filas.Fila;

public class Teste02 {
	
	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>(10);
		
		fila.enfileira(10);
		fila.enfileira(20);
		fila.enfileira(30);
		fila.enfileira(40);
		
		System.out.println(fila.espiar());
	}

}
