package com.cmc.colecciones;

import java.util.HashMap;

import com.cmc.entidades.Contacto;

public class DirectorioMapa extends Directorio {
	private HashMap<String, Contacto> contactos;

	
	public DirectorioMapa() {
		contactos = new HashMap<String, Contacto>();
	}

	@Override
	public void agregarContacto(Contacto contacto) {
		if(!contactos.containsKey(contacto.getCedula())){
			contactos.put(contacto.getCedula(), contacto);
		}
	}

	@Override
	public Contacto buscarContacto(String cedula) {
		if(contactos.containsKey(cedula)){
			return contactos.get(cedula);
		}
		return null;
	}

	@Override
	public Contacto eliminarContacto(String cedula) {
		Contacto aux = null;
		if(contactos.containsKey(cedula)){
			aux=contactos.get(cedula);
			contactos.remove(cedula);
			return aux;
		}
		return aux;
	}

	@Override
	public void imprimir() {
		contactos.forEach((key, value) -> {
			System.out.println("Nombre: "+value.getNombre()+" Apellido: "+value.getApellido()+" Cedula: "+value.getCedula()+" Telefono: "+value.getTelefonos());
		});
	}
	
	
}
