package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosVendidos;
	private int productosDevueltos;

	public Item(String nombre, int productosActuales) {
		this.nombre = nombre;
		this.productosActuales = productosActuales;
	}

	public void imprimir() {
		System.out.println("**********************************");
		System.out.println("Producto: " + this.nombre);
		System.out.println("Cantidad actual: " + this.productosActuales);
		System.out.println("Cantidad devuelta: " + this.productosDevueltos);
		System.out.println("Cantidad vendida: " + this.productosVendidos);
		System.out.println("**********************************");
	}

	public void vender(int cantidad) {
		if (cantidad > 0 && cantidad <= this.productosActuales) {
			this.productosActuales -= cantidad;
			this.productosVendidos += cantidad;
		} else {
			System.out.println("Ingresar una cantidad valida");
		}
	}

	public void devolver(int cantidad) {
		if (cantidad > 0) {
			this.productosActuales += cantidad;
			this.productosVendidos -= cantidad;
			this.productosDevueltos += cantidad;
		} else {
			System.out.println("Ingresar una cantidad valida");
		}
	}
}
