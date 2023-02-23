package com.guilherme.estruturadados.pilhas;

import com.guilherme.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{
	
	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		this.aumentaCapacidade();
		
		super.adiciona(elemento);
		
		//this.elemento[tamanho++] = elemento;
	}
	
	public T topo() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho-1];
	}
	
	public T desempilha() {
		
		if(estaVazia()) {
			return null;
		} 
		/*T elemento = this.elemento[tamanho-1];
		  tamanho--;
		  return elemento;*/
		
		return this.elementos[--tamanho];
	}
	
	public Pilha<Integer> empilhaPares(int quantidade) {
		Pilha<Integer> pilha = new Pilha<>(quantidade);
		
		for (int i = 0; i <= quantidade; i++) {
			if (i % 2 == 0) {
				pilha.empilha(i);
				System.out.println("Empilhando o número " + i);
			}
		}
		
		System.out.println("Todos os números pares foram lidos, agora desempilhando...");
		while(!estaVazia()) {
			System.out.println("Desempilhando um item " + pilha.desempilha());
		}
		
		System.out.println("Todos os elementos foram desempilhados");
		return pilha;
	}
}
