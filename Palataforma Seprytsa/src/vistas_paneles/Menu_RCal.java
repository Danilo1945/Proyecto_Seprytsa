/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas_paneles;

import Reportes.Reportes;
import controlador.Main;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import tabla.MyScrollbarUI;

/**
 *
 * @author Danilo
 */
public class Menu_RCal extends javax.swing.JDialog {
public int codigo_general=0;
public String pa, dip, pa_txt, dip_txt, Dias, horas,cod_mat;
public int  hor;
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
    public Menu_RCal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
       this. setIconImage(new ImageIcon(getClass().getResource("/Img_menu/SEPRYTSAV_45x45PX.png")).getImage());
//jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());
//        jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        
        
        
        
        
        
        
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
        Individual = new rojerusan.RSButtonMetro();
        btn_genral = new rojerusan.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        txt_matricula = new rojerusan.RSMetroTextPlaceHolder();
        txt_img = new javax.swing.JLabel();
        txt_titu = new javax.swing.JLabel();
        txt_nombres = new rojerusan.RSMetroTextPlaceHolder();
        txt_apellidos = new rojerusan.RSMetroTextPlaceHolder();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(21, 96, 136));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        Individual.setBackground(new java.awt.Color(21, 96, 136));
        Individual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/reportes52px.png"))); // NOI18N
        Individual.setText("Infividual");
        Individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndividualActionPerformed(evt);
            }
        });

        btn_genral.setBackground(new java.awt.Color(21, 96, 136));
        btn_genral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/reportes52px.png"))); // NOI18N
        btn_genral.setText("General");
        btn_genral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genralActionPerformed(evt);
            }
        });

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

        txt_matricula.setForeground(new java.awt.Color(27, 108, 155));
        txt_matricula.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_matricula.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_matricula.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_matricula.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_matricula.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_matricula.setPhColor(new java.awt.Color(27, 108, 155));
        txt_matricula.setPlaceholder("Matrícula:");
        txt_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriculaActionPerformed(evt);
            }
        });

        txt_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_alertas/Img_sub_menus/OptCIONES_52px.png"))); // NOI18N

        txt_titu.setBackground(new java.awt.Color(21, 96, 136));
        txt_titu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_titu.setForeground(new java.awt.Color(21, 96, 136));
        txt_titu.setText("OPCIONES DE REPORTE");

        txt_nombres.setForeground(new java.awt.Color(27, 108, 155));
        txt_nombres.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_nombres.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_nombres.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_nombres.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_nombres.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_nombres.setPhColor(new java.awt.Color(27, 108, 155));
        txt_nombres.setPlaceholder("Nómbres:");
        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        txt_apellidos.setForeground(new java.awt.Color(27, 108, 155));
        txt_apellidos.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_apellidos.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_apellidos.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_apellidos.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_apellidos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_apellidos.setPhColor(new java.awt.Color(27, 108, 155));
        txt_apellidos.setPlaceholder("Apellidos");
        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(txt_img))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(112, 112, 112))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_titu)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(Individual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btn_genral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_img)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_titu)
                        .addGap(26, 26, 26)
                        .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(112, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Individual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_genral, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void btn_genralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genralActionPerformed
        doClose(RET_CANCEL);        // TODO add your handling code here:
          Reportes rp= new Reportes();
       
      rp.RCalificaciones_Final_General(pa, dip, hor, pa_txt, dip_txt, Dias, horas);
         confirmar(0);
    }//GEN-LAST:event_btn_genralActionPerformed

    private void IndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndividualActionPerformed
        // TODO add your handling code here:
       
        

         
         doClose(RET_OK);
         Reportes rp= new Reportes();
      cod_mat=txt_matricula.getText().toString();
      rp.RCalificaciones_Final_Individual(pa, dip, hor, pa_txt, dip_txt, Dias, horas,cod_mat);
         
        confirmar(1);
        

    }//GEN-LAST:event_IndividualActionPerformed

    private void txt_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matriculaActionPerformed

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
    public int confirmar(int res){
     
        if(res==1){
            respuesta=1;
        }
        if(res==0){
            respuesta=0;
        }
        if(res==3){
            respuesta=3;
        }
        
        return respuesta;
        
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
            java.util.logging.Logger.getLogger(Menu_RCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_RCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_RCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_RCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu_RCal dialog = new Menu_RCal(new javax.swing.JFrame(), true);
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
    public rojerusan.RSButtonMetro Individual;
    public rojerusan.RSButtonMetro btn_genral;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    public rojerusan.RSMetroTextPlaceHolder txt_apellidos;
    public javax.swing.JLabel txt_img;
    public rojerusan.RSMetroTextPlaceHolder txt_matricula;
    public rojerusan.RSMetroTextPlaceHolder txt_nombres;
    public javax.swing.JLabel txt_titu;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}