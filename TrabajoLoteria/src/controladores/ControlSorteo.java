package controladores;

import identidades.Administracion;
import identidades.Billete;
import identidades.Premio;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ControlSorteo {

    public ArrayList<Administracion> la;
    public ArrayList<Billete> lb;
    public ArrayList<Premio> lp;

    public ControlSorteo(ArrayList<Administracion> la, ArrayList<Billete> lb, ArrayList<Premio> lp) {
        this.la = la;
        this.lb = lb;
        this.lp = lp;
    }

    public Administracion[] obtenerComboAdministraciones() {
        Administracion aAdministraciones[] = new Administracion[la.size()];
        Administracion a;
        int contador = 0;

        Iterator it = la.iterator();
        while (it.hasNext()) {
            a = (Administracion) it.next();
            aAdministraciones[contador] = a;
            contador++;
        }

        return aAdministraciones;
    }

    public Billete[] obtenerComboBilletes() {
        ArrayList<Billete> alBilletes = new ArrayList<Billete>();
        Billete b;

        Iterator it = lb.iterator();
        while (it.hasNext()) {
            b = (Billete) it.next();
            if (b.isAsignado()) {
                alBilletes.add(b);
            }
        }
        Billete aBilletes[] = alBilletes.toArray(new Billete[alBilletes.size()]);
        return aBilletes;
    }

    public void asignarBilletes(Administracion adminsitracion, Billete billete, int numeroSeries) {
        if (billete.getNumSeries() <= 0) {
            JOptionPane.showMessageDialog(null, "No quedan series para el billete " + billete.getNumero());
        } else {
            int numSer = billete.getNumSeries() - numeroSeries;
            if (numSer >= 0) {
                adminsitracion.lbAd.add(billete);
                billete.setNumSeries(numSer);
            }else{
                numSer = 0;
                adminsitracion.lbAd.add(billete);
                billete.setNumSeries(numSer);
            }
        }
        JOptionPane.showMessageDialog(null, la);
    }
}
