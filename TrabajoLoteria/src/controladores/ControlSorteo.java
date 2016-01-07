package controladores;

import identidades.Administracion;
import identidades.Billete;
import identidades.Premio;
import java.util.ArrayList;
import java.util.Iterator;

public class ControlSorteo {

    public ArrayList<Administracion> la;
    public ArrayList<Billete> lb;
    public ArrayList<Premio> lp;

    public ControlSorteo(ArrayList<Administracion> la, ArrayList<Billete> lb, ArrayList<Premio> lp) {
        this.la = la;
        this.lb = lb;
        this.lp = lp;
    }

    public String[] obtenerComboAdministraciones() {
        String aAdministraciones[] = new String[la.size()];
        Administracion a;
        int contador = 0;

        Iterator it = la.iterator();
        while (it.hasNext()) {
            a = (Administracion) it.next();
            aAdministraciones[contador] = a.getNombre();
            contador++;
        }

        return aAdministraciones;
    }

    public String[] obtenerComboBilletes() {
        ArrayList<String> alBilletes = new ArrayList<String>();
        String[] aBilletes;
        Billete b;
        
        Iterator it = lb.iterator();
        while (it.hasNext()) {
            b = (Billete) it.next();
            if (b.isAsignado()) {
                alBilletes.add(""+b.getNumero());
            }
        }
        aBilletes = alBilletes.toArray();
        return aBilletes;
    }

}
