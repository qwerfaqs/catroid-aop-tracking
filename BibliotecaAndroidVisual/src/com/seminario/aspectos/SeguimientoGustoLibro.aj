package com.seminario.aspectos;

import com.seminario.clases.ClickNoMeGustaLibro;
public aspect SeguimientoGustoLibro {

	pointcut noMeGusta() : execution(*  ClickNoMeGustaLibro.onClick(..));
	
	after() returning() : noMeGusta() {
		System.out.println("No me gusta un libro.");
	}
}
