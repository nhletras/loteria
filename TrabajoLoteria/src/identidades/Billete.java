
package identidades;

import java.util.HashSet;

public class Billete {
    private int numero;
    private int numSeries;
    private boolean asignado;
    public HashSet<Administracion> lAB;

    public Billete(int numero, int numSeries, boolean asignado) {
        this.numero = numero;
        this.numSeries = numSeries;
        this.asignado = asignado;
        lAB = new HashSet<Administracion>();
    }
    
    public int getNumSeries() {
        return numSeries;
    }

    public void setNumSeries(int numSeries) {
        this.numSeries = numSeries;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String toString(){
        return String.format("%05d", this.numero);
    }
}
