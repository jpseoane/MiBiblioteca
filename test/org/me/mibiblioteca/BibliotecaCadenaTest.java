/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mibiblioteca;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanpab
 */
public class BibliotecaCadenaTest {
    
    public BibliotecaCadenaTest() {
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

    /**
     * Test of aTitulo method, of class BibliotecaCadena.
     */
    @Test
    public void testATitulo() {
        System.out.println("aTitulo");
        String cad = " \t jUaN\t danIeL\t\t  pÉrEz  \t\t  ";        
        String expResult = "Juan Daniel Pérez";
        String result = BibliotecaCadena.aTitulo(cad);
        assertEquals(expResult, result);                
    }
    
}
