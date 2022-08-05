package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

public class DirectorioArreglo extends Directorio {
	private Contacto[] contactos;
	private int elementos;

	public DirectorioArreglo() {
		contactos = new Contacto[10];
	}

	@Override
	public void agregarContacto(Contacto contacto) {
		boolean encontrado = false;
		if (elementos == 0) {
			contactos[elementos] = contacto;
			elementos++;
		} else {
			for (int i = 0; i < elementos; i++) {
				if (contactos[i].getCedula().equals(contacto.getCedula())) {
					encontrado = true;
					break;
				}
			}
			if (encontrado) {
				System.out.println("Cedula ya esta registrada");
			} else {
				contactos[elementos] = contacto;
				elementos++;
			}
		}

	}

	@Override
	public Contacto buscarContacto(String cedula) {
		for (int i = 0; i < elementos; i++) {
			if (contactos[i].getCedula().equals(cedula)) {
				return contactos[i];
			}
		}
		return null;
	}

	@Override
	public Contacto eliminarContacto(String cedula) {
		Contacto[] aux = new Contacto[10];
		Contacto res = null;
		int delete = -1;

		for (int i = 0; i < contactos.length - 1; i++) {
			if (contactos[i].getCedula() == cedula) {
				res = contactos[i];
				elementos--;
				aux = new Contacto[contactos.length - 1];
				for (int index = 0; index < i; index++) {
					aux[index] = contactos[index];
				}
				for (int j = i; j < contactos.length - 1; j++) {
					aux[j] = contactos[j + 1];
				}
				break;
			}
		}
		this.contactos = aux;
		return res;
	}

	@Override
	public void imprimir() {
		for (int i = 0; i < elementos; i++) {
			System.out.println("Nombre: " + contactos[i].getNombre() + " Apellido: " + contactos[i].getApellido()
					+ " Cedula: " + contactos[i].getCedula() + " Telefono: " + contactos[i].getTelefonos());
		}
	}

}
