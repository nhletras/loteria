
package controladores;

import identidades.Administracion;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControlGestionAdministraciones{
    public ArrayList<Administracion> la;
    
    public ControlGestionAdministraciones(ArrayList<Administracion> la){
        this.la = la;
    }

    public void anadirAdministracion(String nombre, String cif, String direccion, JTable tabla) {
        Administracion a = new Administracion(nombre, cif, direccion);
        if (!la.contains(a)) {
            la.add(a);
            // Añadimos la fila correspondiente a la tabla
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.addRow(new Object[]{a.getNombre(), a.getCif(), a.getDireccion()});
        } else {
            JOptionPane.showMessageDialog(null, "Error. La administración ya existe.");
        }
    }
    
    public void eliminarAdministracion(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int[] rows = tabla.getSelectedRows();
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "¿Seguro que quieres borrar la/s administración/es seleccionada/s?",
                "Cuidaito",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            // Recorremos las filas seleccionadas
            for (int i = 0; i < rows.length; i++) {
                Administracion a = new Administracion((String) tabla.getValueAt(rows[i] - i, 0),
                        (String) tabla.getValueAt(rows[i] - i, 1),
                        (String) tabla.getValueAt(rows[i] - i, 2));
                // Eliminamos cada administración seleccionada de la lista          
                la.remove(a);
                // La eliminamos también de la tabla
                model.removeRow(rows[i] - i);
            }
        }
    }
    
    public void modificarDatos(JTextField nombre, JTextField cif, JTextField direccion,String filaObjetoaModificar){
        
        Administracion aaMod = null;
        Iterator<Administracion> it = la.iterator();
        while(it.hasNext()){
            Administracion ad = it.next();
            if(ad.getCif().equals(filaObjetoaModificar)){
                aaMod = ad;
            }
        }
        
        if(!nombre.getText().isEmpty() && la.contains(aaMod))
            la.get(la.indexOf(aaMod)).setNombre(nombre.getText());
        if(!cif.getText().isEmpty() && la.contains(aaMod)) 
            la.get(la.indexOf(aaMod)).setCif(cif.getText());
        if(!direccion.getText().isEmpty() && la.contains(aaMod))
            la.get(la.indexOf(aaMod)).setDireccion(direccion.getText());
        nombre.setText("");
        cif.setText("");
        direccion.setText("");
    }
    
    public ArrayList<Administracion> obtenerListaAdministraciones(){
        return la;
    }
    public void rellenarTablaConAdministraciones(JTable tableAdministracion) {
        DefaultTableModel model = (DefaultTableModel) tableAdministracion.getModel();
        model.setRowCount(0);
        
        
        model = (DefaultTableModel) tableAdministracion.getModel();
        for (int i = 0; i < la.size(); i++) {
            String nombre = la.get(i).getNombre();
            String cif = la.get(i).getCif();
            String direccion = la.get(i).getDireccion();
            Object[] data = {nombre,cif,direccion};
            model.addRow(data);
        }
    }
    
    

    
}
