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
public class Menu_RInscripciones_General extends javax.swing.JDialog {
public int codigo_general=90;

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
    public Menu_RInscripciones_General(java.awt.Frame parent, boolean modal) {
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
        jPanel1 = new javax.swing.JPanel();
        txt_img = new javax.swing.JLabel();
        txt_titu = new javax.swing.JLabel();
        txt_TITULO_CORRESPONDE = new javax.swing.JLabel();
        cbox_OPCIONES = new rojerusan.RSComboMetro();
        year = new rojeru_san.componentes.RSYearDate();
        btn_genral = new rojerusan.RSButtonMetro();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(21, 96, 136));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_alertas/Img_sub_menus/OptCIONES_52px.png"))); // NOI18N

        txt_titu.setBackground(new java.awt.Color(21, 96, 136));
        txt_titu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_titu.setForeground(new java.awt.Color(21, 96, 136));
        txt_titu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titu.setText("OPCIONES DE REPORTE");

        txt_TITULO_CORRESPONDE.setBackground(new java.awt.Color(21, 96, 136));
        txt_TITULO_CORRESPONDE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_TITULO_CORRESPONDE.setForeground(new java.awt.Color(21, 96, 136));
        txt_TITULO_CORRESPONDE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_TITULO_CORRESPONDE.setText("CURSOS");

        cbox_OPCIONES.setBackground(new java.awt.Color(21, 96, 136));
        cbox_OPCIONES.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Opcion:" }));
        cbox_OPCIONES.setActionCommand("comboBoxChanged\nd\nd\nd\nd\nd");
        cbox_OPCIONES.setColorArrow(new java.awt.Color(21, 96, 136));
        cbox_OPCIONES.setColorBorde(new java.awt.Color(27, 108, 155));
        cbox_OPCIONES.setColorFondo(new java.awt.Color(21, 96, 136));
        cbox_OPCIONES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbox_OPCIONES.setName(""); // NOI18N

        year.setColorBackground(new java.awt.Color(21, 96, 136));
        year.setColorButtonHover(new java.awt.Color(21, 96, 136));

        btn_genral.setBackground(new java.awt.Color(21, 96, 136));
        btn_genral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/reportes52px.png"))); // NOI18N
        btn_genral.setText("General Reporte");
        btn_genral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_img)
                .addGap(180, 180, 180))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbox_OPCIONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_TITULO_CORRESPONDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btn_genral, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_titu, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(txt_img)
                .addGap(18, 18, 18)
                .addComponent(txt_titu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TITULO_CORRESPONDE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(cbox_OPCIONES, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btn_genral, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void btn_genralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genralActionPerformed
        doClose(RET_CANCEL);        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,txt_TITULO_CORRESPONDE.getText().toString() );
        if(txt_TITULO_CORRESPONDE.getText().toString()=="CURSOS"){
       // JOptionPane.showMessageDialog(null,this.codigo_general);
      Reportes rp= new Reportes();
      String entidad=separar(cbox_OPCIONES.getSelectedItem().toString(), "/", 0);
     String  nom_curso= separar(cbox_OPCIONES.getSelectedItem().toString(), "/", 1);
     
     int anio=year.getYear();
    rp.RInscripciones_curso(entidad, nom_curso,anio);
       confirmar(0);
        }
        if(txt_TITULO_CORRESPONDE.getText().toString()=="SEMINARIOS"){
        ///JOptionPane.showMessageDialog(null,this.codigo_general);
      Reportes rp= new Reportes();
      String entidad=separar(cbox_OPCIONES.getSelectedItem().toString(), "/", 0);
     String  nom_curso= separar(cbox_OPCIONES.getSelectedItem().toString(), "/", 1);
     int anio=year.getYear();
     rp.RInscripciones_Seminarios(entidad, nom_curso,anio);
       confirmar(0);
        }
         if(txt_TITULO_CORRESPONDE.getText().toString()=="CONGRESOS"){
        ///JOptionPane.showMessageDialog(null,this.codigo_general);
      Reportes rp= new Reportes();
      String entidad=separar(cbox_OPCIONES.getSelectedItem().toString(), "/", 0);
     String  nom_curso= separar(cbox_OPCIONES.getSelectedItem().toString(), "/", 1);
     int anio=year.getYear();
 
      rp.RInscripcione_Congresos(entidad, nom_curso,anio);
       confirmar(0);
        }
             if(txt_TITULO_CORRESPONDE.getText().toString()=="LICENCIAS"){
        ///JOptionPane.showMessageDialog(null,this.codigo_general);
      Reportes rp= new Reportes();
      String entidad=separar(cbox_OPCIONES.getSelectedItem().toString(), "/", 0);
     String  nom_curso= separar(cbox_OPCIONES.getSelectedItem().toString(), "/", 1);
     int anio=year.getYear();
 
      rp.RInscripcione_Licencias(entidad, nom_curso, anio);
       confirmar(0);
        }
    }//GEN-LAST:event_btn_genralActionPerformed
    
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
 public String separar(String cadena,String signo,int pos) {
        String valor = cadena;
        String valor2 = "";

        String[] parts = valor.split(signo);
        valor2 = parts[pos];

        return valor2;
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
            java.util.logging.Logger.getLogger(Menu_RInscripciones_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_RInscripciones_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_RInscripciones_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_RInscripciones_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu_RInscripciones_General dialog = new Menu_RInscripciones_General(new javax.swing.JFrame(), true);
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
    public rojerusan.RSButtonMetro btn_genral;
    public rojerusan.RSComboMetro cbox_OPCIONES;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JLabel txt_TITULO_CORRESPONDE;
    public javax.swing.JLabel txt_img;
    public javax.swing.JLabel txt_titu;
    private rojeru_san.componentes.RSYearDate year;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}