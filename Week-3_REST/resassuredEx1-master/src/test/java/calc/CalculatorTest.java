/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Oliver
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        int i1 = 3;
        int i2 = 3;
        Calculator instance = new Calculator();
        int expResult = 6;
        int result = instance.add(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSub() {
        System.out.println("sub");
        int i1 = 10;
        int i2 = 5;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.sub(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMul() {
        System.out.println("mul");
        int i1 = 5;
        int i2 = 5;
        Calculator instance = new Calculator();
        int expResult = 25;
        int result = instance.mul(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDiv1() {
        System.out.println("div1");
        int i1 = 12;
        int i2 = 6;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.div(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
//    @Test
//    public void testDiv2() {
//        System.out.println("div2");
//        int i1 = 12;
//        int i2 = 0;
//        Calculator instance = new Calculator();
//        int expResult = "ERROR";
//        int result = instance.div(i1, i2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Calculator.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
}
