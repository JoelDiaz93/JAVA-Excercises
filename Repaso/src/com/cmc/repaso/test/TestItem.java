package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
	public static void main(String[] args) {
		Item item1 = new Item("Cuaderno", 20);
		item1.imprimir();
		item1.vender(5);
		item1.imprimir();
		item1.vender(40);
		item1.imprimir();
		item1.vender(-2);
		item1.imprimir();
		item1.devolver(5);
		item1.imprimir();
		item1.devolver(-1);
		item1.imprimir();
		
		Item item2 = new Item("Lapiz", 100);
		item2.imprimir();
		item2.vender(30);
		item2.imprimir();
		item2.vender(40);
		item2.imprimir();
		item2.vender(70);
		item2.imprimir();
		item2.vender(-100);
		item2.imprimir();
		item2.devolver(41);
		item2.imprimir();
		item2.devolver(-40);
		item2.imprimir();
	}
}
