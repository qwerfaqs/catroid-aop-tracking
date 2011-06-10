package clases;
/*
 * Biblioteca.java
 *
 * Created on 29 de mayo de 2010, 18:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.util.Hashtable;

/**
 *
 * @author alumno
 */
public class Biblioteca
{
    Hashtable<Integer,Libro> libros;

    /** Creates a new instance of Biblioteca */
    public Biblioteca()
    {
        libros = new Hashtable<Integer,Libro>();
       
    }
    public synchronized void meter(Libro libro)
    {
        libros.put(libro.getIdLibro(), libro);
        notifyAll();
    }
    public synchronized Libro sacar(int idLibro)
    {
        Libro libro;
        libro = libros.get(idLibro);
        while(libros.get(idLibro) == null) 
        {
            try {wait();}catch(Exception ex){}
        }
            libros.remove(idLibro);
        return libro;
    }
    
}
