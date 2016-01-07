package controladores;

import identidades.Administracion;
import identidades.Billete;
import identidades.Premio;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JTextArea;

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
            if (b.getNumSeries() > 0) {
                alBilletes.add(b);
            }
        }
        Billete aBilletes[] = alBilletes.toArray(new Billete[alBilletes.size()]);
        return aBilletes;
    }

    public void asignarBilletes(Administracion adminsitracion, Billete billete, int numeroSeries) {
        if (billete.getNumSeries() <= 0) {
            JOptionPane.showMessageDialog(null, "No quedan series para el billete " + String.format("%05d",billete.getNumero()));
        } else {
            int numSer = billete.getNumSeries() - numeroSeries;
            if (numSer >= 0) {
                adminsitracion.lbAd.add(billete);
                billete.setNumSeries(numSer);
                billete.setAsignado(true);
                JOptionPane.showMessageDialog(null, "Se ha asignado el billete "+String.format("%05d",billete.getNumero())+" a la administracion "+adminsitracion.getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "Solo han sido asignadas "+String.format("%05d",billete.getNumSeries())+" series");
                numSer = 0;
                adminsitracion.lbAd.add(billete);
                billete.setNumSeries(numSer);
                billete.setAsignado(true);
                JOptionPane.showMessageDialog(null, "Se ha asignado el billete "+String.format("%05d",billete.getNumero())+" a la administracion "+adminsitracion.getNombre());
            }
        }
    }

    public void realizarSorteo(JTextArea txtSorteo) {
        int totalPremios = 0;
        int indiceListBilleteRandom = 0, indiceListPremioRandom;
        Billete billeteGanador;
        Premio premioGanador;
        ArrayList<Billete> lbGanadores = new ArrayList<Billete>();
        String lineasSorteo = "";

        Iterator it = lp.iterator();
        while (it.hasNext()) {
            Premio p = (Premio) it.next();
            totalPremios = totalPremios + p.getNumPremios();
        }

        for (int i = 0; i < totalPremios; i++) {

            do {
                indiceListBilleteRandom = new Random().nextInt(99999 - 0 + 1) + 0;
            } while (!lb.get(indiceListBilleteRandom).isAsignado() || lbGanadores.contains(lb.get(indiceListBilleteRandom)));

            //billete ganador
            billeteGanador = lb.get(indiceListBilleteRandom);
            lbGanadores.add(billeteGanador);
            indiceListBilleteRandom = 0;

            do {
                indiceListPremioRandom = new Random().nextInt((lp.size() - 1) - 0 + 1) + 0;
            } while (lp.get(indiceListPremioRandom).getNumPremios() <= 0);

            //premio ganador
            premioGanador = lp.get(indiceListPremioRandom);
            premioGanador.setNumPremios(premioGanador.getNumPremios() - 1);

            lineasSorteo += "Billete premiado: " + String.format("%05d", billeteGanador.getNumero()) + " ganador del premio " + premioGanador.getNombre() + " "
                    + "valorado en " + premioGanador.getCuantia() + "€ \n \t Administraciones poseedoras de este billete: \n ";
            Iterator ite = billeteGanador.lAB.iterator();
            while (ite.hasNext()) {
                Administracion ad = (Administracion)ite.next();
                lineasSorteo += "\t \t "+ad.getNombre()+" \n";
            }
            //JOptionPane.showMessageDialog(null, "Nº"+billeteGanador+" p:"+premioGanador);
        }
        txtSorteo.setText(lineasSorteo);
    }
}
