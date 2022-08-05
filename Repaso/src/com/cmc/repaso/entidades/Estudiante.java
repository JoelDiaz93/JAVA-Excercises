package com.cmc.repaso.entidades;

public class Estudiante {
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private double nota;
	@SuppressWarnings("unused")
	private String resultado;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	public void calificar(double nota){
		if(nota>=0 && nota<8){
			this.nota =nota;
			this.resultado = "F";
		}else if(nota>=8 && nota<=10){
			this.nota =nota;
			this.resultado = "A";
		}else{
			System.out.println("La nota debe estar entre 0 a 10");
		}
	}
}
