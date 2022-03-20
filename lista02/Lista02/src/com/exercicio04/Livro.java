package com.exercicio04;

public class Livro {
	private String nome_livro, autor;
	
	
	public Livro(String nome_livro, String autor) {
		this.nome_livro = nome_livro;
		this.autor = autor;
	}
	
	public void mostrarDados() {
		System.out.println("Livro: " + nome_livro);
		System.out.println("Autor: " + autor );
		System.out.println("----------------------------------------------");

	}
}
