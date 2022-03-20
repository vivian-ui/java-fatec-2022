package com.exercicio01;

public class Partido {
	private String nome_partido, ideologia, sigla;
	private int numero_partido;
	
	public Partido(String nome_partido, String ideologia, String sigla, int numero_partido) {
		this.nome_partido = nome_partido;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.numero_partido = numero_partido;
	}
	
	public void mostrarDados() {
		System.out.println("Partido: " + nome_partido);
		System.out.println("Ideologia: " + ideologia );
		System.out.println("Sigla: " + sigla);
		System.out.println("Numero do partido: " + numero_partido);
	}
}
