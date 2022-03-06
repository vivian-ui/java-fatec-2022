package com.lista01;

public class Triangulo {
	float lado1, lado2, lado3;
	String tipo;
	
	public Triangulo(float a, float b, float c) {
		this.lado1 = a;
		this.lado2 = b;
		this.lado3 = c;
		
		//S� ir� existir um tri�ngulo se, somente se, os seus lados obedeceram � seguinte regra: 
		//um de seus lados deve ser maior que o valor absoluto (m�dulo) da diferen�a dos outros dois lados 
		//e menor que a soma dos outros dois lados.
		
		if ((lado1+lado2>lado3) && (lado1+lado3>lado2) && (lado2+lado3>lado1)) {
	        if (lado1 == lado2 && lado1 == lado3) {
	            this.tipo = "equil�tero";
	        } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
	            this.tipo = "is�sceles";
	        } else {
	            this.tipo = "escaleno";
	        }
		}else {
            this.tipo = "N�o � um tri�ngulo";
		}
	}
	
    public float getLado1() {
        return lado1;
    }
    public float getLado2() {
        return lado2;
    }
    public float getLado3() {
        return lado3;
    }
    public String getTipo() {
        return tipo;
    }

    public float getPerimetro() {
        return 3 * this.lado1;
    }

    public float getArea() {
        float p = this.getPerimetro() / 2;
        return (float) Math.sqrt(p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
    }
}
