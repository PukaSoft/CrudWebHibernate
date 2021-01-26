package com.is89.servicio;

import com.is89.dao.AlumnoDAO;
import java.util.List;
import com.is89.domain.Alumno;

/**
 *
 * @author jmendez
 */
public class ServicioAlumno {
    private  AlumnoDAO alumnoDAO = new AlumnoDAO();
    
//    CRUD
//    CREATE
      public void guardarAlumno(Alumno alumno){
          if (alumno != null && alumno.getIdAlumno() == null) {
              alumnoDAO.insertar(alumno);
          }else {
              alumnoDAO.actualizar(alumno);
          }
      }
    
//    READ
     public List<Alumno> listarAlumnos(){
        return alumnoDAO.listar();
    }
     
     public Alumno encontrarAlumno(Alumno alumno){
         return alumnoDAO.buscarPorId(alumno);
     }
//    UPDATE
     
//    DELETE
     public void eliminarAlumno(Alumno alumno){
         alumnoDAO.eliminar(alumno);
     }
        
    
    
   
}
