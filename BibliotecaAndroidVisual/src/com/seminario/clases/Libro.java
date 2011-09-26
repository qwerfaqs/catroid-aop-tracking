package com.seminario.clases;

public class Libro {
	int id;
	static int idHist = 0;
	String titulo;
	String autor;
	String descripcion;
	
	public Libro(String titulo, String autor, String descripcion) {
		this.titulo = titulo;
		this.autor = autor;
		this.descripcion=descripcion;
	}
}
