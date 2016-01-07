package controladores;

import identidades.Premio;
import java.util.ArrayList;

public class ControlGestionPremios {

    public ArrayList<Premio> lp;

    public ControlGestionPremios(ArrayList<Premio> lp) {
        this.lp = lp;
    }

    public void anadirPremio(String nombre, int cuantia, int numPremios) {
        Premio p = new Premio(nombre, cuantia, numPremios);
        lp.add(p);
    }
}
