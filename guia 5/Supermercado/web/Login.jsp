<%-- 
    Document   : Login
    Created on : 31 oct 2023, 09:50:32
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    <body>
        <form method="POST" action="/Supermercado/ServletPrincipal?accion=Login" id="formLogin">
            <div id="resultLogin"></div>
            <div><h1>Bienvenido al Sistema del Supermercado</h1></div>
            <div/><label>Fecha actual: </label><br></div>
            
            <%
                java.util.Date fechaActual  = new java.util.Date();
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
                String fechaActualLegible = sdf.format(fechaActual);
            %>
            <p>Fecha actual: <strong><%= fechaActualLegible%></strong></p><br>
            
            <div><label>Usuario:</label></div>
            <div><input type="text" name="tfUsuario" id="idtfUsuario"></div><br>
            <div><label>Contraseña:</label></div>
            <div><input type="password" name="tfContrasenia" id="tfContrasenia"></div><br>
            <div><input type="submit" value="Iniciar Sesi&oacute;n"></div>
        </form>
    </body>
</html>
