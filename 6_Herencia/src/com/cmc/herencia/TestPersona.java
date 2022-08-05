package com.cmc.herencia;

public class TestPersona {
	public static void main(String[] args) {
		Persona persona = new Persona("Joel", "Diaz");
		System.out.println(persona);
		System.out.println(persona.hashCode());
		System.out.println(persona.toString());
	}
}
