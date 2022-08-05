
package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double Saldo;

	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		this.celda1 = new Celda(cod1);
		this.celda2 = new Celda(cod2);
		this.celda3 = new Celda(cod3);
		this.celda4 = new Celda(cod4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Codigo Celda 1: " + celda1.getCodigo() + "\nCodigo Celda 2: " + celda2.getCodigo()
				+ "\nCodigo Celda 3: " + celda3.getCodigo() + "\nCodigo Celda 4: " + celda4.getCodigo() + "\nSaldo: "
				+ this.Saldo);
	}

	public Celda buscarCelda(String celda) {
		if (celda1.getCodigo() == celda) {
			return celda1;
		} else if (celda2.getCodigo() == celda) {
			return celda2;
		} else if (celda3.getCodigo() == celda) {
			return celda3;
		} else if (celda4.getCodigo() == celda) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = this.buscarCelda(codigo);
		celdaRecuperada.setProducto(producto);
		celdaRecuperada.setStock(cantidad);
	}

	public void mostrarProductos() {
		if (celda1.getProducto() == null) {
			System.out.println("******************CELDA " + this.celda1.getCodigo() + "\nStock: "
					+ this.celda1.getStock() + "\nLa celda no tiene producto!!!");
		} else {
			System.out.println("******************CELDA " + this.celda1.getCodigo() + "\nStock: " + celda1.getStock()
					+ "\nProducto: " + celda1.getProducto().getNombre() + "\nPrecio: "
					+ celda1.getProducto().getPrecio() + "\nCodigo: " + celda1.getProducto().getCodigo());
		}
		if (celda2.getProducto() == null) {
			System.out.println("******************CELDA " + this.celda2.getCodigo() + "\nStock: "
					+ this.celda2.getStock() + "\nLa celda no tiene producto!!!");
		} else {
			System.out.println("******************CELDA " + this.celda2.getCodigo() + "\nStock: " + celda2.getStock()
					+ "\nProducto: " + celda2.getProducto().getNombre() + "\nPrecio: "
					+ celda2.getProducto().getPrecio() + "\nCodigo: " + celda2.getProducto().getCodigo());
		}
		if (celda3.getProducto() == null) {
			System.out.println("******************CELDA " + this.celda3.getCodigo() + "\nStock: "
					+ this.celda3.getStock() + "\nLa celda no tiene producto!!!");
		} else {
			System.out.println("******************CELDA " + this.celda3.getCodigo() + "\nStock: " + celda3.getStock()
					+ "\nProducto: " + celda3.getProducto().getNombre() + "\nPrecio: "
					+ celda3.getProducto().getPrecio() + "\nCodigo: " + celda3.getProducto().getCodigo());
		}
		if (celda4.getProducto() == null) {
			System.out.println("******************CELDA " + this.celda4.getCodigo() + "\nStock: "
					+ this.celda4.getStock() + "\nLa celda no tiene producto!!!");
		} else {
			System.out.println("******************CELDA " + this.celda4.getCodigo() + "\nStock: " + celda4.getStock()
					+ "\nProducto: " + celda4.getProducto().getNombre() + "\nPrecio: "
					+ celda4.getProducto().getPrecio() + "\nCodigo: " + celda4.getProducto().getCodigo());
		}
		System.out.println("======> Saldo:" + this.Saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda resultado = this.buscarCelda(codigo);
		return resultado.getProducto();
	}

	public double consultarPrecio(String codigo) {
		Celda resultado = this.buscarCelda(codigo);
		return resultado.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigo) {
		if(celda1.getProducto()!=null){
			if (celda1.getProducto().getCodigo() == codigo) {
				return celda1;
			}
		}else if(celda2.getProducto()!=null){
			if (celda2.getProducto().getCodigo() == codigo) {
				return celda2;
			}
		}else if(celda3.getProducto()!=null){
			if (celda3.getProducto().getCodigo() == codigo) {
				return celda3;
			}
		}else if(celda4.getProducto()!=null){
			if (celda4.getProducto().getCodigo() == codigo) {
				return celda4;
			}
		}else{
			return null;
		}
		return null;
	}

	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada = this.buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
	}

	public void vender(String codigo) {
		Celda resultado = this.buscarCelda(codigo);
		resultado.setStock(resultado.getStock() - 1);
		this.Saldo += resultado.getProducto().getPrecio();
		this.mostrarProductos();
	}

	public double venderConCambio(String codigo, double valor) {
		Celda resultado = this.buscarCelda(codigo);
		resultado.setStock(resultado.getStock() - 1);
		this.Saldo += resultado.getProducto().getPrecio();
		return valor - resultado.getProducto().getPrecio();
	}
}
