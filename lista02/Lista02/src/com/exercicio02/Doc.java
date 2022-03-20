package com.exercicio02;

public class Doc {
	private double quantia;
	private Cliente cliente;

	public Doc(double quantia, Cliente cliente) {
		this.quantia = quantia;
		this.cliente = cliente;

	}
		
	public double getQuantia() {
		return quantia;
	}

	public void Tranferir(Cliente c1, Cliente c2, double quantia) {
		//sacar do c1, quantia
		c1.sacar(quantia);
		//depositar c2, quantia
		c2.depositar(quantia);
	}
	
	public void mostrarDoc() {
		cliente.mostraDados();
	}
}
