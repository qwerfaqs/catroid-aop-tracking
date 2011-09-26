package clases;
/*
 * Main.java
 *
 * Created on 29 de mayo de 2010, 18:02
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Main
{
    
    /** Creates a new instance of Main */
    public Main()
    {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro0 = new Libro("rebelion");
        Libro libro1 = new Libro("tunel");
        Libro libro2 = new Libro("aleph");
        Libro libro3 = new Libro("2012");
        Libro libro4 = new Libro("1948");
        biblioteca.meter(libro0);
        biblioteca.meter(libro1);
        biblioteca.meter(libro2);
        biblioteca.meter(libro3);
        biblioteca.meter(libro4);
        
        for(int i=0;i<10;i++)
        {
            String nombre = ""+i;
            Socio s = new Socio(biblioteca, nombre);
            s.sacar(i);
        }
        
    }
    
}
