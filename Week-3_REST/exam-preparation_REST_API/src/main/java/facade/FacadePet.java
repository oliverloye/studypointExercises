/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Pet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public class FacadePet implements IPetFacade {
    
    private EntityManagerFactory emf;
    
    public FacadePet() {
        
    }

    @Override
    public List<Pet> getPets() {
        EntityManager em = emf.createEntityManager();

        List<Pet> pets = null;
        
        try {
            em.getTransaction().begin();
            pets = em.createQuery("Select p from Pet p").getResultList();
            em.getTransaction().commit();
            return pets;
        }
        finally {
            em.close();
        }
    }

    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
}
