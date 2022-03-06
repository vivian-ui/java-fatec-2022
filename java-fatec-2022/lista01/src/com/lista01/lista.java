package com.lista01;


public class lista {
	
	public static void main(String[] args) {

//---------- Exercício 1.4 - Triângulo Equilátero (Perímetro/Area) ----------//
	    Triangulo t = new Triangulo(5, 5, 5);
	    System.out.println(t.getTipo());
	    if (t.getTipo() == "equilátero") {
	    	System.out.println(t.getPerimetro());
	    	System.out.println(t.getArea());
	    }
	   // else {
	    //	System.out.println("Não é triangilo equeilátero");
	    //}
//---------- Exercício 1.6 - Equação Segundo garu --------------------------//
	    Equacao2Grau q = new Equacao2Grau (2, 3, 1);
	    if (q.getA() == 0) {
	        System.out.println("Equação inexistente. Coeficiente 'a' inválido");
	    }
	    else {
	       	System.out.println("Delta:" + q.getDelta());
		    if (q.getDelta() >= 0){
		    	System.out.println("Raiz I:" + q.getRaiz1());
		    	System.out.println("Raiz II:" + q.getRaiz2());
		    	}
		    else{
		    	double valordelta = q.getDelta();
		    	valordelta = - valordelta;
	    		System.out.println("Raiz I:" + q.getRaiz1());
	    		System.out.println("Raiz II:" + q.getRaiz2());
	            System.out.println("A equação não possui raízes");
		    }
	    }
//--------------Exercício 1.5 - Jogo de adivinhação ---------------------------//
	    Jogo j = new Jogo();
	    
	    //variaáveis
	    int sorteado, valor;
	    
	    sorteado = j.getSorteio();
	    valor = j.getPalpite();
	    
		while(valor != sorteado) {
			if(valor < sorteado) {
				System.out.println("Número baixo!");
			}else {
				System.out.println("Número alto!");
			}
			//receber um palpite
		    valor = j.getPalpite();
		}	
		System.out.println("Parabéns! Você acertou!");
	    
	  }     
}