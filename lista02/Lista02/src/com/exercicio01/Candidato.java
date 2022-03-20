package com.exercicio01;

public class Candidato {

	private String nome_candidato;
	
	//referencia a classe Partido
	private Partido partido;
	
	public Candidato(String nome_candidato, Partido partido) {
		this.nome_candidato = nome_candidato;
		this.partido = partido;
	}
	
	public void mostrarCandidatoPartido() {
		System.out.println("Candidato: " + nome_candidato);
		partido.mostrarDados();
	}
	
}
