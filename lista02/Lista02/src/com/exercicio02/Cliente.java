package com.exercicio02;

public class Cliente {
		private String nome;
		private double saldo, limite, checar;
	
	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}
	
	public void sacar(double val) {
		if (checar >= val) {
			saldo = saldo - val;
		}else {
			System.out.println("Saldo insufieciente");
		}
	}
	
	public void depositar(double val) {
		saldo = saldo + val;
	}
	
	public double checarSaldo() {
		checar = saldo + limite;
		return checar;
	}
	
	public void mostraDados() {
		System.out.println("Cliente: " + nome);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println("----------------------------------");
	}
	
}
