package com.cmc.test;

import com.cmc.colecciones.DirectorioMapa;
import com.cmc.entidades.Contacto;

public class TestDirectorioMapa {

	public static void main(String[] args) {
		DirectorioMapa lista = new DirectorioMapa();
		lista.agregarContacto(new Contacto("1234567890", "Karina", "Narvaez"));
		lista.agregarContacto(new Contacto("1234567890", "Amy", "Rosero"));
		lista.agregarContacto(new Contacto("2345612345", "Camila", "Ortega"));
		lista.agregarContacto(new Contacto("0981236778", "Abigail", "Pazminio"));
		lista.agregarContacto(new Contacto("1212123456", "Vanne", "Torres"));
		lista.agregarContacto(new Contacto("3451212567", "Alejandra", "Carrion"));
		lista.imprimir();

		Contacto buscar = lista.buscarContacto("3451212567");
		if (buscar == null) {
			System.out.println("No se encontro al contacto solicitado");
		} else {
			System.out.println(buscar.toString());
		}

		System.out.println("Contacto eliminado:" + lista.eliminarContacto("1234567890"));
		System.out.println("-----------------------Despues de eliminar contacto-----------------");
		lista.imprimir();

	}

}
