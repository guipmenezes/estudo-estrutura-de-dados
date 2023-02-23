package com.guilherme.estruturadados.pilhas.labs;

public class Livro {
	
	private String nome;
	private String isbn;
	private Integer ano;
	private String autor;
	
	public Livro() {
		
	}
	
	public Livro(String nome, String isbn, Integer ano, String autor) {
		this.nome = nome;
		this.isbn = isbn;
		this.ano = ano;
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", isbn=" + isbn + ", ano=" + ano + ", autor=" + autor + "]";
	}

	//No meu exemplo eu não adicionei Getters and Setters, mas a Loiane adicionou
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
