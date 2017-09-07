/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public interface IPersonFacade extends Serializable {
    public void addEntityManagerFactory(EntityManagerFactory emf);
    public Person addPerson(Person p);  
    public Person deletePerson(int id);  
    public Person getPerson(int id);  
    public List<Person> getPersons();  
    public Person editPerson(Person p);
    
}
