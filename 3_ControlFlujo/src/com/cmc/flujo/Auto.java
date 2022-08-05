package com.cmc.flujo;

public class Auto {
	private int cantidadGasolina;
	private int capacidadTanque;

	public Auto(int capacidadTanque) {
		if (capacidadTanque < 0) {
			System.out.println("No se aceptan valores negativos");
		} else {
			this.capacidadTanque = capacidadTanque;
		}
	}

	public void cargarGasolina(int cantidad) {
		if (cantidad + this.cantidadGasolina > this.capacidadTanque) {
			System.out.println("Supera la cantidad de gasolina");
		} else {
			this.cantidadGasolina += cantidad;
		}
	}

	public int getCantidadGasolina() {
		return cantidadGasolina;
	}
}
