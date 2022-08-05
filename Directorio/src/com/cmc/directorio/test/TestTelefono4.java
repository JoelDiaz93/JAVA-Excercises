package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {
	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "0987654321", 20);
		Telefono telf2 = new Telefono("movi", "1234567890", 15);
		Telefono telf3 = new Telefono("claro", "0987456798", 13);
		Telefono telf4 = new Telefono("claro", "0989939398", 29);

		AdminTelefono at = new AdminTelefono();
		System.out.println("Numeros claro totales: " + at.contarClaro(telf1, telf2, telf3, telf4));
	}
}
