/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

import com.google.gson.Gson;
import entity.Person;
import java.util.List;

/**
 *
 * @author Oliver
 */
public class JSONConverter {
    
    public static Person getPersonFromJson(String js){
        return new Gson().fromJson(js, Person.class);
    }  
    public static String getJSONFromPerson(Person p) {
        return new Gson().toJson(p);
    }  
    public static String getJSONFromPerson(List<Person> persons) {
        return new Gson().toJson(persons);
    } 
    
}
