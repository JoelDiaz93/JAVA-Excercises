package com.cmc.estaticos;

public class Contador {
	private int contadoNormal;
	private static int contadorEstatico;
	public String nombre;

	public Contador(String nombre) {
		this.nombre = nombre;
	}

	public void incremenetar() {
		contadoNormal += 1;
		contadorEstatico += 1;
	}

	public void imprimir() {
		System.out.println(nombre + " Contador Normal: " + this.contadoNormal);
		System.out.println(nombre + " Contador Estatico: " + this.contadorEstatico);
	}

}
