package com.exercicio04;

import com.exercicio04.Formato;
import com.exercicio04.Livro;

public class Aplicacao {

	public static void main(String[] args) {
		Livro l = new Livro("Livro A", "Andre");
		Formato f = new Formato ("PDF", 40.0, true, l);
		f.mostrarFormato();
		
		Livro lv = new Livro("Livro A", "Andre");
		Formato ft = new Formato ("FÍSICO", 80.0, false, lv);
		ft.mostrarFormato();
		
		Livro li = new Livro("Livro B", "Ricardo");
		Formato fo = new Formato ("EPUB ", 20.0, true, li);
		fo.mostrarFormato();
	}
}
