package com.seminario.aspectos;

import com.seminario.controladoras.LibroControladora;
import com.seminario.controladoras.SeguimentoControladora;
import com.seminario.clases.*;
import com.seminario.daos.GustoLibroDao;
public aspect SeguimientoGustoLibro {

	boolean estado;
	
	pointcut nomegustaLibro(LibroControladora obj) : execution(* LibroControladora.nomegustaLibro(Libro)) && this(obj);
	
	pointcut megustaLibro(LibroControladora obj) : execution(* LibroControladora.megustaLibro(Libro)) && this(obj);
	
	pointcut megustaLibro2(Libro obj) : call(* LibroControladora.megustaLibro(Libro)) && args(obj);
	
	pointcut nomegustaLibro2(Libro obj) : call(* LibroControladora.nomegustaLibro(Libro)) && args(obj);
	
	pointcut seleccionarLibro(Libro obj) : call(* LibroControladora.seleccionarLibro(Libro)) && args(obj);
	
//	pointcut estadoSeguimiento2(boolean obj) : call(* SeguimentoControladora.actualizarSeguimientoUsuario(boolean)) && args(obj);
	pointcut estadoSeguimiento(SeguimentoControladora obj) : execution(* SeguimentoControladora.devolverSeguimientoUsuario()) && this(obj);
	
//	after(LibroControladora obj) : nomegustaLibro(obj) {
//		System.out.println("No me gusta: " +obj.getLibroSeleccionado().getTitulo()+ ".");
//		
//	}
	
	before(Libro obj) : megustaLibro2(obj) {
		if(estado)//podría ir en la definición del poincut ... && estado
		{
			//System.out.println("Me gusta  : " + obj.getTitulo() + ".");
			GustoLibroDao gld = new GustoLibroDao();
			gld.megustaLibro(obj);
			
			
		}
	}
	
	before(Libro obj) : nomegustaLibro2(obj) {
		if(estado)
		{
			//System.out.println("No me gusta  : " + obj.getTitulo() + ".");
			GustoLibroDao gld = new GustoLibroDao();
			gld.nomegustaLibro(obj);
		}
	}
	before(Libro obj) : seleccionarLibro(obj) {
		if(estado)
		{
			//System.out.println ("Ver detalle Libro: " +  obj.getTitulo() + ".");
			GustoLibroDao gld = new GustoLibroDao();
			gld.seleccionarLibro(obj);
		}
	}
	
	after(SeguimentoControladora obj) : estadoSeguimiento(obj)//estadoSeguimiento: los estados del seguimiento son encendido o apagado
	{
		estado = obj.isEstado();
	}
	
//	before(boolean obj) : estadoSeguimiento2(obj){
//		estado = obj;
//	}
	
//	after(LibroControladora obj) : megustaLibro(obj) {
//		System.out.println("Me gusta: " +obj.getLibroSeleccionado().getTitulo()+ ".");
//		
//	}
}
