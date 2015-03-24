package br.com.sisnema.syslocadora1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			String usuario = request.getParameter("usuario");
			String senha = request.getParameter("senha");
			if("aluno".equals(usuario) && "123".equals(senha)){
				response.sendRedirect("inicio.jsp");
			}else{
				response.sendRedirect("login.jsp");
				
			}
	
	}

}
