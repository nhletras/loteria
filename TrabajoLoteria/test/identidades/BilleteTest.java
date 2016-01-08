/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matu
 */
public class BilleteTest {
    
    public BilleteTest() {
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
     * Test of getNumSeries method, of class Billete.
     */
    @Test
    public void testGetNumSeries() {
        System.out.println("getNumSeries");
        Billete instance = null;
        int expResult = 0;
        int result = instance.getNumSeries();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumSeries method, of class Billete.
     */
    @Test
    public void testSetNumSeries() {
        System.out.println("setNumSeries");
        int numSeries = 0;
        Billete instance = null;
        instance.setNumSeries(numSeries);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAsignado method, of class Billete.
     */
    @Test
    public void testIsAsignado() {
        System.out.println("isAsignado");
        Billete instance = null;
        boolean expResult = false;
        boolean result = instance.isAsignado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsignado method, of class Billete.
     */
    @Test
    public void testSetAsignado() {
        System.out.println("setAsignado");
        boolean asignado = false;
        Billete instance = null;
        instance.setAsignado(asignado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Billete.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Billete instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Billete.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Billete instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Billete.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Billete instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
