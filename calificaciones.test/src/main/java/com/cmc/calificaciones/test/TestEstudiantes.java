package com.cmc.calificaciones.test;

import com.cmc.calificaciones.entidades.Estudiante;
import com.cmc.calificaciones.servicios.AdminEstudiante;

public class TestEstudiantes {

	public static void main(String[] args) {
		AdminEstudiante ae = new AdminEstudiante();
		Estudiante e = new Estudiante("Joel", "Diaz");
		ae.agregar(e);
		System.out.println("Fin");
	}

}
