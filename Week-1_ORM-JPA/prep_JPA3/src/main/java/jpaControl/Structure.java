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
        
        HashMap puProperties = new HashMap();
        
        puProperties.put("javax.persistence.sql-load-script-source", "scripts/CreateDB.sql");
        puProperties.put("javax.persistence.sql-load-script-source", "scripts/InsertValues.sql");
        Persistence.generateSchema("jpaPU", puProperties);
        
        puProperties.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("jpaPU", puProperties);
        
    }
    
}
