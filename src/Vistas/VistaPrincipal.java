/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author evalab
 */
public class VistaPrincipal extends javax.swing.JFrame {
    
    DefaultTableModel modeloHistorico;
    DefaultTableModel modeloPronostico;
    
    

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        setVisible(true);
        setSize(571, 675);
        setLocationRelativeTo(null);
        
        modeloHistorico = (DefaultTableModel) tablaHistorico.getModel();
        modeloPronostico = (DefaultTableModel) tablaPronostico.getModel();
    }
    
    public void eliminarDatos(int index){
        modeloHistorico.removeRow(index);
    }
    
    public void eliminarDatosPronostico(int index){
        modeloPronostico.removeRow(index);
    }
    
    
    public void addBtnAgregarYearMouseEvent(MouseListener mouseListenControles){
        btnAgregarYear.addMouseListener(mouseListenControles);
    }
    
    public void addBtnBorrarYearMouseEvent(MouseListener mouseListenControles){
        btnBorrarYear.addMouseListener(mouseListenControles);
    }
    
    public void addBtnModificarYearMouseEvent(MouseListener mouseListenControles){
        btnModificarYear.addMouseListener(mouseListenControles);
    }
    
    public void addBtnNuevoPronosticoMouseEvent(MouseListener mouseListenControles){
        btnNuevoPronostico.addMouseListener(mouseListenControles);
    }
    
    
    public double getDatosVentas(){
        return Double.parseDouble(txtDatosVentas.getText());
    }
    
    public int getYearsPronosticar(){
        return Integer.parseInt(txtYearsPronosticar.getText());
    }
    
    public void setPromedioVentas(float area){
        txtPromedioVentas.setText(String.valueOf(area));
    }
    
    public void agregarDatosTablaHistorico(String[] datos){
        modeloHistorico.addRow(datos);
    }
    
    public void agregarDatosTablaPronostico(String[] datos){
        modeloPronostico.addRow(datos);
    }
    
    public void addTablaHistoricoListener(MouseListener listener){
        tablaHistorico.addMouseListener(listener);
    }
    
    public void activarPronostico(){
        txtYearsPronosticar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPronostico = new javax.swing.JTable();
        txtPromedioVentas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDatosVentas = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtYearsPronosticar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnAgregarYear = new javax.swing.JButton();
        btnBorrarYear = new javax.swing.JButton();
        btnModificarYear = new javax.swing.JButton();
        btnNuevoPronostico = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorico = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Pron??stico de Ventas:");

        jLabel5.setText("Promedio de Ventas:");

        tablaPronostico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "A??o", "Pron??stico de Ventas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaPronostico);
        if (tablaPronostico.getColumnModel().getColumnCount() > 0) {
            tablaPronostico.getColumnModel().getColumn(0).setResizable(false);
            tablaPronostico.getColumnModel().getColumn(0).setPreferredWidth(5);
            tablaPronostico.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPromedioVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPromedioVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 550, 230));

        jLabel1.setText("Datos de Ventas: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addComponent(txtDatosVentas))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDatosVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 90));

        jLabel2.setText("A??os a Pronosticar:");

        txtYearsPronosticar.setText("0");
        txtYearsPronosticar.setEnabled(false);
        txtYearsPronosticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearsPronosticarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addComponent(txtYearsPronosticar))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtYearsPronosticar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 90));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarYear.setText("Agregar A??o");
        jPanel5.add(btnAgregarYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 130, 81));

        btnBorrarYear.setText("Borrar A??o");
        btnBorrarYear.setMaximumSize(new java.awt.Dimension(140, 24));
        btnBorrarYear.setPreferredSize(new java.awt.Dimension(145, 24));
        jPanel5.add(btnBorrarYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 6, 157, 80));

        btnModificarYear.setText("Modificar A??o");
        btnModificarYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarYearActionPerformed(evt);
            }
        });
        jPanel5.add(btnModificarYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 130, 85));

        btnNuevoPronostico.setText("Nuevo Pronostico");
        btnNuevoPronostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPronosticoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevoPronostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 85));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 310, 190));

        tablaHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"X", "Y", "Yn - Yn-1", "(Yn - Yn-1)/Yn-1"}
            },
            new String [] {
                "A??o", "Cantidad de Ventas", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaHistorico);
        if (tablaHistorico.getColumnModel().getColumnCount() > 0) {
            tablaHistorico.getColumnModel().getColumn(0).setResizable(false);
            tablaHistorico.getColumnModel().getColumn(1).setResizable(false);
            tablaHistorico.getColumnModel().getColumn(1).setPreferredWidth(110);
            tablaHistorico.getColumnModel().getColumn(2).setResizable(false);
            tablaHistorico.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setText("Historico de Ventas:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 550, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPronosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPronosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoPronosticoActionPerformed

    private void btnModificarYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarYearActionPerformed

    private void txtYearsPronosticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearsPronosticarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearsPronosticarActionPerformed

    public JButton getBtnAgregarYear() {
        return btnAgregarYear;
    }

    public JButton getBtnBorrarYear() {
        return btnBorrarYear;
    }

    public JButton getBtnNuevoPronostico() {
        return btnNuevoPronostico;
    }

    public JButton getBtnModificarYear() {
        return btnModificarYear;
    }
    
    public void vaciarCantidadVentas(){
        txtDatosVentas.setText("");
    }
    
    public void setPromedio(double dato){
        txtPromedioVentas.setText("" + dato);
    }

    public JTable getTablaHistorico() {
        return tablaHistorico;
    }
    
    

    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarYear;
    private javax.swing.JButton btnBorrarYear;
    private javax.swing.JButton btnModificarYear;
    private javax.swing.JButton btnNuevoPronostico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaHistorico;
    private javax.swing.JTable tablaPronostico;
    private javax.swing.JTextField txtDatosVentas;
    private javax.swing.JTextField txtPromedioVentas;
    private javax.swing.JTextField txtYearsPronosticar;
    // End of variables declaration//GEN-END:variables
}
