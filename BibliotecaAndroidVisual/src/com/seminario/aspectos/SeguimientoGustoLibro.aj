package com.seminario.aspectos;

import com.seminario.controladoras.LibroControladora;
import com.seminario.clases.*;
public aspect SeguimientoGustoLibro {

	
	pointcut nomegustaLibro(LibroControladora obj) : execution(* LibroControladora.nomegustaLibro(Libro)) && this(obj);
	
	pointcut megustaLibro(LibroControladora obj) : execution(* LibroControladora.megustaLibro(Libro)) && this(obj);
	
	after(LibroControladora obj) : nomegustaLibro(obj) {
		System.out.println("No me gusta: " +obj.getLibroSeleccionado().getTitulo()+ ".");
		
	}
	
	after(LibroControladora obj) : megustaLibro(obj) {
		System.out.println("Me gusta: " +obj.getLibroSeleccionado().getTitulo()+ ".");
		
	}
}
