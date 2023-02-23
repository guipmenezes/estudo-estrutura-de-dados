package com.guilherme.estruturadados.base;

import java.lang.reflect.Array;

public class EstruturaEstatica<T> {
	
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica() {}
	
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}

	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	protected boolean adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao de busca invalida");
		}

		this.aumentaCapacidade();

		// mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao de busca invalida");
		}
		
		for(int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
	}
	
	public int tamanho() {
		return this.tamanho;
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
