package com.clearminds.test;
import com.clearminds.conceptos.Calculadora;

public class TestCalculadora {
	/**
	 * @param args
	 */
	public static void main(String[]args){
		Calculadora c = new Calculadora();
		int resultado = c.sumar(3, 55);
		System.out.println("resultado: " + resultado);
		c.imprimir(); 
	}
}
