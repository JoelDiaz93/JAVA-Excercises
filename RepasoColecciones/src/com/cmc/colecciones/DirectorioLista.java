package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio {
	private ArrayList<Contacto> contactos;

	public DirectorioLista() {
		contactos = new ArrayList<Contacto>();
	}
	
	

	@Override
	public String toString() {
		return "DirectorioLista [contactos=" + contactos + "]";
	}



	@Override
	public void agregarContacto(Contacto contacto) {
		boolean encotrado=false;
		if (contactos.isEmpty()) {
			contactos.add(contacto);
		} else {
			for(Contacto c:contactos){
				if(!c.getCedula().equals(contacto.getCedula())){
					encotrado=true;
					break;
				}
			}
			if(encotrado){
				contactos.add(contacto);
			}else{
				System.out.println("Ya esta registrado esta cedula");
			}
		}
	}

	@Override
	public Contacto buscarContacto(String cedula) {
		for (Contacto c : contactos) {
			if (c.getCedula().equals(cedula)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Contacto eliminarContacto(String cedula) {
		Contacto aux = null;
		for (int i=0; i< contactos.size();i++) {
			if (contactos.get(i).getCedula().equals(cedula)) {
				aux = contactos.get(i);
				contactos.remove(i);
			}
		}
		
		return aux;
	}

	//@Override
	public void imprimir() {
		for (Contacto c : contactos) {
			System.out.println(c.toString());
		}
	}

}
