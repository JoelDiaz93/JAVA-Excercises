package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0987654321", 11);
		Contacto c = new Contacto("Joel", "Diaz", telf, 1);
		
		c.imprimir();

	}

}
