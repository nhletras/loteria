
package controladores;

import identidades.Administracion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlGestionAdministraciones{
    public ArrayList<Administracion> la;
    
    public ControlGestionAdministraciones(ArrayList<Administracion> la){
        this.la = la;
    }

    public void anadirAdministracion(String nombre, String cif, String direccion) {
        Administracion a = new Administracion(nombre, cif, direccion);
        la.add(a);   
    }
    
    public void obtenerListaAdministraciones(){
        
    }
    
}
