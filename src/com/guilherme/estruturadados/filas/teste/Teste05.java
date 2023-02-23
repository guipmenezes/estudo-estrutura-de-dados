package com.guilherme.estruturadados.filas.teste;

import com.guilherme.estruturadados.filas.FilaComPrioridade;

public class Teste05 {
	
	public static void main(String[] args) {
		
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>(10);
		
		fila.enfileira(new Paciente("Guilherme", 2));
		fila.enfileira(new Paciente("Pedro", 1));
		fila.enfileira(new Paciente("Gustavo", 1));
		
		System.out.println(fila);
	}

}
