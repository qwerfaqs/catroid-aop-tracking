package com.seminario.server.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seminario.server.dao.DAOActividad;


@SuppressWarnings("serial")
public class EscuchadorSeguimiento extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// No me acuerdo nada de servlets asi que estoy probando
		String tipo = request.getParameter("tipo");
		String objeto = request.getParameter("objeto");
		DAOActividad dao = new DAOActividad();
		dao.registrarActividad(tipo, objeto);
		
	}

}
