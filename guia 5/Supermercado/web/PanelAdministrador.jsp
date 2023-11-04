<%-- 
    Document   : PanelAdministrador
    Created on : 31 oct 2023, 10:09:27
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel del Administrador</title>
    </head>
    <body>
        <div><h1>Sistema Supermercado</h1></div>
        <% String usuario = request.getParameter("tfUsuario");%>
        <div><h2><strong>Bienvenidos, <%= usuario %> !</strong></h2></div>
        
        
        <div><h3>Men&uacute; de opciones</h3></div>
        <div>
            <%@include file="MenuAdministrador.jsp" %>
        </div>
        <div>
            <%@include file="Footer.html" %>
        </div>
    </body>
</html>
