
package com.is89.web;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jmendez
 */

@WebServlet(name = "ServletRedireccionar", urlPatterns = "/ServletRedireccionar")
public class ServletRedireccionar extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("/WEB-INF/agregarAlumno.jsp")
                    .forward(request, response);
        } catch (ServletException | IOException ex ) {
           ex.printStackTrace(System.out);
        } 
    }
    
}
