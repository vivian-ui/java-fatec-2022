package com.exercicio02;

public class Aplicacao {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria", 200.00, 300.00);
		Cliente c2 = new Cliente("Rosa", 600.00, 1000.00);
		
		Doc doc = new Doc (500, c1);
		doc.Tranferir(c1, c2, 100);
		doc.mostrarDoc();
		c2.mostraDados();

	}

}
