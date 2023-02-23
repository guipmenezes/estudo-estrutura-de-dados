package com.guilherme.estruturadados.filas.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Teste06 {
	
	public static void main(String[] args) {
		
		Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
				new Comparator<Paciente>() {

					@Override
					public int compare(Paciente p1, Paciente p2) {
						//forma mais elegante, semelhante à forma da classe Paciente
						return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
					}
				}
		);
		
		filaComPrioridade.add(new Paciente("Guilherme", 2));
		filaComPrioridade.add(new Paciente("Gustavo", 1));
		
		System.out.println(filaComPrioridade);
	}

}
