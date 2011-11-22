package com.seminario.aspectos;

import com.seminario.controladoras.LibroControladora;
import com.seminario.clases.Libro;
public aspect SeguimientoGustoLibro {

	pointcut noMeGusta() : execution(*  LibroControladora.nomegustaLibro(Libro));
	
	after() returning() : noMeGusta() {
		System.out.println("No me gusta un libro.");
	}
}
