package com.cmc.excepciones;

public class TestCuentas {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		//cuenta.depositar(-4);
		try {
			cuenta.retirar(-5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
