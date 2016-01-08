
package controladores;

import identidades.Premio;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControlGestionPremios{
    public ArrayList<Premio> lp;
    
    public ControlGestionPremios(ArrayList<Premio> lp){
        this.lp = lp;
    }

    public void anadirPremio(String nombre, int cuantia, int nPremios, JTable tabla) {
        Premio p = new Premio(nombre, cuantia, nPremios);
        if (!lp.contains(p)) {
            lp.add(p);
            // Añadimos la fila correspondiente a la tabla
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.addRow(new Object[]{p.getNombre(), p.getCuantia(), p.getNumPremios()});
        } else {
            JOptionPane.showMessageDialog(null, "Error. El Premio ya existe.");
        }
    }
    
    public void eliminarPremio(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int[] rows = tabla.getSelectedRows();
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "¿Seguro que quieres borrar el/los Premio/os seleccionad/s?",
                "Cuidaito",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            // Recorremos las filas seleccionadas
            for (int i = 0; i < rows.length; i++) {
                Premio p = new Premio((String) tabla.getValueAt(rows[i] - i, 0),
                        (int)tabla.getValueAt(rows[i] - i, 1),
                        (int) tabla.getValueAt(rows[i] - i, 2));
                // Eliminamos cada Premio seleccionado de la lista          
                lp.remove(p);
                // La eliminamos también de la tabla
                model.removeRow(rows[i] - i);
            }
        }
    }
    
    public void modificarDatos(JTextField nombre, JTextField cuantia, JTextField nPremios,String filaObjetoaModificar){
        
        Premio aaMod = null;
        Iterator<Premio> it = lp.iterator();
        while(it.hasNext()){
            Premio pe = it.next();
            if(pe.getNombre().equals(filaObjetoaModificar)){
                aaMod = pe;
            }
        }
        
        if(!nombre.getText().isEmpty() && lp.contains(aaMod))
            lp.get(lp.indexOf(aaMod)).setNombre(nombre.getText());
        if(!cuantia.getText().isEmpty() && lp.contains(aaMod)) 
            lp.get(lp.indexOf(aaMod)).setCuantia(Integer.parseInt(cuantia.getText()));
        if(!nPremios.getText().isEmpty() && lp.contains(aaMod))
            lp.get(lp.indexOf(aaMod)).setNumPremios(Integer.parseInt(nPremios.getText()));
        nombre.setText("");
        cuantia.setText("");
        nPremios.setText("");
    }
    
    public ArrayList<Premio> obtenerListaPremios(){
        return lp;
    }
    public void rellenarTablaConPremios(JTable tablePremios) {
        DefaultTableModel model = (DefaultTableModel) tablePremios.getModel();
        model.setRowCount(0);
        
        
        model = (DefaultTableModel) tablePremios.getModel();
        for (int i = 0; i < lp.size(); i++) {
            String nombre = lp.get(i).getNombre();
            int cuantia = lp.get(i).getCuantia();
            int nPremios = lp.get(i).getNumPremios();
            Object[] data = {nombre,cuantia,nPremios};
            model.addRow(data);
        }
    }
    
    

    
}
