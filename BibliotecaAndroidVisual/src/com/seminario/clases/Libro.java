package com.seminario.clases;

public class Libro {
	int id;
	static int idHist = 0;
	String titulo;
	String autor;
	String descripcion;

	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
        if ( !(other instanceof Libro) ) return false;

        final Libro  libro = (Libro) other;

        if ( !libro.getTitulo().equals( getTitulo() ) ) return false;
        //if ( !libro.getAutor().equals( getAutor() ) ) return false;//no manejo los componentes visuales lo suficiente como para distinguir objetos de libros que difieran en el titulo

        return true;
	}

	@Override
	public int hashCode() {
		int result;
		result = getTitulo().hashCode();
		result = 29 * result + getTitulo().hashCode();
		result = 29 * result + getAutor().hashCode();
		result = 29 * result + getDescripcion().hashCode();
		return result;
	}
	
	public Libro(String titulo, String autor, String descripcion) {
		id = idHist;
		idHist++;
		this.titulo = titulo;
		this.autor = autor;
		this.descripcion=descripcion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getId() {
		return id;
	}
}
