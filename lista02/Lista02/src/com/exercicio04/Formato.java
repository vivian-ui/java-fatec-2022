package com.exercicio04;

import com.exercicio04.Livro;

public class Formato {
	private String formato_livro;
	private double preco;
	private boolean disponivel;
	
	//referencia a classe Livro
	private Livro livro;
	
	public Formato(String formato_livro, double preco, boolean disponivel, Livro livro) {
		this.formato_livro = formato_livro;
		this.preco = preco;
		this.livro = livro;
		this.disponivel = disponivel;
	}
	
	public String getFormato_livro() {
		return formato_livro;
	}

	public double getPreco() {
		return preco;
	}

	public void mostrarFormato() {
		if (disponivel == true) {
			System.out.println("Formato: " + formato_livro);
			System.out.println("Preço: " + preco);
			livro.mostrarDados();
		}
	}
}
