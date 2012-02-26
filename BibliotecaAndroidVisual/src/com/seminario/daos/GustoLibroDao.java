package com.seminario.daos;

import com.seminario.clases.Libro;
import com.seminario.utiles.HttpUtil;

public class GustoLibroDao
{

	public GustoLibroDao()
	{
	}
	
	private String armarString(Libro lib, String evento)
	{
		String get = "";
		String url = "http://seminario2012.herokuapp.com";
		String accion = "registrar_evento";
		String clave = "nombre";
		String valor = lib.getTitulo().replace(" ", "_");
		get = url+"/"+accion+"?"+clave+"="+evento+"_"+valor;
		return get;
	}
	
	public void registrarEvento(Libro lib, String evento)// throws Exception//resolver que se puede hacer con la exepción si la recibe un aspecto
	{
		String url = "";
		
		url = armarString(lib, evento);
		//no se pueden obtener los recursos de string.xml ya que no se puede acceder al contexto al ser la función invocada por un aspecto
		new HttpUtil().execute(url);
	}
	
	public void megustaLibro(Libro lib)
	{
		registrarEvento(lib, "MeGusta");
	}
	
	public void nomegustaLibro(Libro lib)
	{
		registrarEvento(lib, "NoMeGusta");
	}
	
	public void seleccionarLibro(Libro lib)
	{
		registrarEvento(lib, "Seleccionar");
	}
	
}
