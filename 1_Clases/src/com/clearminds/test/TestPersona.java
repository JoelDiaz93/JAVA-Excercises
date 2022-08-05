package com.clearminds.test;
import com.clearminds.entidades.Persona;

/*Esta es una clse con 
 * comentarios en lineas */

public class TestPersona {
	public static void main(String[] args){
		Persona p1; //declaro la variable p1 de tipo persona 
		p1 = new Persona(null, 0, 0); //Creo el objeto Persona y lo referencio con p1
		System.out.println("nombre " + p1.getNombre());
		System.out.println("edad " + p1.getEdad());
		System.out.println("estatura " + p1.getEstatura());
		
		p1.setNombre("Joel");
		p1.setEdad(22);
		p1.setEstatura(2.10);
		
		System.out.println("nombre " + p1.getNombre());
		System.out.println("edad " + p1.getEdad());
		System.out.println("estatura " + p1.getEstatura());
	}
	
}
