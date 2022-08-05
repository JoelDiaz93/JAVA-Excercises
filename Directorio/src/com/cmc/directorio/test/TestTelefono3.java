package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0987654321", 20);
		Telefono telf2 = new Telefono("movi", "1234567890", 15);
		Telefono telf3 = new Telefono("claro", "0987456798", 13);
		
		AdminTelefono at = new AdminTelefono();
		int contar = at.contarMovi(telf1, telf2, telf3);
		System.out.println("Numeros movi totales: " + contar);
	}

}
