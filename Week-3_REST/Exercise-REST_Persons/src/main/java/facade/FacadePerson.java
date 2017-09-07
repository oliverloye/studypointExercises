/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Personn;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public class FacadePerson implements IPersonFacade {
    
    private EntityManagerFactory emf;
    
    public FacadePerson() {
    }

    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Personn addPerson(Personn p) {
        EntityManager em = emf.createEntityManager();
       
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return p;
        }
        finally {
            em.close();
        }
    }

    @Override
    public Personn deletePerson(Long id) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Personn person = em.find(Personn.class, id); 
            if( person != null) {
                em.remove(person);
            }
            em.getTransaction().commit();
            return person;
        }
        finally {
            em.close();
        }
    }

    @Override
    public Personn getPerson(Long id) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Personn pers = em.find(Personn.class, id);
            em.getTransaction().commit();
            return pers;
        }
        finally {
            em.close();
        }
    }

    @Override
    public List<Personn> getPersons() {
        EntityManager em = emf.createEntityManager();

        List<Personn> persons = null;
        
        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select p from Personn p").getResultList();
            em.getTransaction().commit();
            return persons;
        }
        finally {
            em.close();
        }
    }

    @Override
    public Personn editPerson(Personn p) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Personn pers = em.find(Personn.class, p.getId());
            if( pers != null) {
                em.merge(p);
            }
            em.getTransaction().commit();
            return pers;
        }
        finally {
            em.close();
        }
    }
    
}
