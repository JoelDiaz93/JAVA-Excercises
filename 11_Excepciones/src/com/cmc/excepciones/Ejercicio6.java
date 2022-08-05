package com.cmc.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio6 {
	private static Logger logger = LogManager.getLogger(Ejercicio6.class);

	public static void main(String[] args) {

		Cuenta c = new Cuenta();
		try {
			String a = null;
			a.toString();
			c.depositar(-100);
		} catch (CheckedException e) {
			System.out.println(e.getMessage());
			logger.error("Error al depositar: ", e);
		} catch (Exception e) {
			System.out.println("Sistema no disponible contactar con 0987654321");
			logger.error("Error no controlado al depositar: ", e);
		}
	}
}
