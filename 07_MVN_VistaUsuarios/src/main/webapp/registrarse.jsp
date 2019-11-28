<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@include file="head.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <%= head()%>

    <body>
        <%@include file="header.jsp" %>
        <h1>Formulario JSP de registro</h1> 
        <%
            Object mensajeDeError = request.getSession().getAttribute("mensajeError");
            if(mensajeDeError!= null)%>
            <p style="color: red"><%=(String)mensajeDeError%></p>
            <%
                request.getSession().removeAttribute("mensajeError");
            %>
        <form name="form1" action="usuarios.do" method="post">

            <table border="1">
                <tr><td>Nombre:</td><td>
                        <input type="text" name="nombre" id="nombre" size="25" value="" placeholder="inserte nombre"
                               required="required" pattern="^[A-Z][a-z]+ ?[A-Za-z]*$"/>  </td></tr>
                <tr><td>Edad:</td><td>
                        <input type="number" name="edad" id="edad" value="" placeholder="inserte edad"
                               required="required" min="12"/>  </td></tr> 
                <tr><td>Email</td><td>
                        <input type="email" name="email" id="email" value="" placeholder="introduzca email"
                               required="required"/>  </td></tr> 
                <tr><td>Contraseņa</td><td>
                        <input type="password" name="password" id="password" value="" placeholder="inserte contraseņa"
                               required="required" minlenght="4"/>  </td></tr> 
            </table>
            <input type="submit" value="Registrate"/>
        </form>
    </body>
</html>