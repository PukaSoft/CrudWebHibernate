package com.is89.dao;
import com.is89.domain.Asignacion;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author jmendez
 */
public class AsignacionDAO extends GenericDAO {
//    CREATE
      public void insertar(Asignacion asignacion){
          try {
              em = getEntityManager();
              em.getTransaction().begin();
              em.persist(asignacion);
              em.getTransaction().commit();
          } catch (Exception e) {
              e.printStackTrace(System.out);
          } 
          
//          finally {
//              if (em != null) {
//                  em.close();
//              }
//          }
          
          
      }
//    READ
      public List<Asignacion> listar(){
          String consulta = "Select a from Asignar a";
          em = getEntityManager();
          Query query = em.createQuery(consulta);
          return query.getResultList();
      }
      
      public Asignacion buscarPorId(Asignacion asignacion){
          em = getEntityManager();
          return em.find(Asignacion.class, asignacion);
      }
      
//    UPDATE
      public void actualizar(Asignacion asignacion){
          try {
              em = getEntityManager();
              em.getTransaction().begin();
              em.merge(asignacion);
              em.getTransaction().commit();
          
          } catch (Exception e) {
              e.printStackTrace(System.out);
          } 
          
//          finally {
//              if (em != null) {
//                  em.close();
//              }
//          }
      }
//    DELETE
      public void eliminar(Asignacion asignacion){
          try {
              em = getEntityManager();
              em.getTransaction().begin();
              em.remove(em.merge(asignacion));
          } catch (Exception e) {
              e.printStackTrace(System.out);
          }
          
//          finally {
//              if (em != null) {
//                  em.close();
//              }
//          }
      }
            
}
