package com.lista01;


public class lista {
	
	public static void main(String[] args) {

//---------- Exerc�cio 1.4 - Tri�ngulo Equil�tero (Per�metro/Area) ----------//
	    Triangulo t = new Triangulo(5, 5, 5);
	    System.out.println(t.getTipo());
	    if (t.getTipo() == "equil�tero") {
	    	System.out.println(t.getPerimetro());
	    	System.out.println(t.getArea());
	    }
	   // else {
	    //	System.out.println("N�o � triangilo equeil�tero");
	    //}
//---------- Exerc�cio 1.6 - Equa��o Segundo garu --------------------------//
	    Equacao2Grau q = new Equacao2Grau (2, 3, 1);
	    if (q.getA() == 0) {
	        System.out.println("Equa��o inexistente. Coeficiente 'a' inv�lido");
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
	            System.out.println("A equa��o n�o possui ra�zes");
		    }
	    }
//--------------Exerc�cio 1.5 - Jogo de adivinha��o ---------------------------//
	    Jogo j = new Jogo();
	    
	    //varia�veis
	    int sorteado, valor;
	    
	    sorteado = j.getSorteio();
	    valor = j.getPalpite();
	    
		while(valor != sorteado) {
			if(valor < sorteado) {
				System.out.println("N�mero baixo!");
			}else {
				System.out.println("N�mero alto!");
			}
			//receber um palpite
		    valor = j.getPalpite();
		}	
		System.out.println("Parab�ns! Voc� acertou!");
	    
	  }     
}