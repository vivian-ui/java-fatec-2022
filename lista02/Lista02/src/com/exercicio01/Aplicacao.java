package com.exercicio01;

public class Aplicacao {

	public static void main(String[] args) {
		Partido part = new Partido("Aaa Bbb Ccc Ddd", "XYZ", "ABCD", 171);
		Candidato cand = new Candidato ("Eugido Freitas", part);
		cand.mostrarCandidatoPartido();
	}

}
