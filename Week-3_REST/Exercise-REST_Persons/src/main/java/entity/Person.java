/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Oliver
 */
public class Person {
    public int id;
    public String fName;
    public String lName;
    public String phone;

    public Person() {
    }

    public Person(int id, String fName, String lName, String phone) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", phone=" + phone + '}';
    }
    
    
}
