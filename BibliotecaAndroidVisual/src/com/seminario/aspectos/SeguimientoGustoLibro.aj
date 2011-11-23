package com.seminario.aspectos;

import com.seminario.controladoras.LibroControladora;
import com.seminario.clases.*;
public aspect SeguimientoGustoLibro {

	
	pointcut nomegustaLibro(LibroControladora obj) : execution(* LibroControladora.nomegustaLibro(Libro)) && this(obj);
	
	pointcut megustaLibro(LibroControladora obj) : execution(* LibroControladora.megustaLibro(Libro)) && this(obj);
	
	pointcut megustaLibro2(Libro obj) : call(* LibroControladora.megustaLibro(Libro)) && args(obj);
	
	pointcut nomegustaLibro2(Libro obj) : call(* LibroControladora.nomegustaLibro(Libro)) && args(obj);
	
	pointcut seleccionarLibro(Libro obj) : call(* LibroControladora.seleccionarLibro(Libro)) && args(obj);
	
//	after(LibroControladora obj) : nomegustaLibro(obj) {
//		System.out.println("No me gusta: " +obj.getLibroSeleccionado().getTitulo()+ ".");
//		
//	}
	
	before(Libro obj) : megustaLibro2(obj) {
		System.out.println("Me gusta  : " + obj.getTitulo() + ".");
	}
	
	before(Libro obj) : nomegustaLibro2(obj) {
		System.out.println("No me gusta  : " + obj.getTitulo() + ".");
	}
	before(Libro obj) : seleccionarLibro(obj) {
		System.out.println ("Ver detalle Libro: " +  obj.getTitulo() + ".");
	}
//	after(LibroControladora obj) : megustaLibro(obj) {
//		System.out.println("Me gusta: " +obj.getLibroSeleccionado().getTitulo()+ ".");
//		
//	}
}
