/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas_paneles;

import Reportes.Reportes;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Datos;
import tabla.MyScrollbarUI;

/**
 *
 * @author Danilo
 */
public class Diplomados extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Home
     */
    public Diplomados() {
        initComponents();
        // jLabel6.setBorder(no);

        docente_menu.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu.getHorizontalScrollBar().setUI(new MyScrollbarUI());

        consutarTabla_Diplomados();
        control_botones();
        nofocus();
        vaciar_cajas();

    }

    ////conex
    Datos d= new Datos();
      String direccionBD = d.getDireccionBD();
      String usuarioBD = d.getUsuarioBD();
      String contraBD = d.getContraBD();
    // Instanciamos la clase conectar 
    modelo.conectar cone1 = new modelo.conectar();
    // realizamos la conexion
    public Connection cn = cone1.conexion(direccionBD, usuarioBD, contraBD);
    // la conexion se hereda en cn

    int caja1 = 0;
    int caja2 = 0;
    int caja3 = 0;
    int caja4 = 0;
    int caja5 = 0;
    int caja6 = 0;
    int caja7 = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        docente_menu = new javax.swing.JScrollPane();
        Tabla_diplomados = new rojerusan.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new rojerusan.RSButtonMetro();
        cbox_buscar = new rojerusan.RSComboMetro();
        txt_buscar = new rojerusan.RSMetroTextPlaceHolder();
        btn_nuevo = new rojerusan.RSButtonMetro();
        btn_guardar = new rojerusan.RSButtonMetro();
        txt_nombre = new rojerusan.RSMetroTextPlaceHolder();
        txt_codigo = new rojerusan.RSMetroTextPlaceHolder();
        cbox_n_modulos = new rojerusan.RSComboMetro();
        btn_actualizar = new rojerusan.RSButtonMetro();
        btn_eliminar = new rojerusan.RSButtonMetro();
        btn_refrescar = new rojerusan.RSButtonMetro();
        btn_reportes = new rojerusan.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        docente_menu.setBackground(new java.awt.Color(21, 96, 136));

        Tabla_diplomados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_diplomados.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_diplomados.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_diplomados.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_diplomados.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_diplomados.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_diplomados.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_diplomados.setColorSelBackgound(new java.awt.Color(27, 108, 155));
        Tabla_diplomados.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_diplomados.setSelectionBackground(new java.awt.Color(21, 96, 136));
        Tabla_diplomados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_diplomadosMouseClicked(evt);
            }
        });
        docente_menu.setViewportView(Tabla_diplomados);

        jPanel1.setBackground(new java.awt.Color(21, 96, 136));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/diplomados_52px.png"))); // NOI18N
        jLabel1.setText("      Diplomados");

        btn_buscar.setBackground(new java.awt.Color(21, 96, 136));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/buscar_52px.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        cbox_buscar.setBackground(new java.awt.Color(21, 96, 136));
        cbox_buscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por..", "Código", "Nombre", "Apellido" }));
        cbox_buscar.setActionCommand("comboBoxChanged\nd\nd\nd\nd\nd");
        cbox_buscar.setColorArrow(new java.awt.Color(21, 96, 136));
        cbox_buscar.setColorBorde(new java.awt.Color(21, 96, 136));
        cbox_buscar.setColorFondo(new java.awt.Color(21, 96, 136));
        cbox_buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbox_buscar.setName(""); // NOI18N
        cbox_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_buscarActionPerformed(evt);
            }
        });

        txt_buscar.setForeground(new java.awt.Color(27, 108, 155));
        txt_buscar.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_buscar.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_buscar.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_buscar.setDisabledTextColor(new java.awt.Color(102, 102, 255));
        txt_buscar.setPhColor(new java.awt.Color(27, 108, 155));
        txt_buscar.setPlaceholder("Buscar:");
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbox_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbox_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))))
        );

        btn_nuevo.setBackground(new java.awt.Color(21, 96, 136));
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/nuevo_52px.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_guardar.setBackground(new java.awt.Color(21, 96, 136));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/guardar_52px.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        txt_nombre.setForeground(new java.awt.Color(27, 108, 155));
        txt_nombre.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_nombre.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_nombre.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_nombre.setDisabledTextColor(new java.awt.Color(102, 102, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_nombre.setPhColor(new java.awt.Color(27, 108, 155));
        txt_nombre.setPlaceholder("Nombre:");
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_codigo.setForeground(new java.awt.Color(27, 108, 155));
        txt_codigo.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_codigo.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_codigo.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_codigo.setDisabledTextColor(new java.awt.Color(102, 102, 255));
        txt_codigo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_codigo.setPhColor(new java.awt.Color(27, 108, 155));
        txt_codigo.setPlaceholder("Código:");
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        cbox_n_modulos.setBackground(new java.awt.Color(51, 51, 255));
        cbox_n_modulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Numero de módulos", "1 ", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));
        cbox_n_modulos.setActionCommand("comboBoxChanged\nd\nd\nd\nd\nd");
        cbox_n_modulos.setColorArrow(new java.awt.Color(21, 96, 136));
        cbox_n_modulos.setColorBorde(new java.awt.Color(27, 108, 155));
        cbox_n_modulos.setColorFondo(new java.awt.Color(21, 96, 136));
        cbox_n_modulos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbox_n_modulos.setName(""); // NOI18N

        btn_actualizar.setBackground(new java.awt.Color(21, 96, 136));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/actualizar_52px.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(21, 96, 136));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/eliminar_52px.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_refrescar.setBackground(new java.awt.Color(21, 96, 136));
        btn_refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/refrescar52px.png"))); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        btn_reportes.setBackground(new java.awt.Color(21, 96, 136));
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/reportes52px.png"))); // NOI18N
        btn_reportes.setText("Reportes");
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_n_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addComponent(docente_menu)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(docente_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_n_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        cbox_n_modulos.getAccessibleContext().setAccessibleName("");
        cbox_n_modulos.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        try {

            String codigo = txt_codigo.getText().toString();
            String nombre = txt_nombre.getText().toString();
            int n_modulos = Integer.parseInt(cbox_n_modulos.getSelectedItem().toString());
           

//      if(codigo.isEmpty()){
//                alerta("Error","El Campo Codigo esta vacio" ,"/Img_alertas/Error_100px.png");
//         
//          txt_codigo.requestFocus();
//           }
            //    JOptionPane.showMessageDialog(null, Txt_fecha.getDatoFecha());
            try {
                PreparedStatement pst;
                pst = cn.prepareStatement("INSERT INTO `diplomados`(`cod_dip`, `nombre_dip`, `n_modulos_dip`) VALUES (?,?,?)");

                pst.setString(1, codigo);
                pst.setString(2, nombre);
                pst.setInt(3, n_modulos);
               

                pst.executeUpdate();
                alerta("Notificación", "Datos Guardados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");

                //           JOptionPane.showMessageDialog(null, "se guardo el datos " + Tabla_dis.getValueAt(i, 0).toString() + " y " + Tabla_dis.getValueAt(i, 1).toString());
            } catch (SQLException ex) {

                alerta("Error", "No se pudo guardar " + ex, "/Img_alertas/Error_100px.png");

                Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            }

            consutarTabla_Diplomados();
            btn_True_false();
            vaciar_cajas();

        } catch (Exception ex) {

            alerta("Error", "Faltan Campos de LLenar " + ex, "/Img_alertas/Error_100px.png");

            txt_codigo.requestFocus();

        }


    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        
         
         
         nuevo();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void cbox_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_buscarActionPerformed
        // TODO add your handling code here:
        String Campo=cbox_buscar.getSelectedItem().toString();
          switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
               
                txt_buscar.setEnabled(false);
                 consutarTabla_Diplomados();
                 btn_True_false();
                 vaciar_cajas();
                break;
            case "Código":
                txt_buscar.setEnabled(true);

                 nuevo();
                
                break;
                case "Nombre":
                    txt_buscar.setEnabled(true);
                    nuevo();
                
                break;
                case "Apellido":
                    txt_buscar.setEnabled(true);
                 nuevo();
                break;
        }
        
        
    }//GEN-LAST:event_cbox_buscarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed


        // TODO add your handling code here:
        int res = confirmar("Error", "Seguro que desea actualizar este campo ", "/Img_alertas/Error_100px.png");

            if (res == 1) {
         
        
            String codigo = txt_codigo.getText().toString();
            String nombre = txt_nombre.getText().toString();
            int n_modulos = Integer.parseInt(cbox_n_modulos.getSelectedItem().toString());
        //alerta("Notificacion", "Datos Guardados exitosamente" , "/Img_alertas/satisfactoriamente_.png");
        try {

            PreparedStatement pst = cn.prepareStatement("UPDATE `diplomados` SET `nombre_dip`=?,`n_modulos_dip`=?  WHERE  diplomados.cod_dip='" + codigo + "'");

            pst.setString(1, nombre);
            pst.setInt(2, n_modulos);
           

            pst.executeUpdate();
            alerta("Notificación", "Datos se actualizaron exitosamente ", "/Img_alertas/satisfactoriamente_100px.png");

        } catch (SQLException e) {
            // JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LOS DATOS" + e.getMessage());
            alerta("Error", "No se pudo actualizar los datos " + e, "/Img_alertas/Error_100px.png");
        }

        consutarTabla_Diplomados();
        btn_True_false();
        vaciar_cajas();
        
        
        
        
        
            }
            else{
               alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png"); 
            }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {

//             Alertas wa = new Alertas(null, true);
//        wa.txt_titu.setText("Alerta");
//        wa.txt_txt.setText("Seguro que desea eliminar este campo");
//
//        wa.txt_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_alertas/Error_100px.png")));
//
//        wa.setVisible(true);
            int res = confirmar("Error", "Seguro que desea eliminar este campo ", "/Img_alertas/Error_100px.png");

            if (res == 1) {

                // TODO add your handling code here:
                String codigo = txt_codigo.getText().toString();
                PreparedStatement pst;
                pst = cn.prepareStatement("DELETE FROM `diplomados` WHERE diplomados.cod_dip=?");
                pst.setString(1, codigo);
                pst.executeUpdate();
                alerta("Notificación", "Datos eliminados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
            } else {
                alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
            }

        } catch (SQLException ex) {
            alerta("Error", "No se elimino los datos " + ex, "/Img_alertas/Error_100px.png");
        }
        consutarTabla_Diplomados();
        btn_True_false();
        vaciar_cajas();


    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        // TODO add your handling code here:
        consutarTabla_Diplomados();
        control_botones();
         txt_buscar.setText("");
         cbox_buscar. setSelectedIndex(0);
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void Tabla_diplomadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_diplomadosMouseClicked
        try {
            // TODO add your handling code here:

            int fila = Tabla_diplomados.getSelectedRow();

            if (fila > -1) {
                //  Txt_Codigo.setText(Integer.toString(fila));
                txt_codigo.setText(Tabla_diplomados.getValueAt(fila, 0).toString());
                txt_nombre.setText(Tabla_diplomados.getValueAt(fila, 1).toString());
               
                
               

                String seleccion = String.valueOf(Tabla_diplomados.getValueAt(fila, 2).toString());

                switch (seleccion) {

                    case "1":

                        cbox_n_modulos.setSelectedIndex(1);

                        break;

                    case "2":

                        cbox_n_modulos.setSelectedIndex(2);

                        break;
                    case "3":

                        cbox_n_modulos.setSelectedIndex(3);

                        break;

                    case "4":

                        cbox_n_modulos.setSelectedIndex(4);

                        break;
                        case "5":

                        cbox_n_modulos.setSelectedIndex(5);

                        break;

                    case "6":

                        cbox_n_modulos.setSelectedIndex(6);

                        break;
                    case "7":

                        cbox_n_modulos.setSelectedIndex(7);

                        break;

                    case "8":

                        cbox_n_modulos.setSelectedIndex(8);

                        break;
                        case "9":

                        cbox_n_modulos.setSelectedIndex(9);

                        break;

                    case "10":

                        cbox_n_modulos.setSelectedIndex(10);

                        break;
                    case "11":

                        cbox_n_modulos.setSelectedIndex(11);

                        break;

                    case "12":

                        cbox_n_modulos.setSelectedIndex(12);

                        break;
                        case "13":

                        cbox_n_modulos.setSelectedIndex(13);

                        break;
                    case "14":

                        cbox_n_modulos.setSelectedIndex(14);

                        break;

                    case "15":

                        cbox_n_modulos.setSelectedIndex(15);

                        break;
 
                    default:

                        cbox_n_modulos.setSelectedIndex(0);

                        break;

                }
                
            }

        } catch (Exception ex) {
            // Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            alerta("Error", "No a seleccionado la opcion Nuevo" + ex, "/Img_alertas/Error_100px.png");
        }


    }//GEN-LAST:event_Tabla_diplomadosMouseClicked

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        // TODO add your handling code here:
          Reportes rp= new Reportes();
      rp.RDiplomados_general();
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        // TODO add your handling code here:
        String Campo = cbox_buscar.getSelectedItem().toString();
        String txtSql = txt_buscar.getText().toString();
       
   String  Campo2= null;
        switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
                
               

                break;
            case "Código":
               
                Campo2="cod_dip";
                consutaBD( Campo2,txtSql);
                
                break;
                case "Nombre":
                   
                    Campo2="nombre_dip";
                consutaBD( Campo2,txtSql);
                
                break;
                case "Número de Módulos":
                    
                     Campo2="n_modulos_dip";
                consutaBD( Campo2,txtSql);
                break;
        }
        
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
          String Campo=cbox_buscar.getSelectedItem().toString();
          String  Campo2= null;
            String txtSql = txt_buscar.getText().toString();
          switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
               
                txt_buscar.setEnabled(false);
                 consutarTabla_Diplomados();
                 btn_True_false();
                 vaciar_cajas();
                 nuevo();
                break;
            case "Código":
                Campo2="cod_dip";
               consutaBD_sinfiltros( Campo2,txtSql);
                 
                 
                 
                txt_buscar.setEnabled(true);

               
                
                break;
                case "Nombre":
                    
                    
                    Campo2="nombre_dip";
               consutaBD_sinfiltros( Campo2,txtSql);
                
                    txt_buscar.setEnabled(true);
                   
                
                break;
                case "Número de Módulos":
                    
                     Campo2="n_modulos_dip";
             consutaBD_sinfiltros( Campo2,txtSql);
                    
                    txt_buscar.setEnabled(true);
                 
                break;
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        // TODO add your handling code here:
        char letra=evt.getKeyChar();
        if(!Character.isLetter(letra) && !Character.isSpaceChar(letra)){// si no es letra
            evt.consume();// cancelo ingreso de la letra
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    public void consutarTabla_Diplomados() {

        String consultaBD = "SELECT * FROM `diplomados`";
        javax.swing.JTable Tabla = this.Tabla_diplomados;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
        String cabesera[] = {"Código", "Nombre", "Número de Módulos"};
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);

    }

    public void consutaBD(String Campo, String txtSQL) {

        //String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + "='" + txtSQL + "'";
          String consultaBD = "SELECT * FROM `diplomados` WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
          //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = this.Tabla_diplomados;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
        String cabesera[] = {"Código", "Nombre", "Número de Módulos"};
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);

    }
     public void consutaBD_sinfiltros(String Campo, String txtSQL) {

        String consultaBD = "SELECT * FROM `diplomados` WHERE " + Campo + "='" + txtSQL + "'";
         // String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
          //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = this.Tabla_diplomados;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
        String cabesera[] = {"Código", "Nombre", "Número de Módulos"};
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);

    }

    public void control_botones() {
        btn_guardar.setEnabled(false);
        btn_nuevo.setEnabled(true);
        btn_actualizar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_reportes.setEnabled(true);
        btn_refrescar.setEnabled(true);
    }

    public void alerta(String titulo, String texto, String dir_img) {

        Alertas wa = new Alertas(null, true);
        wa.txt_titu.setText(titulo);
        wa.txt_txt.setText(texto);

        wa.txt_img.setIcon(new javax.swing.ImageIcon(getClass().getResource(dir_img)));

        wa.setVisible(true);
    }

    public int confirmar(String titulo, String texto, String dir_img) {

        int estatus = 9;
        Alertas wa = new Alertas(null, true);
        wa.txt_titu.setText(titulo);
        wa.txt_txt.setText(texto);

        wa.txt_img.setIcon(new javax.swing.ImageIcon(getClass().getResource(dir_img)));

        wa.setVisible(true);

        estatus = wa.respuesta;

        return estatus;
    }

    private void nofocus() {
        btn_nuevo.setFocusPainted(false);
        btn_actualizar.setFocusPainted(false);
        btn_eliminar.setFocusPainted(false);
        btn_reportes.setFocusPainted(false);
        btn_refrescar.setFocusPainted(false);
        btn_guardar.setFocusPainted(false);

    }

    private void vaciar_cajas() {
        txt_nombre.setText("");
       
        cbox_n_modulos.setSelectedIndex(0);
         ;
        txt_codigo.setText("");

        txt_nombre.setEnabled(false);
        
        cbox_n_modulos.setEnabled(false);
        
        txt_codigo.setEnabled(false);
        Tabla_diplomados.setEnabled(false);
        txt_buscar.setEnabled(false);
         
    }

    private void btn_True_false() {
        btn_guardar.setEnabled(false);
        btn_nuevo.setEnabled(true);
        btn_actualizar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_reportes.setEnabled(true);
        btn_refrescar.setEnabled(true);
        Tabla_diplomados.setEnabled(false);
      
    }
    private void nuevo(){
        btn_guardar.setEnabled(true);
        btn_nuevo.setEnabled(false);
        btn_actualizar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_reportes.setEnabled(true);
        btn_refrescar.setEnabled(true);

        txt_nombre.setEnabled(true);
       
        cbox_n_modulos.setEnabled(true);
       
        txt_codigo.setEnabled(true);
        Tabla_diplomados.setEnabled(true);

        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro Tabla_diplomados;
    private rojerusan.RSButtonMetro btn_actualizar;
    private rojerusan.RSButtonMetro btn_buscar;
    private rojerusan.RSButtonMetro btn_eliminar;
    private rojerusan.RSButtonMetro btn_guardar;
    private rojerusan.RSButtonMetro btn_nuevo;
    private rojerusan.RSButtonMetro btn_refrescar;
    private rojerusan.RSButtonMetro btn_reportes;
    private rojerusan.RSComboMetro cbox_buscar;
    private rojerusan.RSComboMetro cbox_n_modulos;
    private javax.swing.JScrollPane docente_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSMetroTextPlaceHolder txt_buscar;
    private rojerusan.RSMetroTextPlaceHolder txt_codigo;
    private rojerusan.RSMetroTextPlaceHolder txt_nombre;
    // End of variables declaration//GEN-END:variables
}
