/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaControl;

import java.util.HashMap;
import javax.persistence.Persistence;

/**
 *
 * @author Oliver
 */
public class Structure {
    
    public static void main(String[] args) {
        HashMap puproperties = new HashMap();
        
        puproperties.put("javax.persistence.sql-load-script-source", "scripts/CreateData.sql");
        Persistence.generateSchema("PU", puproperties);
        
        puproperties.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("PU", puproperties);
    }
}
