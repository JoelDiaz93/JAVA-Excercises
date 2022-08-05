package com.cmc.flujo.test;
import com.cmc.flujo.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto = new Auto(60);
		System.out.println(auto.getCantidadGasolina());
		auto.cargarGasolina(10);
		System.out.println(auto.getCantidadGasolina());
		auto.cargarGasolina(40);
		System.out.println(auto.getCantidadGasolina());
		auto.cargarGasolina(30);
		System.out.println(auto.getCantidadGasolina());
	}

}
