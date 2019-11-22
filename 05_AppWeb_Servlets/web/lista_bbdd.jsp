<%-- 
    Document   : lista_bbdd
    Created on : 22-nov-2019, 11:24:36
    Author     : PC
--%>

<%@page import="com.vn.appweb.modelo.ConsultaSQL"%>
<%@page import="java.util.List"%>
<%@page import="com.vn.appweb.modelo.DatosPersona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado JSP con DerbyDB</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.println("<p>Hola desde Java" + request.getContextPath() + "</p>");
        %>
        <br/>
        <%
            for (int i = 0; i < 10; i++) {
        %>
    <li>Número <%= i%> </li>
        <%}
            ConsultaSQL conSQL = new ConsultaSQL();
            String nombreBusq= request.getParameter("nombre_busq");
            List<DatosPersona> listaDP = conSQL.leerTabla(nombreBusq);
        %>
    
        <br/>
        
        <form name="formBusq" method="GET" action="./lista_bbdd.jsp">
            <input name="nombre_busq" type="text" placeholder="Introduzca la busqueda.." size="40"/>
            <input type="submit" value="Buscar"/>
        </form>
    <table>
        <thead>
        <th>Nombre</th>
        <th>Email</th>
    </thead>
    <tr>
        <% for (DatosPersona dp : listaDP) {
        %><td><%out.println(dp.getNombre());%></td>
        <td><%out.println(dp.getEmail());%></td>
        <% }%>
    </tr>
</table>
</body>
</html>
