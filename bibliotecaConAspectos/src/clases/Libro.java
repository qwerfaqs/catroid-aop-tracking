package clases;
/*
 * Libro.java
 *
 * Created on 29 de mayo de 2010, 18:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


/**
 *
 * @author alumno
 */
public class Libro
{
    private static int contador = -1;
    private int idLibro;
    private String titulo;

    public Libro(String titulo)
    {
        contador++;
        idLibro = contador;
        this.titulo = titulo;
    }

    public int getIdLibro()
    {
        return idLibro;
    }

    public String getTitulo()
    {
        return titulo;
    }
/*
    public void setIdLibro(int idLibro)
    {
        this.idLibro = idLibro;
    }
*/
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

}
