package com.seminario.server.dao;

import java.util.List;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;
import com.seminario.server.model.Actividad;

public class DAOActividad extends DAOBase {
	static {
		ObjectifyService.register(Actividad.class);
	}
	
	public DAOActividad() {
		super();
	}
	public void registrarActividad(String tipo, String objeto){
		Objectify ofy = ObjectifyService.begin();
		Actividad act = new Actividad(tipo, objeto);
		ofy.put(act);
	}
	public List<Actividad> todasActividad() {
		Objectify ofy = ObjectifyService.begin();
		List<Actividad> q = ofy.query(Actividad.class).limit(100).list();
		return q;
	}
}
