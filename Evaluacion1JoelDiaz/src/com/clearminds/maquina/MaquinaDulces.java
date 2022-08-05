package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(String codigo) {
		celdas.add(new Celda(codigo));
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			System.out.println("CELDA: " + celdas.get(i).getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda buscar;
		for (int i = 0; i < celdas.size(); i++) {
			buscar = celdas.get(i);
			if (buscar.getCodigo().equals(codigo)) {
				return buscar;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = this.buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			if (celdas.get(i).getProducto() == null) {
				System.out.println("CELDA: " + celdas.get(i).getCodigo() + " Stock:" + celdas.get(i).getStock()
						+ " Sin Producto asignado");
			} else {
				System.out.println("CELDA: " + celdas.get(i).getCodigo() + " Stock:" + celdas.get(i).getStock()
						+ " Producto:" + celdas.get(i).getProducto().getCodigo() + " Precio:"
						+ celdas.get(i).getProducto().getPrecio());
			}
		}
		System.out.println("Saldo: " + this.saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda buscar;
		for (int i = 0; i < celdas.size(); i++) {
			buscar = celdas.get(i);
			if (buscar.getCodigo().equals(codigo)) {
				return buscar.getProducto();
			}
		}
		return null;
	}

	public double consultarPrecio(String codigo) {
		Celda buscar;
		for (int i = 0; i < celdas.size(); i++) {
			buscar = celdas.get(i);
			if (buscar.getCodigo().equals(codigo)) {
				return buscar.getProducto().getPrecio();
			}
		}
		return 0;
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda buscar;
		for (int i = 0; i < celdas.size(); i++) {
			if (celdas.get(i).getProducto() != null) {
				buscar = celdas.get(i);
				if (buscar.getProducto().getCodigo().equals(codigo)) {
					return buscar;
				}
			}
		}
		return null;
	}

	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada = this.buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
	}

	public void vender(String codigo) {
		Celda celdaEncontrada = this.buscarCelda(codigo);
		if (celdaEncontrada != null) {
			if (celdaEncontrada.getProducto() != null) {
				celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
				this.saldo += celdaEncontrada.getProducto().getPrecio();
				this.mostrarProductos();
			} else {
				System.out.println("No tiene producto!!!");
			}
		} else {
			System.out.println("Celda no encontrada!!!");
		}
	}

	public double venderConCambio(String codigo, double valor) {
		Celda celdaEncontrada = this.buscarCelda(codigo);
		if (celdaEncontrada != null) {
			if (celdaEncontrada.getProducto() != null) {
				if (celdaEncontrada.getProducto().getPrecio() <= valor) {
					celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
					this.saldo += celdaEncontrada.getProducto().getPrecio();
					return valor - celdaEncontrada.getProducto().getPrecio();
				} else {
					System.out.println("Valor insuficiente para realizar la venta!!!");
					return 0;
				}

			} else {
				System.out.println("No tiene producto!!!");
			}
		} else {
			System.out.println("Celda no encontrada!!!");
		}
		return 0;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Celda c;
		for(int i=0; i<celdas.size();i++){
			c=celdas.get(i);
			if(c.getProducto()!=null){
				if(c.getProducto().getPrecio()<=limite){
					menores.add(c.getProducto());
				}
			}
		}
		return menores;
	}
}
