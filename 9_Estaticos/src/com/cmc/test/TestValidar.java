package com.cmc.test;

import com.cmc.estaticos.Util;

public class TestValidar {

	public static void main(String[] args) {
		Util util = new Util();
		boolean res = util.validarRango(11);
		System.out.println(res);

		res = Util.validarPositivo(4);
		System.out.println(res);
	}

}
