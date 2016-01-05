
package controladores;

import identidades.Administracion;
import identidades.Billete;
import identidades.Premio;
import java.util.ArrayList;

public class ControlMenuPrincipal {
    
    public ArrayList<Administracion> la = new ArrayList<Administracion>();
    public ArrayList<Billete> lb = new ArrayList<Billete>();
    public ArrayList<Premio> lp = new ArrayList<Premio>();
    
    public void realizarOpcion(int opc) {
        switch (opc) {
            case 1:
                ControlGestionAdministraciones cga = new ControlGestionAdministraciones();
                break;
            case 2:
                ControlGestionPremios cgp = new ControlGestionPremios();
                break;
            case 3:
                ControlSorteo cs = new ControlSorteo();
                break;
        }
    }
    //Lectura de fichero base.txt(cargando premios y administraciones)
    
    //Aqui se rellena la lista de billetes desde el billete 00000 al 99999 con 195 series cada billete
    
}