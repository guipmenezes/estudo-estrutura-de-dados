package com.guilherme.estruturadados.filas;

import com.guilherme.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		aumentaCapacidade();
		
		this.adiciona(elemento);
	}
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T desenfileira( ) {
		
		final int POS = 0;
		
		if(this.estaVazia()) {
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoASerRemovido;
		
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	
}
