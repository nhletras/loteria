
package identidades;

public class Billete {
    private int numero;
    private int numSeries;
    private boolean asignado;

    public Billete(int numero, int numSeries, boolean asignado) {
        this.numero = numero;
        this.numSeries = numSeries;
        this.asignado = asignado;
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
        String cad = "";
        return cad + this.numero;
    }
}
