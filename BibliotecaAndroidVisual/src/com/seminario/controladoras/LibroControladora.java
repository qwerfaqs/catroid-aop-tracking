package com.seminario.controladoras;

import java.util.ArrayList;

import com.seminario.clases.Libro;
import com.seminario.daos.LibroDao;
import com.seminario.interfaces.LibroInterfaz;

public class LibroControladora implements LibroInterfaz{

	LibroInterfaz libroDao;
	
	public LibroControladora() {
		libroDao = new LibroDao();
	}
	@Override
	public ArrayList<Libro> devolverLibros() {
		return libroDao.devolverLibros();
	}
	@Override
	public String[] devolverLibrosNombre() {
		return libroDao.devolverLibrosNombre();
	}

}
