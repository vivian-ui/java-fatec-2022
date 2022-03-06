package com.lista01;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	
	int palpite, numero_sorteado;
	
    public int getSorteio() {
    	Random random = new Random();
		numero_sorteado = random.nextInt(100); //sorteia numeros aleatórios de 0 a 99
        return numero_sorteado;
    }
    
    public int getPalpite() {
		Scanner digitador = new Scanner(System.in);
		//receber um palpite
		System.out.print("Digite um valor de 1 e 99: ");
		palpite = digitador.nextInt();
        return palpite;
    }
}
