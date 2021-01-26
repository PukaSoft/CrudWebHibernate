package com.is89.dao;
import com.is89.domain.Domicilio;
import java.util.List;
import javax.persistence.Query;
public class DomicilioDAO extends GenericDAO {

    //CRUD
    //CREATE
    public void insertar(Domicilio domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(domicilio);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
//        finally{
//            if (em != null) {
//                em.close();
//            }                   
//        }
    }
    //READ
    public List<Domicilio> listar(){
        String consulta = "Select d from Domicilio d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }
    
    //UPDATE
    public void actualizar(Domicilio domicilio){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(domicilio);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
//        finally{
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    //DELETE
    public void eliminar(Domicilio domicilio){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(domicilio));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
//        finally {
//            
//        }
 
    }
    
}
