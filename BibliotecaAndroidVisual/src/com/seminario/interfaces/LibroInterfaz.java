package com.seminario.interfaces;

import java.util.ArrayList;

import com.seminario.clases.Libro;

public interface LibroInterfaz {

	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibros()
	 */
	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibros()
	 */
	public abstract ArrayList<Libro> devolverLibros();

	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibrosNombre()
	 */
	public abstract String[] devolverLibrosNombre();

	public abstract Libro devolverLibro(String nombre);

}