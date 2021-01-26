
package com.is89.web;

import com.is89.servicio.ServicioAlumno;
import com.is89.domain.Alumno;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name = "ServletControlador",urlPatterns = "/ServletControlador")
public class ServletControlador extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            ServicioAlumno servicioAlumno = new ServicioAlumno();
            
            List<Alumno> alumnos = servicioAlumno.listarAlumnos();
            
            request.setAttribute("alumnos", alumnos);
            request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp")
                    .forward(request, response);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
