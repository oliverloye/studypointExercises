/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaControl;

import Entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Oliver
 */
public class JPQL {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "jpaPU" );
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        //DynamicQuery
        Query Dquery1 = em.createQuery("SELECT s FROM Student s");
        List<Student> studentsAll = Dquery1.getResultList();
        for(Student s:studentsAll) {
            System.out.println("Student: " + s.getFirstname() + " " + s.getLastname());
        }
        
//        Query Dquery2 = em.createQuery("SELECT s FROM Student s WHERE FIRSTNAME = Anders`");
//        List<Student> studentsAllFirstname = Dquery2.getResultList();
//        for(Student s:studentsAllFirstname) {
//            System.out.println("Students: " + s);
//        }
        
    }
    
}
