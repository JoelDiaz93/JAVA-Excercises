package com.clearminds.test;
import com.clearminds.conceptos.Rectangulo;

public class TestRectangulo {
	public static void main(String[] args){
		Rectangulo r1 = new Rectangulo();
		r1.base = 2;
		r1.altura = 10;
		int perimetro = r1.calculadoraPerimetro();
		System.out.println("Perimetro: "+ perimetro);
		
		Rectangulo r2 = new Rectangulo();
		r2.base = 2;
		r2.altura = 5;
		int perimetro2 = r2.calculadoraPerimetro();
		System.out.println("Perimetro: "+ perimetro2);
	}
}
