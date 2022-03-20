package com.exercicio03;


public class Aplicacao {

	public static void main(String[] args) {
		
		Bateria bat = new Bateria(100);
		Celular cel = new Celular ("Eder",997444587, bat);
		cel.mostrarCelular();
		cel.ligarCelular();
		cel.desligarCelular();
		cel.somLigado();
	}

}
