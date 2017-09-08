/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.parsing.Parser;
import static org.hamcrest.Matchers.*;


/**
 *
 * @author Oliver
 */
public class ServiceIntegrationTest {
    
    public ServiceIntegrationTest() {
    }
    
    @BeforeClass
    public static void setUpBeforeAll() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/Test1";
        RestAssured.defaultParser = Parser.JSON;
    }

//    public static void setUpClass() {
//    }
    
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
    public void serverIsRunning() {
        given().
        when().get().
        then().
        statusCode(200);
    }
    
    @Test
    public void serverIsRunningV2() {
    given().when().get("http://localhost:8080/Test2/").then().statusCode(200);
    }
    
    @Test
    public void addOperation() {
        given().pathParam("n1", 2).pathParam("n2", 2).
        when().get("/api/calculator/add/{n1}/{n2}").
        then().
        statusCode(200).
        body("result", equalTo(4), "operation", equalTo("2 + 2"));
    }



    
}
