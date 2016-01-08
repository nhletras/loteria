/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import identidades.Premio;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
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
public class ControlGestionPremiosTest {
    
    public ControlGestionPremiosTest() {
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
     * Test of anadirPremio method, of class ControlGestionPremios.
     */
    @Test
    public void testAnadirPremio() {
        System.out.println("anadirPremio");
        String nombre = "";
        int cuantia = 0;
        int nPremios = 0;
        JTable tabla = null;
        ControlGestionPremios instance = null;
        instance.anadirPremio(nombre, cuantia, nPremios, tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPremio method, of class ControlGestionPremios.
     */
    @Test
    public void testEliminarPremio() {
        System.out.println("eliminarPremio");
        JTable tabla = null;
        ControlGestionPremios instance = null;
        instance.eliminarPremio(tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDatos method, of class ControlGestionPremios.
     */
    @Test
    public void testModificarDatos() {
        System.out.println("modificarDatos");
        JTextField nombre = null;
        JTextField cuantia = null;
        JTextField nPremios = null;
        String filaObjetoaModificar = "";
        ControlGestionPremios instance = null;
        instance.modificarDatos(nombre, cuantia, nPremios, filaObjetoaModificar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerListaPremios method, of class ControlGestionPremios.
     */
    @Test
    public void testObtenerListaPremios() {
        System.out.println("obtenerListaPremios");
        ControlGestionPremios instance = null;
        ArrayList<Premio> expResult = null;
        ArrayList<Premio> result = instance.obtenerListaPremios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarTablaConPremios method, of class ControlGestionPremios.
     */
    @Test
    public void testRellenarTablaConPremios() {
        System.out.println("rellenarTablaConPremios");
        JTable tablePremios = null;
        ControlGestionPremios instance = null;
        instance.rellenarTablaConPremios(tablePremios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
