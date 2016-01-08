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
public class PremioTest {
    
    public PremioTest() {
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
     * Test of getNombre method, of class Premio.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Premio instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Premio.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Premio instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuantia method, of class Premio.
     */
    @Test
    public void testGetCuantia() {
        System.out.println("getCuantia");
        Premio instance = null;
        int expResult = 0;
        int result = instance.getCuantia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuantia method, of class Premio.
     */
    @Test
    public void testSetCuantia() {
        System.out.println("setCuantia");
        int cuantia = 0;
        Premio instance = null;
        instance.setCuantia(cuantia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPremios method, of class Premio.
     */
    @Test
    public void testGetNumPremios() {
        System.out.println("getNumPremios");
        Premio instance = null;
        int expResult = 0;
        int result = instance.getNumPremios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumPremios method, of class Premio.
     */
    @Test
    public void testSetNumPremios() {
        System.out.println("setNumPremios");
        int numPremios = 0;
        Premio instance = null;
        instance.setNumPremios(numPremios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Premio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Premio instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
