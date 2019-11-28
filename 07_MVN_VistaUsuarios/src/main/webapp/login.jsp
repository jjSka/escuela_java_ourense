<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@include file="head.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%=head()%>
<body>

	<h1>Formulario JSP de Login</h1>
	<form name="form1" action="usuarios.do" method="get">

		<table border="1">

			<tr>
				<td>Email</td>
				<td><input type="email" name="email" id="email" value=""
					placeholder="introduzca email" required="required" /></td>
			</tr>
			<tr>
				<td>Contraseña</td>
				<td><input type="password" name="password" id="password"
					value="" placeholder="inserte contraseña" required="required"
					minlenght="4" /></td>
			</tr>
		</table>
		<input type="submit" value="Login" />
	</form>
</body>
</html>