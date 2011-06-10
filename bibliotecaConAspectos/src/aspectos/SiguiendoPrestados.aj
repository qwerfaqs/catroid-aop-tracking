//probando TortoiseHg
package aspectos;

import clases.Biblioteca;;
public aspect SiguiendoPrestados {
	pointcut seguirPrestado() : execution(* Biblioteca.sacar(..));
	
	after() returning() : seguirPrestado() {
		System.out.println("Se presto un libro.");
	}

}
