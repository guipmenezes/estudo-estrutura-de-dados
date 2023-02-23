package com.guilherme.estruturadados.listasencadeadas.teste;

import com.guilherme.estruturadados.listasencadeadas.ListaEncadeada;

public class ListaEncadeadaTeste {
	
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		
		lista.adiciona(1);
		System.out.println(lista);
		System.out.println("Tamanho: " + lista.getTamanho());
		
		lista.adiciona(2);
		lista.adiciona(3);
		System.out.println(lista);
		
		lista.limpa();
		System.out.println(lista);
	}

}
