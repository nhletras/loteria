
package identidades;

public class Premio { 
    
    private String nombre; 
    private int cuantia;
    private int numPremios; 
    
    public Premio(String nombre, int cuantia, int numPremios){
        this.nombre = nombre;
        this.cuantia = cuantia;
        this.numPremios = numPremios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuantia() {
        return cuantia;
    }

    public void setCuantia(int cuantia) {
        this.cuantia = cuantia;
    }

    public int getNumPremios() {
        return numPremios;
    }

    public void setNumPremios(int numPremios) {
        this.numPremios = numPremios;
    }
    
    public String toString() {
        return this.nombre + " " + this.cuantia + "€";
    }  
}
