package com.lista01;

public class Equacao2Grau {
	double a,b,c;
	
	public Equacao2Grau(float valora, float valorb, float valorc) {
		this.a = valora;
		this.b = valorb;
		this.c = valorc;
			
	}
	
	
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDelta() {
        return (this.b * this.b) - ( 4 * this.a * this.c);

    }

    public double getRaiz1() {
        return (double) (-b + Math.sqrt(getDelta()))/ (2*a);
    }
    
    public double getRaiz2() {
        return (-b - Math.sqrt(getDelta()))/ (2*a);
    }
       
}
