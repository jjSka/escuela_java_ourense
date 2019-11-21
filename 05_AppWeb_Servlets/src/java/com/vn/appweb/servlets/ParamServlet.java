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
 *
 * @author PC
 */
public class ParamServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Form y Param</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + request.getContextPath() + "</h1>");
            out.println("<form name='formDatos' action='./formulario' method='POST'>");
            out.println("<label>Nombre: </label>");
            out.println("<input type='text' id='nombre_campo' name='nombre_campo'/>");
            out.println("<label>Email: </label>");
            out.println("<input type='email' id='email_campo' name='email_campo'/>");
            out.println("<input type='submit' value='Envia parametro'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Form y Param</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParamServlet at " + request.getContextPath() + "</h1>");
            String valorCampo = request.getParameter("nombre_campo");
            String regex="[A-Za-z]*";
            if (valorCampo == null || "".equals(valorCampo)) {
                out.println("<p style='color: red'> No se ha recibido el parametro</p>");
            } else {
                if(valorCampo.matches(regex))
                    out.println("<p style='color: green; font-size: 40px;'>Nombre_campo: " + valorCampo.toUpperCase() + ".</p>");
                else
                    out.println("<p style='color: red; font-size: 40px;'>Solo puede contener letras</p>");
            }
            String emailCampo = request.getParameter("email_campo");
            if (valorCampo == null || "".equals(emailCampo)) {
                out.println("<p style='color: red'> No se ha recibido el parametro</p>");
            } else {
                out.println("<p style='color: green; font-size: 40px;'>Nombre_campo: " + emailCampo.toLowerCase() + ".</p>");
            }
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servlet que envía formulario y recibe los parámetros.";
    }// </editor-fold>

}
