/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patripon
 */
public class CalculadoraDOSTest {
    
    public CalculadoraDOSTest() {
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
     * Test of realizaOperacion method, of class CalculaDos.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        float result = CalculadoraDOS.realizaOperacion(1, 1, "+");
        assertEquals(2, result, 0.0);
       result = CalculadoraDOS.realizaOperacion(5, 5, "+");
        assertEquals(10, result, 0.0);
        result = CalculadoraDOS.realizaOperacion(7, 7, "+");
        assertEquals(14, result, 0.0);
        result = CalculadoraDOS.realizaOperacion(3, 4, "+");
        assertEquals(7, result, 0.0);       
    }
    
}
