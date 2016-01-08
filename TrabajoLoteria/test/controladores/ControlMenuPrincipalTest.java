/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.swing.JFrame;
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
public class ControlMenuPrincipalTest {
    
    public ControlMenuPrincipalTest() {
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
     * Test of elegirOpcion method, of class ControlMenuPrincipal.
     */
    @Test
    public void testElegirOpcion() {
        System.out.println("elegirOpcion");
        int opc = 0;
        JFrame padre = null;
        ControlMenuPrincipal instance = new ControlMenuPrincipal();
        instance.elegirOpcion(opc, padre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarDatosFichero method, of class ControlMenuPrincipal.
     */
    @Test
    public void testCargarDatosFichero() {
        System.out.println("cargarDatosFichero");
        ControlMenuPrincipal instance = new ControlMenuPrincipal();
        instance.cargarDatosFichero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarBilletes method, of class ControlMenuPrincipal.
     */
    @Test
    public void testCargarBilletes() {
        System.out.println("cargarBilletes");
        ControlMenuPrincipal instance = new ControlMenuPrincipal();
        instance.cargarBilletes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
