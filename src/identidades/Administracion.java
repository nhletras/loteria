package identidades;

import java.util.ArrayList;
import java.util.List;

public class Administracion {

    private String nombre;
    private String cif;
    private String direccion;
    List<Billete> lbAd;

    public Administracion(String nombre, String cif, String direccion) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
        this.lbAd = new ArrayList<Administracion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return this.nombre + "(" + this.cif + ")" + this.direccion;
    }

}
