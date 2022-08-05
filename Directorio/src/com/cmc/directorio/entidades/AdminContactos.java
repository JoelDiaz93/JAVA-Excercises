package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto a, Contacto b) {
		if (a.getPeso() > b.getPeso()) {
			return a;
		} else if (a.getPeso() < b.getPeso()) {
			return b;
		} else {
			return null;
		}
	}

	public boolean compararOperadoras(Contacto a, Contacto b) {
		if (a.getTelefono().getOperadora() == b.getTelefono().getOperadora()) {
			return true;
		} else {
			return false;
		}
	}

	public void activarUsuario(Contacto a) {
		Telefono telf = a.getTelefono();
		if(telf.isTieneWhatsapp()){
			a.setActivo(true);
		}else{
			System.out.println("No tiene WhatsApp");
		}
		
	}
}
