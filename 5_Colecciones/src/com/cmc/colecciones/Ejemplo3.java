package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo3 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		
		lista.add("asd");
		listaPersonas.add(new Persona("A",23));
		
		String a = lista.get(0);
		Persona p = listaPersonas.get(0);
	}
}
