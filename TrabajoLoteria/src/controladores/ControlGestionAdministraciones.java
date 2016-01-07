
package controladores;

import identidades.Administracion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlGestionAdministraciones{
    public ControlGestionAdministraciones(ArrayList<Administracion> la){
        la = new ArrayList<Administracion>();
    }

    public void anadirAdministracion(String nombre, String cif, String direccion) {
        //Administracion a = new Administracion(nombre, cif, direccion);
        JOptionPane.showMessageDialog(null, "entra");
    }
    
}
