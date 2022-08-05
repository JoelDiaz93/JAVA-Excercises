package com.cmc.test;

import com.cmc.estaticos.Contador;

public class TestContador {
	public static void main(String[] args) {
		Contador contador = new Contador("Objeto1");
		contador.incremenetar();
		contador.imprimir();
		
		Contador c1 = new Contador("Objeto2");
		c1.incremenetar();
		c1.imprimir();
	}
}
