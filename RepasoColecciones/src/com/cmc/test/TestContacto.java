package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestContacto {
	public static void main(String[] args) {
		Contacto contactos = new Contacto("1234567890", "Joel", "Diaz");
		contactos.agregarTelefono(new Telefono("movi", "098877665"));
		
		System.out.println(contactos);
	}
}
