package com.vn.appusuarios.controladores;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Descriptores de servlets
@WebServlet({"/saludo","/otraurl"})
public class SaludoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String nombre= req.getParameter("nombre");
		res.getWriter().println("<html>");
		res.getWriter().println("<body>"+nombre+"</body>");
		Cookie nombreCookie= new Cookie("nombre_cookie","Valor de la cookie"+nombre);
		res.addCookie(nombreCookie);
		res.getWriter().println("</html>");
	}
}
