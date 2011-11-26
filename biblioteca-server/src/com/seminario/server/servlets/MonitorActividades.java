package com.seminario.server.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.seminario.server.dao.DAOActividad;
import com.seminario.server.model.Actividad;

@SuppressWarnings("serial")
public class MonitorActividades extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAOActividad dao = new DAOActividad();
		dao.getClass();
//		List<Actividad> actividades = dao.todasActividad();
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">");
        out.println("<html>");
        out.println("<head><title>Monitor de Actividades</title></head>");
        out.println("<body>");
        out.println("<h1>¡Bienvenido a el Monitor de Actividades!</h1>");
        out.println("<h3>-=Listado de Actividades=-</h3>");
        out.println("<ol>");
//        Iterator<Actividad> iterador = actividades.iterator();
//        while (iterador.hasNext()) {
//			Actividad actividad = (Actividad) iterador.next();
//        }
		//	out.println(actividad);
//			out.println("<li>Tipo: "+actividad.getTipo()+" Objeto: "+actividad.getObjeto()+"</li>");
//		}
        Objectify ofy = ObjectifyService.begin();

        Iterable<Key<Actividad>> allKeys = ofy.query(Actividad.class).fetchKeys();
        for (Key<Actividad> key : allKeys) {
			out.println(key);
		}
        out.println("</ol>");
        out.println("</body></html>");
	}

}
