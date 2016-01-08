package controladores;

import identidades.*;
import interfaz.VentanaGestionAdministracion;
import interfaz.VentanaGestionPremios;
import interfaz.VentanaSorteos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;

public class ControlMenuPrincipal {

    public ArrayList<Administracion> la = new ArrayList<Administracion>();
    public ArrayList<Billete> lb = new ArrayList<Billete>();
    public ArrayList<Premio> lp = new ArrayList<Premio>();

    public void elegirOpcion(int opc, JFrame padre) {
        switch (opc) {
            case 1:
                ControlGestionAdministraciones cga = new ControlGestionAdministraciones(la);
                VentanaGestionAdministracion vga = new VentanaGestionAdministracion(padre, true, cga);
                vga.setVisible(true);
                break;
            case 2:
                ControlGestionPremios cgp = new ControlGestionPremios(lp);
                VentanaGestionPremios vgp = new VentanaGestionPremios(padre, true, cgp);
                vgp.setVisible(true);
                break;
            case 3:
                ControlSorteo cs = new ControlSorteo(la, lb, lp);
                VentanaSorteos vs = new VentanaSorteos(padre, true, cs);
                vs.setVisible(true);
                break;
        }
    }

    //Método para cargar los datos del fichero base.txt en las listas anteriores
    public void cargarDatosFichero() {
        String line;
        String[] datos;
        boolean administracion = false;
        boolean premios = false;

        try {
            File archive = new File("C:\\Users\\Matu\\Documents\\NetBeansProjects\\loteria\\TrabajoLoteria\\src\\ficheroentrada\\base.txt");
            FileReader fr = new FileReader(archive);
            BufferedReader br = new BufferedReader(fr);
            line = br.readLine().trim();

            while (line != null && !line.equals("EOF") && !line.equals("")) {
                if (line.startsWith("ADMINISTRACION")) {
                    administracion = true;
                    premios = false;
                } else if (line.startsWith("PREMIOS")) {
                    premios = true;
                    administracion = false;
                } else if (administracion) {
                    datos = line.split(";");
                    Administracion a = new Administracion(datos[0], datos[1], datos[2]);
                    la.add(a);
                } else if (premios) {
                    datos = line.split(";");
                    Premio p = new Premio(datos[0], Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));
                    lp.add(p);
                }
                line = br.readLine().trim();
            }

        } catch (IOException e) {
            System.err.println("Error al leer el fichero - " + e);
        }
        
        
    }

    public void cargarBilletes() {
        for (int i = 0; i <= 99999; i++) {
            if(i<1900){
                Billete b = new Billete(i, 193, true);
                lb.add(b);
                if(i<=150){
                    b.lAB.add(la.get(1));
                    la.get(1).lbAd.add(b);
                    b.lAB.add(la.get(0));
                    la.get(0).lbAd.add(b);
                }else{
                    b.lAB.add(la.get(2));
                    la.get(2).lbAd.add(b);
                }
            } else {
                Billete b = new Billete(i, 195, false);
                lb.add(b);
            }
        }
    }
}
