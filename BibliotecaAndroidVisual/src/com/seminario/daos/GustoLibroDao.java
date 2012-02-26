package com.seminario.daos;

import com.seminario.clases.Libro;
import com.seminario.utiles.HttpUtil;

public class GustoLibroDao {

	public GustoLibroDao() {
	}
	
	public void megustaLibro(Libro lib)// throws Exception//resolver que se puede hacer con la exepción si la recibe un aspecto
	{
		String get = "";
		HttpUtil http = new HttpUtil();
		String url = "http://seminario2012.herokuapp.com";
		String accion = "registrar_evento";
		String clave = "nombre";
		String valor = lib.getTitulo().replace(" ", "_");
		get = url+"/"+accion+"?"+clave+"="+valor;
		//no se pueden obtener los recursos de string.xml ya que no se puede acceder al contexto al ser la función invocada por un aspecto
		http.doInBackground(get);
	}
}
