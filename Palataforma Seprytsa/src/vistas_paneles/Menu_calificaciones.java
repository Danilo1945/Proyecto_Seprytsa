/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas_paneles;

import controlador.Main;
import controlador.cambia_panel;

/**
 *
 * @author Danilo
 */
public class Menu_calificaciones extends javax.swing.JDialog {

    /**
     * Creates new form Menu_calificaciones
     */
    /**
     * Creates new form NewJDialog
     */
    public Menu_calificaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btn_producto1.setFocusPainted(false);
        btn_producto2.setFocusPainted(false);
        btn_producto3.setFocusPainted(false);
        btn_producto4.setFocusPainted(false);
        btn_reportes.setFocusPainted(false);

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
        btn_producto1 = new rojerusan.RSButtonMetro();
        btn_producto2 = new rojerusan.RSButtonMetro();
        btn_producto3 = new rojerusan.RSButtonMetro();
        btn_reportes = new rojerusan.RSButtonMetro();
        btn_producto4 = new rojerusan.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        btn_producto1.setBackground(new java.awt.Color(21, 96, 136));
        btn_producto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_alertas/Img_sub_menus/open_50pxpx.png"))); // NOI18N
        btn_producto1.setText("Primer Producto  ");
        btn_producto1.setActionCommand("          ");
        btn_producto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_producto1ActionPerformed(evt);
            }
        });

        btn_producto2.setBackground(new java.awt.Color(21, 96, 136));
        btn_producto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_alertas/Img_sub_menus/open_50pxpx.png"))); // NOI18N
        btn_producto2.setText("Segundo Producto");
        btn_producto2.setActionCommand("          ");
        btn_producto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_producto2ActionPerformed(evt);
            }
        });

        btn_producto3.setBackground(new java.awt.Color(21, 96, 136));
        btn_producto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_alertas/Img_sub_menus/open_50pxpx.png"))); // NOI18N
        btn_producto3.setText("Tercer Producto  ");
        btn_producto3.setActionCommand("          ");
        btn_producto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_producto3ActionPerformed(evt);
            }
        });

        btn_reportes.setBackground(new java.awt.Color(21, 96, 136));
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_alertas/Img_sub_menus/open_50pxpx.png"))); // NOI18N
        btn_reportes.setText("Reportes                ");
        btn_reportes.setActionCommand("          ");
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        btn_producto4.setBackground(new java.awt.Color(21, 96, 136));
        btn_producto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_alertas/Img_sub_menus/open_50pxpx.png"))); // NOI18N
        btn_producto4.setText("Cuarto Producto ");
        btn_producto4.setActionCommand("          ");
        btn_producto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_producto4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_producto1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(btn_producto2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(btn_producto3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(btn_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(btn_producto4, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_producto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_producto1ActionPerformed
        // TODO add your handling code here:
        // if(Entidad=="estudiante"){
        Main.p.pintar(2);
        Calificaciones cal = new Calificaciones();
        new cambia_panel(Main.p.panel_master, cal);
        cal.txt_identificativo.setText("Calificaciones/Primer Producto");

        //}
        this.dispose();
    }//GEN-LAST:event_btn_producto1ActionPerformed
	private void btn_producto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_producto2ActionPerformed
            // TODO add your handling code here:
             Main.p.pintar(2);
        Calificaciones cal = new Calificaciones();
        new cambia_panel(Main.p.panel_master, cal);
        cal.txt_identificativo.setText("Calificaciones/Segundo Producto");
            
            
            
            this.dispose();
    }//GEN-LAST:event_btn_producto2ActionPerformed

    private void btn_producto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_producto3ActionPerformed
        // TODO add your handling code here:
         Main.p.pintar(2);
        Calificaciones cal = new Calificaciones();
        new cambia_panel(Main.p.panel_master, cal);
        cal.txt_identificativo.setText("Calificaciones/Tercer Producto");
        
        
        this.dispose();
    }//GEN-LAST:event_btn_producto3ActionPerformed

    private void btn_producto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_producto4ActionPerformed
        // TODO add your handling code here:
         Main.p.pintar(2);
        Calificaciones cal = new Calificaciones();
        new cambia_panel(Main.p.panel_master, cal);
        cal.txt_identificativo.setText("Calificaciones/Cuarto Producto");
        
        this.dispose();
    }//GEN-LAST:event_btn_producto4ActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        // TODO add your handling code here:
        Main.p.pintar(2);
        Reporte_califi rc = new Reporte_califi();
        new cambia_panel(Main.p.panel_master, rc);
        
        this.dispose();
    }//GEN-LAST:event_btn_reportesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu_calificaciones dialog = new Menu_calificaciones(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonMetro btn_producto1;
    private rojerusan.RSButtonMetro btn_producto2;
    private rojerusan.RSButtonMetro btn_producto3;
    private rojerusan.RSButtonMetro btn_producto4;
    private rojerusan.RSButtonMetro btn_reportes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
