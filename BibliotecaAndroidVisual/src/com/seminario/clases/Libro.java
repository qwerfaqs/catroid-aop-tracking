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
     public boolean equals(Object other) {
        if (this == other) return true;
        if ( !(other instanceof Libro) ) return false;

        final Libro  libro = (Libro) libre;

        if ( !cat.getTitulo().equals( getTitulo() ) ) return false;
        if ( !cat.getAutor().equals( getAutor() ) ) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = getTitulo().hashCode();
        result = 29 * result + getTitulo().hashCode();
        result = 29 * result + getAutor().hashCode();
        result = 29 * result + getDescripcion().hashCode();
        return result;
    }

}
