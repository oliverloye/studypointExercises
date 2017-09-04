/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Orderr;

/**
 *
 * @author Oliver
 */
public interface FacadeOrderInterface {
    
    public void addOrder(Orderr order);
    public Orderr findOrder(Long id);
}
