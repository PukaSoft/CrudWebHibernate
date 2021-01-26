
package com.is89.test;

import com.is89.dao.AlumnoDAO;
import com.is89.domain.Alumno;
import com.is89.domain.Domicilio;
import com.is89.domain.Contacto;

public class TestHibernate {
    
    public static void main(String[] args) {

        AlumnoDAO dao = new AlumnoDAO();
        Alumno alumno = new Alumno();
        Domicilio domicilio = new Domicilio();
        Contacto contacto = new Contacto();
        
        alumno.setNombre("Ricky");
        alumno.setApellido("Sanchez");
        
        domicilio.setCalle("Los Eucaliptos");
        domicilio.setNoCalle("N. 555 Mz D lte 52");
        domicilio.setPais("Perú");
        
        contacto.setEmail("jerry@is89.com");
        contacto.setTelefono("222-552-888");
        
        alumno.setContacto(contacto);
        alumno.setDomicilio(domicilio);
        dao.insertar(alumno);
        
        
    }
}
