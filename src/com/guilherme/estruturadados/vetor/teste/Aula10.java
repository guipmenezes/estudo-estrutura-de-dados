package com.guilherme.estruturadados.vetor.teste;

import com.guilherme.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
	
		VetorObjetos vetor = new VetorObjetos(10);
		
		Contato c1 = new Contato("Contato 1", "61281827", "email1@email.com");
		Contato c2 = new Contato("Contato 2", "78128728", "email2@email.com");
		Contato c3 = new Contato("Contato 3", "18281728", "email3@email.com");		
		Contato c4 = new Contato("Contato 3", "18281728", "email3@email.com");		
		
		vetor.adiciona(c1); 
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		int pos = vetor.buscaSemelhante(c4);
		if(pos > -1) {
			System.out.println("O elemento foi encontrado!!");
		} else {
			System.out.println("O elemento não pode ser encontrado");
		}
		
		System.out.println("Tamanho = " + vetor.tamanho());
		System.out.println(vetor);
		
	}
}
