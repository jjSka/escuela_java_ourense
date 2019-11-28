<%-- 
    Document   : registrado
    Created on : 21-feb-2019, 23:21:10
    Author     : IEUser
--%>
<%@page import="com.vn.appusuarios.modelo.Usuario"%>
<%@page import="com.vn.appusuarios.modelo.logica.ServicioUsuarios"%>
<%@include file="head.jsp" %>
<%@include file="header.jsp" %>
<%
	//ServicioUsuarios servicioU = (ServicioUsuarios) request.getAttribute("servicioUsu");
%>
<html>
<%=head()%>
<body>
	<h1>Registrado correctamente</h1>
	<h2 style="color: green">
<!-- 		ID: -->
<%-- 		<%=servicioU.leerUno(usuario.getEmail()).getId()%> --%>
<!-- 		Nombre: -->
<%-- 		<%=servicioU.leerUno(usuario.getEmail()).getNombre()%> --%>
<!-- 		Edad: -->
<%-- 		<%=servicioU.leerUno(usuario.getEmail()).getEdad()%> --%>
<!-- 		Password: -->
<%-- 		<%=servicioU.leerUno(usuario.getEmail()).getPassword()%> --%>


		ID:
		<%=usuario.getId()%>
		Nombre:
		<%=usuario.getNombre()%>
		Edad:
		<%=usuario.getEdad()%>
		Password:
		<%=usuario.getPassword()%>

	</h2>
</body>
</html>
