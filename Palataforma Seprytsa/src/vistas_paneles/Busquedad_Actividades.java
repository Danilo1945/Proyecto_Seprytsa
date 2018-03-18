/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas_paneles;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import tabla.MyScrollbarUI;

/**
 *
 * @author Danilo
 */
public class Busquedad_Actividades extends javax.swing.JDialog {
 String direccionBD = "jdbc:mysql://localhost:3307/seprytsa";
    String usuarioBD = "root";
    String contraBD = "";
    // Instanciamos la clase conectar 
    modelo.conectar cone1 = new modelo.conectar();
    // realizamos la conexion
    public Connection cn = cone1.conexion(direccionBD, usuarioBD, contraBD);
    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;
     public  int  respuesta=3;

    /**
     * Creates new form Alertas
     */
    public Busquedad_Actividades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
       this. setIconImage(new ImageIcon(getClass().getResource("/Img_menu/SEPRYTSAV_45x45PX.png")).getImage());
//scroll_alert.getVerticalScrollBar().setUI(new MyScrollbarUI());
//        scroll_alert.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        
        
      // consutaBD_porfechas(T.getText().toString());
        
          Tabla_actividades2.setRowHeight(20);
        
        
        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
        
       
        
       docente_menu.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu.getHorizontalScrollBar().setUI(new MyScrollbarUI());
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        docente_menu = new javax.swing.JScrollPane();
        Tabla_actividades2 = new rojerusan.RSTableMetro();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(21, 96, 136));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(21, 96, 136));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/cron_activi_52px_1.png"))); // NOI18N
        jLabel1.setText("Resultado de la Busqueda");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(636, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        docente_menu.setBackground(new java.awt.Color(21, 96, 136));
        docente_menu.setPreferredSize(new java.awt.Dimension(600, 402));

        Tabla_actividades2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "No se Encontraron resultados"
            }
        ));
        Tabla_actividades2.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_actividades2.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_actividades2.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_actividades2.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_actividades2.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_actividades2.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_actividades2.setColorSelBackgound(new java.awt.Color(27, 108, 155));
        Tabla_actividades2.setFuenteHead(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Tabla_actividades2.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_actividades2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_actividades2MouseClicked(evt);
            }
        });
        docente_menu.setViewportView(Tabla_actividades2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docente_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(docente_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void Tabla_actividades2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_actividades2MouseClicked
      try {

            int fila = Tabla_actividades2.getSelectedRow();
 int  codigo_general=0;
            if (fila > -1) {
                
                //  Txt_Codigo.setText(Integer.toString(fila));
                codigo_general = Integer.parseInt(Tabla_actividades2.getValueAt(fila, 0).toString());
                //   btn_atender.setEnabled(true);

            
            try {
                Statement estado;
                String asunto = "";
                String Detalle = "";
                estado = cn.createStatement();
                ResultSet resultado = estado.executeQuery("SELECT cronograma_actividades.Asunto_cac,cronograma_actividades.actividad_cac FROM cronograma_actividades WHERE cronograma_actividades.cod_cac=" + codigo_general + "");

                while (resultado.next()) {
                    asunto = resultado.getString(1);
                    Detalle = resultado.getString(2);

                    detalle(asunto, Detalle);
                }
            } catch (Exception e) {
            }
            }
        } catch (Exception ex) {
            // Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
           // alerta("Error", "No a seleccionado la opcion Nuevo" + ex, "/Img_alertas/Error_100px.png");
        }
    }//GEN-LAST:event_Tabla_actividades2MouseClicked
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
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
            java.util.logging.Logger.getLogger(Busquedad_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busquedad_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busquedad_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busquedad_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Busquedad_Actividades dialog = new Busquedad_Actividades(new javax.swing.JFrame(), true);
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

    
   
   
    
    
    
    
    
    
    
    
    
    
     public void detalle(String asunto, String detalle) {

        Actividades_Detalle dt = new Actividades_Detalle(null, true);
        dt.txt_asunto_general.setText(asunto);
        dt.txt_tarea_general.setText(detalle);
        dt.Atender.setEnabled(false);
        dt.btn_Cancelar.setEnabled(false);
        dt.setVisible(true);
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojerusan.RSTableMetro Tabla_actividades2;
    private javax.swing.JScrollPane docente_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
