/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controladores.ControlGestionPremios;
import identidades.Premio;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASANCOR
 */
public class VentanaGestionPremios extends javax.swing.JDialog {

    public static ControlGestionPremios cgp;

    /**
     * Creates new form VentanaGestionPremios
     */
    public VentanaGestionPremios(java.awt.Frame parent, boolean modal, ControlGestionPremios cgp) {
        super(parent, modal);
        initComponents();
        this.cgp = cgp;
        // Listener para habilitar edición y mostrar datos del Premios seleccionado
        tablePremios.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tablePremios.rowAtPoint(evt.getPoint());
                int col = tablePremios.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) 
                    btnGuardarPremio.setEnabled(true);
                    btnEliminarPremios.setEnabled(true);
            }
            
        });
    cgp.rellenarTablaConPremios(tablePremios);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombrePremio = new javax.swing.JTextField();
        txtnPremio = new javax.swing.JTextField();
        txtCuantiaPremio = new javax.swing.JTextField();
        btnAnadirPremio = new javax.swing.JButton();
        btnEliminarPremios = new javax.swing.JButton();
        btnGuardarPremio = new javax.swing.JButton();
        lblNombrePremio = new javax.swing.JLabel();
        lblCuantiaPremio = new javax.swing.JLabel();
        lblnPremios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePremios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnAnadirPremio.setText("Añadir");
        btnAnadirPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirPremioActionPerformed(evt);
            }
        });

        btnEliminarPremios.setText("Eliminar Seleccionados");
        btnEliminarPremios.setEnabled(false);
        btnEliminarPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPremiosActionPerformed(evt);
            }
        });

        btnGuardarPremio.setText("Modificar seleccionado");
        btnGuardarPremio.setEnabled(false);
        btnGuardarPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPremioActionPerformed(evt);
            }
        });

        lblNombrePremio.setText("Nombre");

        lblCuantiaPremio.setText("Cuantia");

        lblnPremios.setText("Numero de Premios");

        tablePremios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cuantia", "Numero Premios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePremios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(btnEliminarPremios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCuantiaPremio)
                            .addComponent(lblNombrePremio)
                            .addComponent(lblnPremios))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnPremio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCuantiaPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombrePremio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnadirPremio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarPremio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombrePremio)
                            .addComponent(txtNombrePremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCuantiaPremio)
                            .addComponent(txtCuantiaPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnPremios)
                            .addComponent(txtnPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarPremios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirPremioActionPerformed
        if (txtNombrePremio.getText().isEmpty() ||
            txtnPremio.getText().isEmpty()    ||
            txtCuantiaPremio.getText().isEmpty()) 
            JOptionPane.showMessageDialog(null, "Error. Falta algún dato.");
        else {
            cgp.anadirPremio(txtNombrePremio.getText(), 
                                     Integer.parseInt(txtCuantiaPremio.getText()),
                                     Integer.parseInt(txtnPremio.getText()),
                                     tablePremios); 
            txtNombrePremio.setText("");
            txtnPremio.setText("");
            txtCuantiaPremio.setText("");
        }
        btnGuardarPremio.setEnabled(false);
    }//GEN-LAST:event_btnAnadirPremioActionPerformed

    private void btnGuardarPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPremioActionPerformed
        try{
        cgp.modificarDatos(txtNombrePremio,txtCuantiaPremio,txtnPremio,(String)tablePremios.getValueAt(tablePremios.getSelectedRow(), 0));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe tener una fila seleccionada");
        }
        btnGuardarPremio.setEnabled(false);
        cgp.rellenarTablaConPremios(tablePremios);
    }//GEN-LAST:event_btnGuardarPremioActionPerformed

    private void btnEliminarPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPremiosActionPerformed
        cgp.eliminarPremio(tablePremios);
        btnGuardarPremio.setEnabled(false);
    }//GEN-LAST:event_btnEliminarPremiosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionPremios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionPremios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionPremios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionPremios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaGestionPremios dialog = new VentanaGestionPremios(new javax.swing.JFrame(), true, cgp);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirPremio;
    private javax.swing.JButton btnEliminarPremios;
    private javax.swing.JButton btnGuardarPremio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCuantiaPremio;
    private javax.swing.JLabel lblNombrePremio;
    private javax.swing.JLabel lblnPremios;
    private javax.swing.JTable tablePremios;
    private javax.swing.JTextField txtCuantiaPremio;
    private javax.swing.JTextField txtNombrePremio;
    private javax.swing.JTextField txtnPremio;
    // End of variables declaration//GEN-END:variables
}
