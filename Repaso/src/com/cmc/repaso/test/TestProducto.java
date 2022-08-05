package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto p1 = new Producto("Manzana", 0.30);
		p1.setPrecio(0.35);
		System.out.println("Valor con descuento: " + p1.calcularPrecioPromo(10));
		
		Producto p2 = new Producto("Aceite", 1.50);
		p2.setPrecio(-1.80);
		System.out.println("Valor con descuento: " + p2.calcularPrecioPromo(20));
	}
}
