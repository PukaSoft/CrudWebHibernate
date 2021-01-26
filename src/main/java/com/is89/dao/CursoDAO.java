package com.is89.dao;

import com.is89.domain.Curso;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author jmendez
 */
public class CursoDAO extends GenericDAO {
//CREATE

    public void insertar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(curso);
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

    public List<Curso> listar() {
        String consulta = "Select c From Curso";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }
    
    public Curso buscarPorId(Curso curso){
        em = getEntityManager();
        return em.find(Curso.class, curso.getIdCurso());
    }
 
//UPDATE
    public void actualizar(Curso curso){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(curso);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
 
    }
// DELETE
    public void eliminar(Curso curso){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(curso));
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
