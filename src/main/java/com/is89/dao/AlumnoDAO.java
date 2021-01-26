package com.is89.dao;

import com.is89.domain.Alumno;
import java.util.List;
import javax.persistence.Query;

public class AlumnoDAO extends GenericDAO {

    //CRUD
    //CREATE
    public void insertar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    //READ
    public List<Alumno> listar() {
        String consulta = "Select a from Alumno a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public Alumno buscarPorId(Alumno alumno) {
        em = getEntityManager();
        return em.find(Alumno.class, alumno.getIdAlumno());
    }

    //UPDATE
    public void actualizar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    //DELETE
    public void eliminar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(alumno));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        //        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

}
