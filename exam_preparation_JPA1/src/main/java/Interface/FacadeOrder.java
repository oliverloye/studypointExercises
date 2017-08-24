/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Orderr;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public class FacadeOrder implements FacadeOrderInterface {
    
    private EntityManagerFactory emf;

    public FacadeOrder(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void addOrder(Orderr order) {
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(order);
            em.getTransaction().commit();
            
        } finally {
            em.close();
        }
    }

    @Override
    public Orderr findOrder(Long id) {
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            Orderr order = em.find(Orderr.class, id);
            em.getTransaction().commit();
            return order;
        } finally {
            em.close();
        }
    }
    
}
