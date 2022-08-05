package com.cmc.flujo.test;
import com.cmc.flujo.Validador;

public class TestValidador {
	public static void main(String[] args){
		Validador validador = new Validador();
		validador.validarEdad(14);
		
		//String msg = validador.validadrEdadMsg(30);
		//System.out.println(msg);
	}
}
