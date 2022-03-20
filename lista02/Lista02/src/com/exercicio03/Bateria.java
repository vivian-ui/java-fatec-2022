package com.exercicio03;

public class Bateria {
	private double carga;

	public Bateria(double carga) {
		this.carga = carga;
	}

	public void carrega() {
		carga = carga + 5;
	}
	
	public void descarga() {
		carga = carga -10;
	}
	public double getCarga() {
		return carga;
	}
	
	public void mostrarCarga() {
		System.out.println("Carga: " + carga);
	}
}
