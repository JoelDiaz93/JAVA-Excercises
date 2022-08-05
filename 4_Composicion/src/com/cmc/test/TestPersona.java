package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Persona;

public class TestPersona {
	public static void main(String[] args){
		Persona persona = new Persona();
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Direccion: " + persona.getDireccion());
		
		Direccion dir = persona.getDireccion();
		if(dir != null){
			System.out.println("Direccion calle principal: "+ dir.getCallePrincipal());
		}else{
			System.out.println("La direccion no ha sido asignada");
		}
		
	}
}
