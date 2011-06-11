
package aspectos;

import clases.*;

public aspect SiguiendoPrestados{

	
	SiguiendoPrestados() {
		System.out.println("Se creo una nueva instancia del aspecto.");
	}
	
	
	pointcut afterSacar() : execution(* Socio.sacar(..));
	
	after() : afterSacar() {
		System.out.println("Se presto un libro al socio "+".");
		
	}

}
