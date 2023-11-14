<%-- 
    Document   : Login
    Created on : 31 oct 2023, 09:50:32
    Author     : flores cortez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.Date" %>

<!DOCTYPE html>
<html>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    <body>
        <form method="POST" action="/Supermercado/ServletPrincipal?accion=Login" id="formLogin">
            <div id="resultLogin"></div>
            <div><h1>Bienvenido al Sistema del Supermercado</h1></div>
            
           <c:set var="fechaHoraActual" value="<%= new java.util.Date() %>" />
            <fmt:formatDate value="${fechaHoraActual}" pattern="dd/MM/yyyy HH:mm:ss" var="fechaHoraFormateada" />
             
            <div><label><strong>
                        <p>Fecha y Hora Actual: ${fechaHoraFormateada}</p>
            </strong></label></div><br>
            <div><label>Usuario:</label></div>
            <div><input type="text" name="tfUsuario" id="idtfUsuario"></div><br>
            <div><label>Contraseña:</label></div>
            <div><input type="password" name="tfContrasenia" id="tfContrasenia"></div><br>
            <div><input type="submit" value="Iniciar Sesi&oacute;n"></div>
        </form>
    </body>
</html>
