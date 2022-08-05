package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		AdminProducto admin = new AdminProducto();
		Producto uno = new Producto("papas", 0.50);
		Producto dos = new Producto("Doritos", 0.50);
		Producto caro = admin.obtenerProductoMasCaro(uno, dos);
		if(caro == null){
			System.out.println("Tienen el mismo precio");
		}else{
			System.out.println("El mas caro es: " + caro.getNombre());
		}
		
	}
}
