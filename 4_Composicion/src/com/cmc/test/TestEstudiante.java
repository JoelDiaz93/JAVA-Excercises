package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("1234567890", "Joel");
		est1.imprimir();
		Direccion direccion = new Direccion();
		direccion.setCallePrincipal("Av Root");
		direccion.setCalleSecundaria("Sudo");
		direccion.setNumero("Oe1222");
		est1.setDireccion(direccion);
		est1.imprimir();
		
		Estudiante est2 = new Estudiante("0987654321", "Carlos");
		est2.setDireccion(new Direccion("local", "host", "n4322"));
		est2.imprimir();
	}

}
