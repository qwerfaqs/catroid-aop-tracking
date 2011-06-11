
package aspectos;

import clases.*;

public aspect SiguiendoPrestados{

	
	SiguiendoPrestados() {
		System.out.println("Se creo una nueva instancia del aspecto.");
	}
	
	pointcut pointAfterSacar(Socio obj) : execution(* Socio.sacar(..)) && this(obj);
	
	after(Socio obj) : pointAfterSacar(obj) {
		System.out.println("Se presto un libro al socio " + obj.getNombre() + ".");
		
	}

}
