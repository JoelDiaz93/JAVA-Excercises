package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "09941234123", 10);
		telf.imprimir();
		telf.setTieneWhatsapp(true);

		Contacto c1 = new Contacto("Joel", "Diaz", telf, 21);
		AdminContactos ac = new AdminContactos();
		ac.activarUsuario(c1);
		telf.imprimir();
		c1.imprimir();
	}
}
