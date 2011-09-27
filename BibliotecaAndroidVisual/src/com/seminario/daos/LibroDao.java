package com.seminario.daos;

import java.util.ArrayList;

import com.seminario.clases.Libro;
import com.seminario.interfaces.LibroInterfaz;

public class LibroDao implements LibroInterfaz {

	ArrayList<Libro> libros; //otra opción es List
	
	public LibroDao() {
		libros = new ArrayList<Libro>();
		libros.add(new Libro("The Java language specification", "James Gosling", "If you want to know the precise meaning of the languages constructs, this is the source for you..."));
		libros.add(new Libro("Cómo programar en Java", "Harvey M. Deitel", "Comprender un típico entorno de desarrollo en Java. • Entender el papel de Java en el desarrollo de aplicaciones cliente/servidor distribuidas para Internet y Web..."));
		libros.add(new Libro("Java: manual de referencia", "Patrick Naughton", ""));
		libros.add(new Libro("Java para estudiantes", "Douglas Bell", "El alcance de Java En este capítulo estableceremos el escenario. Veremos cómo y por qué Java se convirtió en lo que es y qué novedades hay sobre este lenguaje de programación..."));
		libros.add(new Libro("Java 5- Novedades del Lenguaje", "Marcello Valeri", "Java 5, nombre en código Tiger, es la ultima versión de la plataforma desarrollo Java."));
		libros.add(new Libro("Aplicaciones distribuidas en Java con tecnología RMI", "Fatos Xhafa","Introducción La programación distribuida es uno de los paradigmas más importantes de la programación."));
		libros.add(new Libro("Thinking in Java", "Bruce Eckel", "Thinking in Java— demonstrates advanced topics.Explains sound object-oriented principles as they apply to Java.Hands-on Java CD available online..."));
		
	}
	
	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibros()
	 */
	@Override
	public ArrayList<Libro> devolverLibros()
	{
		return libros;
	}
	
	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibrosNombre()
	 */
	@Override
	public String[] devolverLibrosNombre()
	{
		int i = 0;
		String[] nombres = new String[libros.size()];
		while(i<libros.size())
		{
			nombres[i]=libros.get(i).getTitulo();
			i++;
		}
		return nombres;
	}
	
	/* (non-Javadoc)
	 * @see com.seminario.daos.LibroInterfaz#devolverLibro(java.lang.String)
	 */
	@Override
	public Libro devolverLibro(String nombre)
	{
		int i = 0;
		Libro rta = null;
		while(i<libros.size())
		{
			if(libros.get(i).getTitulo().equals(nombre))
			{
				rta = libros.get(i);
			}
			i++;
		}
		return rta;
	}
}
