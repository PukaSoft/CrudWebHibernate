
package com.is89.dao;

import com.is89.domain.Contacto;
import java.util.List;
import javax.persistence.Query;

public class ContactoDAO extends GenericDAO {
    
    //CRUD
    
    //CREATE
        public void insertar(Contacto contacto){
            try {
                em = getEntityManager();
                em.getTransaction().begin();
                em.persist(contacto);
                em.getTransaction().commit();
                
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
            
//            finally{
//                if (em !=null) {
//                    em.close();
//                }
//            }
            
        }
    
    //READ
        
        public List<Contacto> listar(){
            String consulta = "Select c from Contacto c"; 
            em = getEntityManager();
            Query query = em.createQuery(consulta);
            return query.getResultList();
            
        }
        
        
        public Contacto buscarPorId(Contacto contacto){
            em = getEntityManager();
            return em.find(Contacto.class, contacto.getIdContacto());
            
        }
        
        
    
    //UPDATE
        
        public void actualizar(Contacto contacto){
            try {
                em = getEntityManager();
                em.getTransaction().begin();
                em.merge(contacto);
                em.getTransaction().commit();
            } catch (Exception e) {
            }
            
//            finally{
//                if (em != null) {
//                    em.close();
//                }
//                
//            }
        }
    
    //DELETE
        public void eliminar(Contacto contacto){
            try {
                em = getEntityManager();
                em.getTransaction().begin();
                em.remove(em.merge(contacto));
                em.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
            
//            finally{
//                if (em != null) {
//                    em.close();
//                }
//            }
        }
    
    
}
