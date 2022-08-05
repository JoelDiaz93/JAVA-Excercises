package com.cmc.test;

import com.cmc.entidades.Contacto;

public class TestContactos {
	public static void main(String[] args) {
		Contacto [] contactos = new Contacto[5];
		contactos[0]=new Contacto("123","Joel");
		contactos[1]=new Contacto("423","Carlos");
		contactos[2]=new Contacto("523","Cami");
		contactos[3]=new Contacto("923","Ale");
		contactos[4]=new Contacto("023","Vanne");
		
		Contacto c = contactos[2];
		System.out.println(c);
		
		for(int i =0; i<contactos.length;i++){
			System.out.println(contactos[i]);
		}
	}
}
