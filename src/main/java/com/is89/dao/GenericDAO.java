
package com.is89.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDAO  {
    
    protected static EntityManager em;
    protected static EntityManagerFactory emf;
    private static final String PU = "HibernatePU";
    
    public GenericDAO(){
        if (emf == null ) {
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }
    
    protected EntityManager getEntityManager(){
        if (em == null) {
            em = emf.createEntityManager();
        }
        
        return em;
    }
    
    
    
    
    
}
