<%-- 
    Document   : agregarAlumno
    Created on : 26/01/2021, 02:08:55 PM
    Author     : jmendez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Agregar Alumno</h1>
        
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="POST">
            Nombre : <input type="text" name="nombre" /><br/>
            Apellido : <input type="text" name="apellido" /><br/><br/>
            Datos Domicilio <br>
            Calle : <input type="text" name="calle" /><br/>
            Nro Calle : <input type="text" name="noCalle" /><br/>
            País : <input type="text" name="pais" /><br/>
            <br/><br/>
            Datos de Contacto <br>
            Email : <input type="email" name="email" /><br/>
            Telefono : <input type="tel" name="telefono" /><br/>
            <input type="submit" name="agregar" value="Agregar">
        </form>
    </body>
</html>
