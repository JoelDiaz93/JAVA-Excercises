package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;

public class TestMapaClientes {

	public static void main(String[] args) {
		HashMap<String, Cliente> mapa = new HashMap<String, Cliente>();
		mapa.put("1234567890", new Cliente("1234567890", "Joel"));
		mapa.put("0987654321", new Cliente("0987654321", "Carlos"));

		Cliente c = mapa.get("123567890");
		System.out.println(c);

	}

}
