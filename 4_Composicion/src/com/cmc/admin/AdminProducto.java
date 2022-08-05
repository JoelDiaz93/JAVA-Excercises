package com.cmc.admin;

import com.cmc.entidades.Producto;

public class AdminProducto {
	//comparar: recibe 2 parametros de tipo productos
	//compara los precios de los productos
	//retorna el producto de mayor valor
	
	public Producto obtenerProductoMasCaro(Producto a, Producto b){
		if(a.getPrecio()>b.getPrecio()){
			return a;
		}else if(a.getPrecio()<b.getPrecio()){
			return b;
		}else{
			return null;
		}
	}
}
