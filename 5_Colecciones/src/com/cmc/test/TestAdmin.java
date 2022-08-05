package com.cmc.test;

import java.util.ArrayList;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;

public class TestAdmin {

	public static void main(String[] args) {
		AdminPersona admin = new AdminPersona();
		admin.agrear(new Persona("Joel", 23));
		admin.agrear(new Persona("Amy", 18));
		admin.agrear(new Persona("Cami", 40));
		admin.agrear(new Persona("Abigail", 32));

		admin.imprimir();
		Persona personabuscada = admin.buscar("Amy");
		if (personabuscada == null) {
			System.out.println("No existe");
		} else {
			System.out.println("Encontrado: " + personabuscada.getNombre());
		}

		ArrayList<Persona> pm = admin.buscarMayores(32);
		System.out.println(pm.size());
	}

}
