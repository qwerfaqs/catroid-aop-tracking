package com.seminario.controladoras;

import java.util.ArrayList;

import com.seminario.clases.Libro;
import com.seminario.daos.LibroDao;
import com.seminario.interfaces.LibroInterfaz;

public class LibroControladora implements LibroInterfaz{

	LibroInterfaz libroDao;
	static Libro libroSeleccionado;
	public LibroControladora() {
		libroDao = new LibroDao();
	}
	public Libro getLibroSeleccionado() {
		return libroSeleccionado;
	}
	public ArrayList<Libro> devolverLibros() {
		return libroDao.devolverLibros();
	}
	public String[] devolverLibrosNombre() {
		return libroDao.devolverLibrosNombre();
	}
	public Libro devolverLibro(String nombre) {
		return libroDao.devolverLibro(nombre);
	}
	/**
	 * Marca un libro como el seleccionado pasando el objecto libro como parametro
	 * @param oLibro Objecto libro a seleccionar
	 */
	public void seleccionarLibro(Libro oLibro) {
		// TODO: esto prodria laburarse contra la persistencia? algo tipo variable de session?
		libroSeleccionado = oLibro;
	}
	/**
	 * 	Marca un libro como el selecionada pasandoles el nombre de dicho libro
	 * @param nombreLibro Nombre del Libro a seleccionar
	 */
	public void seleccionarLibro(String nombreLibro) {
		this.seleccionarLibro(this.devolverLibro(nombreLibro));
	}
	/**
	 * Le marca un ME GUSTA a el libro seleccionado
	 * TODO: Tirar una excepcion cuando el libro no este seleccionado
	 */
	public void megustaLibro() {
		this.megustaLibro(libroSeleccionado);
	}
	/**
	 * Le marca un NO ME GUSTA a el libro seleccionado
	 * TODO: Tirar una excepcion cuando el libro no este seleccionado
	 */
	public void nomegustaLibro() {
		this.nomegustaLibro(libroSeleccionado);
	}
	
	public void megustaLibro(Libro oLibro) {
		//TODO: Hacer algo con el libro
	}
	public void nomegustaLibro(Libro oLibro) {
		//TODO: Hacer algo con el libro
	}
}
