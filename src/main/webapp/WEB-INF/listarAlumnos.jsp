

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Listado de alumnos
        <br />
        <a href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a>
        <br />
        <table border="1">
            <thead>
                <tr>
                    <th>Alumno ID</th>
                    <th>Nombre</th>
                    <th>Domicilio</th>
                    <th>Email</th>
                    <th>Telefono</th>
                    
                </tr>
            </thead>
            <tbody> 
                <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/ServletModificar?idAlumno=${alumno.idAlumno}">
                            ${alumno.idAlumno}</a></td>
                    <td>${alumno.nombre} ${alumno.apellido}</td>
                    <td>${alumno.domicilio.calle} ${alumno.domicilio.noCalle} ${alumno.domicilio.pais}</td>
                    <td>${alumno.contacto.email}</td>
                    <td>${alumno.contacto.telefono}</td>
                </tr>
                </c:forEach>
            
            </tbody>
        </table>

    
    </body>
</html>
