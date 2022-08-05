package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Amy");
		estudiante1.calificar(4);
		
		Estudiante estudiante2 = new Estudiante("Beatriz");
		estudiante2.calificar(9);
		
		Estudiante estudiante3 = new Estudiante("Carla");
		estudiante3.calificar(-1);
	}

}
