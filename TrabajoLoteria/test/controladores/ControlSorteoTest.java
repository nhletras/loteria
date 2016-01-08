/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import identidades.Administracion;
import identidades.Billete;
import javax.swing.JTextArea;
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
public class ControlSorteoTest {
    
    public ControlSorteoTest() {
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
     * Test of obtenerComboAdministraciones method, of class ControlSorteo.
     */
    @Test
    public void testObtenerComboAdministraciones() {
        System.out.println("obtenerComboAdministraciones");
        ControlSorteo instance = null;
        Administracion[] expResult = null;
        Administracion[] result = instance.obtenerComboAdministraciones();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerComboBilletes method, of class ControlSorteo.
     */
    @Test
    public void testObtenerComboBilletes() {
        System.out.println("obtenerComboBilletes");
        ControlSorteo instance = null;
        Billete[] expResult = null;
        Billete[] result = instance.obtenerComboBilletes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarBilletes method, of class ControlSorteo.
     */
    @Test
    public void testAsignarBilletes() {
        System.out.println("asignarBilletes");
        Administracion adminsitracion = null;
        Billete billete = null;
        int numeroSeries = 0;
        ControlSorteo instance = null;
        instance.asignarBilletes(adminsitracion, billete, numeroSeries);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizarSorteo method, of class ControlSorteo.
     */
    @Test
    public void testRealizarSorteo() {
        System.out.println("realizarSorteo");
        JTextArea txtSorteo = null;
        ControlSorteo instance = null;
        instance.realizarSorteo(txtSorteo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
