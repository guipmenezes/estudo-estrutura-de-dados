package com.guilherme.estruturadados.vetor.teste;

import com.guilherme.estruturadados.vetor.Lista;

public class Aula11 {
	
	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Guilherme", "278781782", "guilherme@email.com");
		Contato c2 = new Contato("Marcelo", "87812124", "marcelo@email.com");
		
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		
		System.out.println(vetor);
	}

}
