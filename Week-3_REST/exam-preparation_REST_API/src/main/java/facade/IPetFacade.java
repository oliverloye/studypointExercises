/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Pet;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public interface IPetFacade extends Serializable{
    
    public void addEntityManagerFactory(EntityManagerFactory emf);
    public List<Pet> getPets();
    
}
