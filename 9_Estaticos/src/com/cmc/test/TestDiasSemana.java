package com.cmc.test;

import com.cmc.estaticos.DiasSemena;
import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;

public class TestDiasSemana {
	public static void main(String[] args) {
		DiasSemena ds = new DiasSemena();
		int valor = ds.MARTES;
		out.println(valor);

		valor = DiasSemena.MIERCOLES;
		out.println(valor);
		
		double a = PI;
		out.println(a);
		
		double ran = random();
		out.println(ran);
		
	}
}
