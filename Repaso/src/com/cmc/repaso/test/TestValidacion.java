package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion = new Validacion();
		System.out.println("Probando metodo con un valor: -3");
		System.out.println(validacion.validarMonto(-3));
		System.out.println("Probando metodo con un valor: 10");
		System.out.println(validacion.validarMonto(10));;
	}

}
