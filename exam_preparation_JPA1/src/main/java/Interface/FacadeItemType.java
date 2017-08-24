/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.ItemType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public class FacadeItemType implements FacadeItemTypeInterface {
    
    private EntityManagerFactory emf;

    public FacadeItemType(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void addItemType(ItemType itemType) {
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(itemType);
            em.getTransaction().commit();
            
        } finally {
            em.close();
        }
    }
    
}
