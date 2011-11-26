package com.seminario.server.model;
//import com.googlecode.objectify.annotation.*;
import javax.persistence.Id;
public class Actividad {
	@Id Long id;
	String tipo;
	String objeto;
	public Actividad(){
		super();
	}
	public Actividad(String tipo, String objeto) {
		this();
		this.tipo = tipo;
		this.objeto = objeto;
	}

	public String getObjeto() {
		return objeto;
	}
	public String getTipo() {
		return tipo;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Actividad [id=" + id + ", tipo=" + tipo + ", objeto="
				+ objeto + "]";
	}
	

}
