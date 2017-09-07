/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Personn;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public interface IPersonFacade extends Serializable {
    public void addEntityManagerFactory(EntityManagerFactory emf);
    public Personn addPerson(Personn p);  
    public Personn deletePerson(Long id);  
    public Personn getPerson(Long id);  
    public List<Personn> getPersons();  
    public Personn editPerson(Personn p);
    
}
