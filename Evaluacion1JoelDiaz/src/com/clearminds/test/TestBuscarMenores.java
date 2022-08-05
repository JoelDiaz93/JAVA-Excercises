package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		maquina.agregarCelda("E");
		maquina.agregarCelda("F");

		maquina.cargarProducto(new Producto("QWER", "Doritos", 0.50), "A", 5);
		maquina.cargarProducto(new Producto("ASDF", "Gatorade", 2.54), "B", 9);
		maquina.cargarProducto(new Producto("ZXCV", "Papas", 0.60), "C", 3);
		maquina.cargarProducto(new Producto("TYUI", "Agua", 0.40), "D", 15);
		maquina.cargarProducto(new Producto("HJKL", "Gaseosa", 0.45), "E", 10);
		maquina.cargarProducto(new Producto("POIU", "Chocolate", 1.20), "F", 8);

		maquina.mostrarProductos();

		System.out.println("Cantidad de productos menores: " + maquina.buscarMenores(0.45).size());
		;
	}
}
