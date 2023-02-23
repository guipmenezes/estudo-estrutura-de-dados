package com.guilherme.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento) {
		for(int i = 0; i < elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	
	public void adiciona(String elemento) throws Exception {
	if(this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	} else {
		throw new Exception("O vetor já está na sua capacidade máxima, não é possível mais adicionar nenhum elemento.");
	}
	}*/
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public boolean adicionaElementoPosicao(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao de busca invalida");
		}
		
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for(int i = this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
			for(int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public Object busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao de busca invalida");
		}
		return this.elementos[posicao];
	}
	
	public int buscaSemelhante(T elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
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
	
	//Exercicio01
	public boolean contem(T elemento) {
		if(buscaSemelhante(elemento) > -1) {
			return true;
		}
		return false;
		//return buscaSemelhante(elemento) > -1;
	}
	
	//Exercicio02
	public int ultimoIndice(T elemento) {

		for (int i = this.tamanho - 1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	//Exercicio03
	public void removeElemento(T elemento) {
		int pos = this.buscaSemelhante(elemento);
		
		if(pos > -1) {
			this.remove(pos);
		}
	}
	
	//Exercicio04
	public T obtem(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Essa posicao eh invalida");
		}
		return this.elementos[posicao];
	}
	
	//Exercicio05
	public void limpar() {
		for(int i = tamanho-1; i >= 0; i--) {
			this.tamanho--;
		}
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
