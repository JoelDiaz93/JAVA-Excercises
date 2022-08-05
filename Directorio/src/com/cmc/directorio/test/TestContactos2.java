package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Contacto c1 = new Contacto("Joel", "Diaz", new Telefono("movi", "0987654321", 24), 10);
		Contacto c2 = new Contacto("Carlos", "Rosero", new Telefono("movi", "0912365478", 45), 10);

		AdminContactos ac = new AdminContactos();
		Contacto resultado = (ac.buscarMasPesado(c1, c2));
		if (resultado != null) {
			(ac.buscarMasPesado(c1, c2)).imprimir();
		} else {
			System.out.println("Tienen el mismo peso");
		}

		System.out.println("Comparar operadoras: " + ac.compararOperadoras(c1, c2));
	}

}
