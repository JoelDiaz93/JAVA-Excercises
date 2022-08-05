package com.cmc.flujo;

public class Validador {
	public void validarEdad(int edad){
		if(edad>18){
			System.out.println("Es mayor de edad");
		}else if (edad<18){
			System.out.println("Es menor de edad");
		}else{
			System.out.println("Su edad es 18");
		}
	}
	
	public String validadrEdadMsg(int edad){
		if(edad>18){
			return "es mayor de edad";
		}else if(edad<18){
			return "es menor de edad";
		}else{
			return "tiene 18 anios";
		}
	}
	
	public boolean validarEdadBool(int edad){
		if(edad >= 18){
			return true;
		}else{
			return false;
		}
	}
}
