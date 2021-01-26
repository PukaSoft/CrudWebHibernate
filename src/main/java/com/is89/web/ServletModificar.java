
package com.is89.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.is89.domain.Alumno;
import com.is89.domain.Contacto;
import com.is89.domain.Domicilio;
import com.is89.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletModificar", urlPatterns = "/ServletModificar")
public class ServletModificar extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        String idAlumnos = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnos);
        
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);
        
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontrarAlumno(alumno);
        
//        request.setAttribute("alumno", alumno);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("alumno", alumno);
        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);
    }
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nombre = request.getParameter("nombre");
        String apeliido = request.getParameter("apellido");
        String calle = request.getParameter("calle");
        String noCalle = request.getParameter("noCalle");
        String pais = request.getParameter("pais");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");

         HttpSession sesion = request.getSession();
         Alumno alumno = (Alumno) sesion.getAttribute("alumno");
        
        alumno.setNombre(nombre);
        alumno.setApellido(apeliido);
        alumno.getDomicilio().setCalle(calle);
        alumno.getDomicilio().setNoCalle(noCalle);
        alumno.getDomicilio().setPais(pais);
        alumno.getContacto().setEmail(email);
        alumno.getContacto().setTelefono(telefono);

        ServicioAlumno servicioAlumno = new ServicioAlumno();
        servicioAlumno.guardarAlumno(alumno);
        
        sesion.removeAttribute("alumno");
        
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
