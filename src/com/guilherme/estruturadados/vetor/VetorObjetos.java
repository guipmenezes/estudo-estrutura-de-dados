package com.guilherme.estruturadados.vetor;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanho;
	
	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
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
	
	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adicionaElementoPosicao(int posicao, Object elemento) {
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
			Object[] elementosNovos = new Object[this.elementos.length*2];
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
	
	public int buscaSemelhante(Object elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				System.out.println("A busca encontrou " + elemento + " na posição: " + i);
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
	
	public void removeSemelhante(Object elemento) {
		int pos = this.buscaSemelhante(elemento);
		
		if(pos > -1) {
			this.remove(pos);
			System.out.println("Elemento " + elemento + " na posicao " + pos + " removido");
		} else {
			System.out.println("Não foi possivel remover o elemento");
		}
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
