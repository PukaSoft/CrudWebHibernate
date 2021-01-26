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
        <h1>Modificar Alumno</h1>
        
        <form name="form1" action="${pageContext.request.contextPath}/ServletModificar" method="POST">
            
            Nombre : <input type="text" name="nombre" value="${alumno.nombre}"/><br/>
            Apellido : <input type="text" name="apellido" value="${alumno.apellido}"/><br/><br/>
            Datos Domicilio <br>
            Calle : <input type="text" name="calle" value="${alumno.domicilio.calle}" /><br/>
            Nro Calle : <input type="text" name="noCalle" value="${alumno.domicilio.noCalle}" /><br/>
            País : <input type="text" name="pais" value="${alumno.domicilio.pais}"/><br/>
            <br/><br/>
            Datos de Contacto <br>
            Email : <input type="email" name="email" value="${alumno.contacto.email}" /><br/>
            Telefono : <input type="tel" name="telefono" value="${alumno.contacto.telefono}"/><br/>
            <input type="submit" name="modificar" value="Modificar">
        </form>
    </body>
</html>
