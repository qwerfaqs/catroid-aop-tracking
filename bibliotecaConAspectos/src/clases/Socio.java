package clases;
/*
 * Socio.java
 *
 * Created on 29 de mayo de 2010, 18:18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author alumno
 */
public class Socio
{
    private Biblioteca biblioteca;
    private String nombre;

    public Socio(Biblioteca biblioteca, String nombre)
    {
        this.biblioteca = biblioteca;
        this.nombre = nombre;
    }

    public Libro sacar(int idLibro)
    {
        return biblioteca.sacar(idLibro);
    }
    
    public void meter(Libro libro)
    {
        biblioteca.meter(libro);
    }

}
