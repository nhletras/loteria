/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import identidades.Administracion;
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
public class ControlGestionAdministracionesTest {
    
    public ControlGestionAdministracionesTest() {
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
     * Test of anadirAdministracion method, of class ControlGestionAdministraciones.
     */
    @Test
    public void testAnadirAdministracion() {
        System.out.println("anadirAdministracion");
        String nombre = "";
        String cif = "";
        String direccion = "";
        JTable tabla = null;
        ControlGestionAdministraciones instance = null;
        instance.anadirAdministracion(nombre, cif, direccion, tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarAdministracion method, of class ControlGestionAdministraciones.
     */
    @Test
    public void testEliminarAdministracion() {
        System.out.println("eliminarAdministracion");
        JTable tabla = null;
        ControlGestionAdministraciones instance = null;
        instance.eliminarAdministracion(tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDatos method, of class ControlGestionAdministraciones.
     */
    @Test
    public void testModificarDatos() {
        System.out.println("modificarDatos");
        JTextField nombre = null;
        JTextField cif = null;
        JTextField direccion = null;
        String filaObjetoaModificar = "";
        ControlGestionAdministraciones instance = null;
        instance.modificarDatos(nombre, cif, direccion, filaObjetoaModificar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerListaAdministraciones method, of class ControlGestionAdministraciones.
     */
    @Test
    public void testObtenerListaAdministraciones() {
        System.out.println("obtenerListaAdministraciones");
        ControlGestionAdministraciones instance = null;
        ArrayList<Administracion> expResult = null;
        ArrayList<Administracion> result = instance.obtenerListaAdministraciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarTablaConAdministraciones method, of class ControlGestionAdministraciones.
     */
    @Test
    public void testRellenarTablaConAdministraciones() {
        System.out.println("rellenarTablaConAdministraciones");
        JTable tableAdministracion = null;
        ControlGestionAdministraciones instance = null;
        instance.rellenarTablaConAdministraciones(tableAdministracion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
