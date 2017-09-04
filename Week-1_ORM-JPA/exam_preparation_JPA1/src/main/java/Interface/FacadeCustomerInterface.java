/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Customer;

/**
 *
 * @author Oliver
 */
public interface FacadeCustomerInterface {
    
    public void addCustomer(Customer customer);
    public Customer findCustomer(Long id);
}
