/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que genera una respuesta en formato HTTP
 *
 * @author PC
 */
public class HolaHtmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest peticionHttp, HttpServletResponse respuestaHttp) throws IOException {

        //Formato MIME de ficheros conocidos para envio de mails
        respuestaHttp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter salida = respuestaHttp.getWriter()) {
            salida.print("<html>");
            salida.print("<head>");
            salida.print("<link rel=\"stylesheet\" href='/AppWebServlets/HolaCssServlet'/>");
            salida.print("<title>Web HTML desde servlet</title>");
            salida.print("</head>");
            salida.print("<body id='color-azulisimo'>" + "<h1>Web HTML desde Servlet</h1>"
                    + "<h2>Hola que pasa</h2>");
            for (int i = 0; i < 10; i++) {
                salida.print("<li class=\"tamanho_"+i+"\"> Iteración " + i + "</li>");
            }
            salida.print("</ul>");
            salida.println("<br/>Ruta: " + peticionHttp.getContextPath());
            salida.println("<br/>Metodo: " + peticionHttp.getMethod());
            salida.print("</body>");
            salida.print("</html>");
            //salida.close(); ya no hace falta, try  se encarga de cerrarlo. si hay una excepcion try se encarga tambien de cerrarlo
        }
    }
}
