package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo4 {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Spiderman",18));
		personas.add(new Persona("Luky",54));
		personas.add(new Persona("Ironman",25));
		
		System.out.println(personas.size());
		
		Persona per = null;
		for(int i = 0; i<personas.size();i++){
			per = personas.get(i);
			System.out.println("Nombre: "+per.getNombre()+"\nEdad: "+per.getEdad());
		}
	}
	
}

