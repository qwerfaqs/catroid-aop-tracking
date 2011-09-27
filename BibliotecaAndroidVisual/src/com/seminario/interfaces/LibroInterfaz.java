package com.seminario.interfaces;

import java.util.ArrayList;

import com.seminario.clases.Libro;

public interface LibroInterfaz {

	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibros()
	 */
	public abstract ArrayList<Libro> devolverLibros();

	public abstract String[] devolverLibrosNombre();

}