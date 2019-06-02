/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import static Datos.Datos.metodosdb;
import Metodos.Pool;
import Metodos.Reportes;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;


/**
 *
 * @author criss
 */
public class ReportesForm extends javax.swing.JFrame {

    /**
     * Creates new form ReportesForm
     */
    public ReportesForm() {
        initComponents();
        jcomboxVuelos.setVisible(false);
        jlabelVuelo.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcomboxTipo = new javax.swing.JComboBox<>();
        jcomboxReportes = new javax.swing.JComboBox<>();
        jcomboxAeropuertos = new javax.swing.JComboBox<>();
        jcomboxVuelos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jboton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jlabelVuelo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Seleccione el tipo de reporte:");

        jcomboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aeropuertos Publicos", "Aeropuertos Privados" }));
        jcomboxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboxTipoItemStateChanged(evt);
            }
        });

        jcomboxReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reporte Vuelos", "Reporte Pasajeros" }));
        jcomboxReportes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboxReportesItemStateChanged(evt);
            }
        });

        jcomboxAeropuertos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboxAeropuertosItemStateChanged(evt);
            }
        });

        jcomboxVuelos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboxVuelosItemStateChanged(evt);
            }
        });

        jLabel2.setText("Seleccione el tipo:");

        jLabel3.setText("Seleccione el Aeropuerto:");

        jboton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jboton.setText("Generar Reporte");
        jboton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlabelVuelo.setText("Seleccione el Vuelo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabelVuelo)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcomboxVuelos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jcomboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jcomboxAeropuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jboton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcomboxReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboxReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboxAeropuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelVuelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomboxVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jboton)
                    .addComponent(jButton1)))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("REPORTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JComboBox setAeropuertos(JComboBox combox, int num){
        DefaultComboBoxModel model = (DefaultComboBoxModel)combox.getModel();
        Connection conect = null;
        Pool pool = new Pool();
        String registros[] = new String[1];
        String ssql;
        if (num==0){
            ssql = "SELECT * FROM aeropuerto_publico";
            
        }else{
            ssql = "SELECT * FROM aeropuerto_privado";
            
        }
        
        
        try{
            conect = pool.getConnection();
            if (conect!=null){
                
            PreparedStatement st = conect.prepareStatement(ssql);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                registros[0] = rs.getString("nombre");
            
                model.addElement(registros[0]);
                }
            
            }
            combox.setModel(model);
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error durante la consulta"
                    + "",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            if (conect!=null){
                try {
                    conect.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex,"Error de desconexion"
                            + "",JOptionPane.ERROR_MESSAGE);
                }
            }
        
        
        }
        
        return combox;
    
    }
    
    public JComboBox setVuelos(JComboBox combox,int indexA, int num){
        DefaultComboBoxModel model = (DefaultComboBoxModel)combox.getModel();
        Connection conect = null;
        Pool pool = new Pool();
        String registros[] = new String[1];
        String ssql;
        if (num==0){
            ssql = "SELECT vuelo.identificador FROM vuelo WHERE "
                    + "vuelo.aeropuerto_id='"+indexA+"' ORDER BY vuelo.identificador ASC ";
            
        }else{
            ssql = "SELECT vuelo.identificador FROM vuelo WHERE " 
                    + "vuelo.aeropuerto_privado_id='"+indexA+"' ORDER BY vuelo.identificador ASC ";
            
        }
        
        
        try{
            conect = pool.getConnection();
            if (conect!=null){
                
            PreparedStatement st = conect.prepareStatement(ssql);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                registros[0] = rs.getString("identificador");
            
                model.addElement(registros[0]);
                }
            
            }
            combox.setModel(model);
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error durante la consulta"
                    + "",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            if (conect!=null){
                try {
                    conect.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex,"Error de desconexion"
                            + "",JOptionPane.ERROR_MESSAGE);
                }
            }
        
        
        }
        
        return combox;
    }
    
    public void limpiarCombox(JComboBox combox){
        DefaultComboBoxModel model = (DefaultComboBoxModel)combox.getModel();
        int a = model.getSize()-1;
        for (int i = a; i>=0;i--){
            combox.removeItemAt(model.getSize()-1);
        }
        
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        int indexA = jcomboxTipo.getSelectedIndex();
        if (indexA==0){
          
            setAeropuertos(jcomboxAeropuertos,0);
        }    
        
        
    }//GEN-LAST:event_formWindowOpened
       
     
    private void jcomboxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboxTipoItemStateChanged
        // TODO add your handling code here:

        int indexA = jcomboxTipo.getSelectedIndex();
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(indexA==0){
                limpiarCombox(jcomboxAeropuertos);
                setAeropuertos(jcomboxAeropuertos,0);
                

            }else{
                
                limpiarCombox(jcomboxAeropuertos);
                setAeropuertos(jcomboxAeropuertos,1);
                

            }
        }
        
    }//GEN-LAST:event_jcomboxTipoItemStateChanged

    private void jbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonActionPerformed
        // TODO add your handling code here:
        int index= jcomboxTipo.getSelectedIndex();
        int indexA = jcomboxAeropuertos.getSelectedIndex();
        String aeropuerto = jcomboxAeropuertos.getItemAt(indexA).toString(); 
        int indexAeropuerto = metodosdb.getAeropuertoIndex(aeropuerto, index);
    
       
        if(jcomboxReportes.getSelectedIndex()==0){
            
            Reportes reporte = new Reportes();
            reporte.CrearReporteVuelos(indexAeropuerto,index);
                
            
           
        }else if(jcomboxReportes.getSelectedIndex()==1){
            String vuelo = jcomboxVuelos.getModel().getElementAt(jcomboxVuelos.getSelectedIndex()).toString();
            
            
            int indexV [] = metodosdb.getVueloIndex(vuelo, indexAeropuerto,jcomboxTipo.getSelectedIndex());
            Reportes reporte = new Reportes();
            reporte.CrearReportePasajeros(indexV[1], indexV[0],vuelo);
            
            
        }else{
            
        }
        
    }//GEN-LAST:event_jbotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AeropuertoForm form = new AeropuertoForm();
        form.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcomboxVuelosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboxVuelosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboxVuelosItemStateChanged

    private void jcomboxReportesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboxReportesItemStateChanged
        // TODO add your handling code here:
        int index = jcomboxReportes.getSelectedIndex();
        
        
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(index==0){
                jcomboxVuelos.setVisible(false);
                jlabelVuelo.setVisible(false);
                
            }else if(index==1){
                int indexT = jcomboxTipo.getSelectedIndex();
                String aeropuerto = jcomboxAeropuertos.getItemAt(jcomboxAeropuertos.getSelectedIndex()).toString(); 
                int indexA = metodosdb.getAeropuertoIndex(aeropuerto, indexT);
                jcomboxVuelos.setVisible(true);
                jlabelVuelo.setVisible(true);
                limpiarCombox(jcomboxVuelos);
                setVuelos(jcomboxVuelos,indexA,indexT);
                
                
            }
            
        }
        
        
    }//GEN-LAST:event_jcomboxReportesItemStateChanged

    private void jcomboxAeropuertosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboxAeropuertosItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(jcomboxVuelos.isVisible()){
                int indexT = jcomboxTipo.getSelectedIndex();
                String aeropuerto = jcomboxAeropuertos.getItemAt(jcomboxAeropuertos.getSelectedIndex()).toString(); 
                int indexA = metodosdb.getAeropuertoIndex(aeropuerto, indexT);
                limpiarCombox(jcomboxVuelos);
                setVuelos(jcomboxVuelos,indexA,indexT);
                
            }
        }
    }//GEN-LAST:event_jcomboxAeropuertosItemStateChanged

    /*
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
            java.util.logging.Logger.getLogger(ReportesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jboton;
    private javax.swing.JComboBox<String> jcomboxAeropuertos;
    private javax.swing.JComboBox<String> jcomboxReportes;
    private javax.swing.JComboBox<String> jcomboxTipo;
    private javax.swing.JComboBox<String> jcomboxVuelos;
    private javax.swing.JLabel jlabelVuelo;
    // End of variables declaration//GEN-END:variables
}