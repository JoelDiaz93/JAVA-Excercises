package com.cmc.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio5 {
	public static void main(String[] args) {
		File file = new File("archivo.txt");
		try {
			file.createNewFile();
			String[] a = new String[2];
			a[2] = "adb";
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
