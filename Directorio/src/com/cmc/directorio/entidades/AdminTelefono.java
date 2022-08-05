package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf) {
		if (telf.getOperadora() == "movi") {
			telf.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int aux = 0;
		if(telf1.getOperadora()=="movi"){
			aux+=1;
		}
		if(telf2.getOperadora()=="movi"){
			aux+=1;
		}
		if(telf3.getOperadora()=="movi"){
			aux+=1;
		}
		return aux;
	}
	
	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
		int aux = 0;
		if(telf1.getOperadora()=="claro"){
			aux+=1;
		}
		if(telf2.getOperadora()=="claro"){
			aux+=1;
		}
		if(telf3.getOperadora()=="claro"){
			aux+=1;
		}
		if(telf4.getOperadora()=="claro"){
			aux+=1;
		}
		return aux;
	}
}
