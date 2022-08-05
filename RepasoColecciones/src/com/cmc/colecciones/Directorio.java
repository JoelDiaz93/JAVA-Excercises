package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

public class Directorio {
	public void agregarContacto(Contacto contacto) {
		System.out.println("Metodo agrgarContacto no implementado " + contacto.toString());
	}
	
	public Contacto buscarContacto(String cedula){
		System.out.println("Metodo buscarContacto no implementado");
		return null;
	}
	
	public Contacto eliminarContacto(String cedula){
		System.out.println("Metodo eliminarContacto no implementado");
		return null;
	}
	
	public void imprimir(){
		System.out.println("Imprimiendo");
	}
}
