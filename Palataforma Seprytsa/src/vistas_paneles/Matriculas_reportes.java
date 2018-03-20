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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Matriculas_reportes extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Home
     */
    public Matriculas_reportes() {
        initComponents();
        // jLabel6.setBorder(no);

        docente_menu2.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu2.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        docente_menu.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu.getHorizontalScrollBar().setUI(new MyScrollbarUI());

        control_botones();
        nofocus();
        vaciar_cajas();
//        txt_codigo.setEnabled(false);
        cbox_periodo_aca.setEnabled(false);

        ///////// cargo combo periodo
        consultar_periodo_academico(cbox_periodo_aca);

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

    int cod_cal=0;
    int posicion=0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt_identificativo = new javax.swing.JLabel();
        btn_nuevo = new rojerusan.RSButtonMetro();
        cbox_diplomados = new rojerusan.RSComboMetro();
        btn_refrescar = new rojerusan.RSButtonMetro();
        btn_reportes = new rojerusan.RSButtonMetro();
        cbox_periodo_aca = new rojerusan.RSComboMetro();
        cbox_Horarios = new rojerusan.RSComboMetro();
        docente_menu2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        docente_menu = new javax.swing.JScrollPane();
        Tabla_calificaciones = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(21, 96, 136));

        txt_identificativo.setBackground(new java.awt.Color(255, 255, 255));
        txt_identificativo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_identificativo.setForeground(new java.awt.Color(255, 255, 255));
        txt_identificativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/matriculas_52px.png"))); // NOI18N
        txt_identificativo.setText("Reportes Estudiantes Matriculados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txt_identificativo, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_identificativo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_nuevo.setBackground(new java.awt.Color(21, 96, 136));
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/nuevo_52px.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        cbox_diplomados.setBackground(new java.awt.Color(21, 96, 136));
        cbox_diplomados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diplomados:" }));
        cbox_diplomados.setActionCommand("comboBoxChanged\nd\nd\nd\nd\nd");
        cbox_diplomados.setColorArrow(new java.awt.Color(21, 96, 136));
        cbox_diplomados.setColorBorde(new java.awt.Color(27, 108, 155));
        cbox_diplomados.setColorFondo(new java.awt.Color(21, 96, 136));
        cbox_diplomados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbox_diplomados.setName(""); // NOI18N
        cbox_diplomados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_diplomadosActionPerformed(evt);
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
        btn_reportes.setText("Generar Reporte                 ");
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        cbox_periodo_aca.setBackground(new java.awt.Color(21, 96, 136));
        cbox_periodo_aca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Periodo académico:" }));
        cbox_periodo_aca.setActionCommand("comboBoxChanged\nd\nd\nd\nd\nd");
        cbox_periodo_aca.setColorArrow(new java.awt.Color(21, 96, 136));
        cbox_periodo_aca.setColorBorde(new java.awt.Color(27, 108, 155));
        cbox_periodo_aca.setColorFondo(new java.awt.Color(21, 96, 136));
        cbox_periodo_aca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbox_periodo_aca.setName(""); // NOI18N
        cbox_periodo_aca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_periodo_acaActionPerformed(evt);
            }
        });

        cbox_Horarios.setBackground(new java.awt.Color(21, 96, 136));
        cbox_Horarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horarios:" }));
        cbox_Horarios.setActionCommand("comboBoxChanged\nd\nd\nd\nd\nd");
        cbox_Horarios.setColorArrow(new java.awt.Color(21, 96, 136));
        cbox_Horarios.setColorBorde(new java.awt.Color(27, 108, 155));
        cbox_Horarios.setColorFondo(new java.awt.Color(21, 96, 136));
        cbox_Horarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbox_Horarios.setName(""); // NOI18N
        cbox_Horarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_HorariosActionPerformed(evt);
            }
        });

        docente_menu2.setBackground(new java.awt.Color(21, 96, 136));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_calificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        Tabla_calificaciones.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_calificaciones.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_calificaciones.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_calificaciones.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_calificaciones.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_calificaciones.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_calificaciones.setColorSelBackgound(new java.awt.Color(21, 96, 136));
        Tabla_calificaciones.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_calificaciones.setSelectionBackground(new java.awt.Color(21, 96, 136));
        Tabla_calificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_calificacionesMouseClicked(evt);
            }
        });
        docente_menu.setViewportView(Tabla_calificaciones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(docente_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 418, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(docente_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        docente_menu2.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_periodo_aca, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(cbox_diplomados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox_Horarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docente_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(docente_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbox_periodo_aca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_Horarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_diplomados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        cbox_diplomados.getAccessibleContext().setAccessibleName("");
        cbox_diplomados.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed

        nuevo();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        // TODO add your handling code here:
        try {
            control_botones();
         String pa = separar(cbox_periodo_aca.getSelectedItem().toString());
                    String hor = separar(cbox_Horarios.getSelectedItem().toString());
                    String dip = separar(cbox_diplomados.getSelectedItem().toString());
//                    String resultado = separar2(txt_identificativo.getText().toString());
                    // JOptionPane.showMessageDialog(null, resultado);
                   
           
                    
                    
                    
                    preparar_calificaciones( pa, hor, dip);
                    cbox_diplomados.setEnabled(false);
                    cbox_Horarios.setEnabled(false);
//                     btn_True_false();
                       vaciar_cajas(); 
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        // TODO add your handling code here:
        try {
            
                    String pa = separar(cbox_periodo_aca.getSelectedItem().toString());
                    int hor =Integer.parseInt( separar(cbox_Horarios.getSelectedItem().toString()));
                    String dip = separar(cbox_diplomados.getSelectedItem().toString());
                String Dias=separar2(cbox_Horarios.getSelectedItem().toString(), "/",1);
                String horas=separar2(cbox_Horarios.getSelectedItem().toString(), "/",2);
                String dip_txt=separar2(cbox_diplomados.getSelectedItem().toString(), "/",1);
                String pa_txt=separar2(cbox_periodo_aca.getSelectedItem().toString(), "/",1);
        
        
        Reportes rp= new Reportes();
      rp.RMatriculas_Parametro(pa, dip, hor, pa_txt, dip_txt, Dias, horas);
        } catch (Exception e) {
            alerta("Error", "Nose puede generar el reporte faltan parámetros,Por favor vuelva intentarlo" + e, "/Img_alertas/Error_100px.png");
        }
      
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void cbox_periodo_acaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_periodo_acaActionPerformed
        // TODO add your handling code here:
        try {

            String comparacion = cbox_periodo_aca.getSelectedItem().toString();
            if (!(comparacion == "Periodo académico:") && !(comparacion == "")) {
//   cbox_horarios.removeAllItems();
//        cbox_horarios.addItem("Horarios:");
                String Captura = cbox_periodo_aca.getSelectedItem().toString();

                String[] parts = Captura.split("/");
                String Captura2 = parts[0];
                // JOptionPane.showMessageDialog(null,cbox_periodo_aca.getSelectedItem().toString());

                consultar_Horarios(Captura2);
                cbox_Horarios.setEnabled(true);
            }
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_cbox_periodo_acaActionPerformed
    public String separar(String cadena) {
        String valor = cadena;
        String valor2 = "";

        String[] parts = valor.split("/");
        valor2 = parts[0];

        return valor2;
    }

    public String separar2(String cadena,String signo,int pos) {
        String valor = cadena;
        String valor2 = "";

        String[] parts = valor.split(signo);
        valor2 = parts[pos];

        return valor2;
    }
    private void cbox_diplomadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_diplomadosActionPerformed
        // TODO add your handling code here:
        
        try {
            String comparacion1 = cbox_diplomados.getSelectedItem().toString();
           // int indicador=0;
           

            if (!(comparacion1 == "Diplomados:") && !(comparacion1 == "")) {

              
                    String pa = separar(cbox_periodo_aca.getSelectedItem().toString());
                    String hor = separar(cbox_Horarios.getSelectedItem().toString());
                    String dip = separar(cbox_diplomados.getSelectedItem().toString());
                   
                    // JOptionPane.showMessageDialog(null, resultado);
                 //  JOptionPane.showMessageDialog(docente_menu,pa+" "+ " "+hor+" "+dip);
                    preparar_calificaciones( pa, hor, dip);
                    
                    
                    cbox_diplomados.setEnabled(false);
                    cbox_Horarios.setEnabled(false);
                    Tabla_calificaciones.setEnabled(true);
                    cbox_periodo_aca.setEnabled(false);
                    btn_nuevo.setEnabled(true);
                    btn_refrescar.setEnabled(true);
                    btn_reportes.setEnabled(true);
                  
                    
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_cbox_diplomadosActionPerformed

    private void cbox_HorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_HorariosActionPerformed
        // TODO add your handling code here:
        String comparacion = cbox_Horarios.getSelectedItem().toString();
        if (!(comparacion == "Horarios:") && !(comparacion == "")) {

            String periodo = separar(cbox_periodo_aca.getSelectedItem().toString());
            String horario = separar(cbox_Horarios.getSelectedItem().toString());
//         JOptionPane.showMessageDialog(null, periodo);
//         JOptionPane.showMessageDialog(null, horario);
            consultar_Diplomados(periodo, horario);
            cbox_diplomados.setEnabled(true);

        }


    }//GEN-LAST:event_cbox_HorariosActionPerformed

    private void Tabla_calificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_calificacionesMouseClicked
        // TODO add your handling code here:
        
//    //    JOptionPane.showMessageDialog(docente_menu, evt);
//            int fila = Tabla_calificaciones.getSelectedRow();
//
//            if (fila > -1) {
//               posicion=fila;
//                //  Txt_Codigo.setText(Integer.toString(fila));
//                txt_codigo.setText(Tabla_calificaciones.getValueAt(fila, 0).toString());
//                txt_nombre.setText(Tabla_calificaciones.getValueAt(fila, 3).toString());
//                txt_apellido.setText(Tabla_calificaciones.getValueAt(fila, 2).toString());
//                 cod_cal=Integer.parseInt(Tabla_calificaciones.getValueAt(fila, 4).toString());
////                 
//            }
                
                 
        
      
        
    }//GEN-LAST:event_Tabla_calificacionesMouseClicked

    

    public void consutaBD(int pos, String pa, String hor, String dip, String Campo, String txtSQL) {

        if(pos ==1){
         try {
            String consultaBD = "SELECT matricula.cod_mat, estudiante.cod_est,estudiante.Apellido_est,estudiante.Nombre_est,calificacion_1.cod_cal_1,calificacion_1.valor_cal,calificacion_1.faltas FROM horarios, diplomados,matricula,periodo_academico,estudiante,calificacion_1\n" +
"WHERE periodo_academico.cod_pa='"+pa+"' \n" +
"AND horarios.cod_hor="+hor +"\n"+
"AND diplomados.cod_dip='"+dip+"' \n" +
"AND periodo_academico.cod_pa=matricula.cod_pa \n" +
"AND horarios.cod_hor=matricula.cod_hor \n" +
"AND diplomados.cod_dip=matricula.cod_dip \n" +
"AND estudiante.cod_est=matricula.cod_est \n" +
"AND matricula.cod_mat=calificacion_1.cod_mat\n" +
  " AND "+Campo + " LIKE '" + txtSQL + "_%'"+
 " ORDER BY estudiante.Apellido_est ";
          //  JOptionPane.showMessageDialog(null, consultaBD);
            javax.swing.JTable Tabla = this.Tabla_calificaciones;
            // Enviamos los parametros para la consulta de la tabla
            //  conexion    consulta de la base de datos y el nombre de la tabla
            String cabesera[] = {"Matrícula", "Código del estudiante", "Apellido ", "Nombre", "Código", "Nota", "Faltas"};
            cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        }

        
        
        
        
        
        
    }

    public void consutaBD_sinfiltros(String Campo, String txtSQL) {

        String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + "='" + txtSQL + "'";
        // String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
        //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = this.Tabla_calificaciones;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
        String cabesera[] = {"Código", "Nombres", "Apellidos", "Dirección", "Teléfono", "Fecha de Naciemiento", "Nacionalidad"
        };
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);

    }

    public void control_botones() {
//         btn_siguiente.setEnabled(false);
//        btn_guardar.setEnabled(false);
        btn_nuevo.setEnabled(true);
     //   btn_actualizar.setEnabled(false);
       // btn_eliminar.setEnabled(false);
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
        //btn_actualizar.setFocusPainted(false);
      //  btn_eliminar.setFocusPainted(false);
        btn_reportes.setFocusPainted(false);
        btn_refrescar.setFocusPainted(false);
//        btn_guardar.setFocusPainted(false);

    }

    private void vaciar_cajas() {
//        txt_nombre.setText("");
//        txt_apellido.setText("");
////        txt_calificacion.setText("");
////        txt_N_faltas.setText("");
//        txt_codigo.setText("");
//      
//
//        txt_nombre.setEnabled(false);
//        txt_apellido.setEnabled(false);

        cbox_diplomados.setEnabled(false);
//        txt_buscar.setEnabled(false);
        cbox_Horarios.setEnabled(false); 
        //////////////
//        txt_N_faltas.setEnabled(false);
//        txt_calificacion.setEnabled(false);
       btn_refrescar.setEnabled(false);
      //  cbox_periodo_aca.setEnabled(false);
       // Tabla_calificaciones.setEnabled(false);
        btn_reportes.setEnabled(false);
        btn_refrescar.setEnabled(false);
        

    }

    private void btn_True_false() {
       // btn_guardar.setEnabled(false);
        //btn_nuevo.setEnabled(true);
    //    btn_actualizar.setEnabled(false);
        //btn_eliminar.setEnabled(false);
        btn_reportes.setEnabled(false);
        btn_refrescar.setEnabled(false);
        Tabla_calificaciones.setEnabled(false);
//        txt_codigo.setEnabled(false);
       // btn_siguiente.setEnabled(false);
     
        

    }

    private void nuevo() {
       // btn_guardar.setEnabled(true);
        btn_nuevo.setEnabled(false);
       // btn_actualizar.setEnabled(true);
      //  btn_eliminar.setEnabled(true);
        btn_reportes.setEnabled(true);
      //  btn_refrescar.setEnabled(true);
       

       // txt_nombre.setEnabled(true);
       // txt_apellido.setEnabled(true);
        
        //cbox_diplomados.setEnabled(true);

        cbox_periodo_aca.setEnabled(true);
    }

    public void consultar_periodo_academico(rojerusan.RSComboMetro per_aca) {

        try {
//            cbox_periodo_aca.removeAllItems();
//            cbox_periodo_aca.addItem("Periodo Académico:");
            Statement estado;
            String Nombre_per_aca = "";
            String codigo = "";

/// hacemos consulata sql
            estado = cn.createStatement();
            ResultSet resultado = estado.executeQuery("SELECT *FROM `periodo_academico`");

            while (resultado.next()) {
                codigo = resultado.getString(1);
                Nombre_per_aca = resultado.getString(4);
                per_aca.addItem(codigo + "/" + Nombre_per_aca);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Matriculas_reportes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void limpiar_combo(rojerusan.RSComboMetro combo) {
        for (int i = combo.getItemCount() - 1; i > 0; i--) {
            combo.removeItemAt(i);
        }
    }

    public void consultar_Horarios(String seleccion) {
        try {
            String sql_consulta = "SELECT horarios.cod_hor, horarios.rango_dias_hor,horarios.Horario_hor FROM horarios,matricula,periodo_academico "
                    + "WHERE periodo_academico.cod_pa='" + seleccion + "' AND matricula.cod_hor=horarios.cod_hor AND periodo_academico.cod_pa=matricula.cod_pa ";

            Statement estado;
            String codigo = "";
            String dias = "";
            String horas = "";

            estado = cn.createStatement();
            ResultSet resultado = estado.executeQuery(sql_consulta);
            //  cbox_horarios.removeAllItems();
            limpiar_combo(cbox_Horarios);

            while (resultado.next()) {
                codigo = resultado.getString(1);
                dias = resultado.getString(2);
                horas = resultado.getString(3);
                cbox_Horarios.addItem(codigo + "/" + dias + "/" + horas);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Matriculas_reportes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void consultar_Diplomados(String seleccion_pa, String seleccion_ho) {
        try {
            String sql_consulta = "select diplomados.cod_dip,diplomados.nombre_dip FROM horarios,matricula,periodo_academico,diplomados\n"
                    + " WHERE periodo_academico.cod_pa='" + seleccion_pa + "' "
                    + "AND horarios.cod_hor='" + seleccion_ho + "' "
                    + "AND horarios.cod_hor= matricula.cod_hor "
                    + "AND diplomados.cod_dip=matricula.cod_dip "
                    + "AND periodo_academico.cod_pa=matricula.cod_pa ";

            Statement estado;
            String codigo = "";
            String nombre = "";

            estado = cn.createStatement();
            ResultSet resultado = estado.executeQuery(sql_consulta);
            limpiar_combo(cbox_diplomados);

            while (resultado.next()) {
                codigo = codigo = resultado.getString(1);
                nombre = resultado.getString(2);

                cbox_diplomados.addItem(codigo + "/" + nombre);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Matriculas_reportes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void preparar_calificaciones( String pa, String hor, String dip) {
       
        
        try {
            String consultaBD = "SELECT matricula.cod_mat,estudiante.cod_est, estudiante.Apellido_est,estudiante.Nombre_est\n" +
" FROM horarios, diplomados,matricula,\n" +
" periodo_academico,\n" +
" estudiante\n" +
" WHERE periodo_academico.cod_pa='"+pa+"' \n" +
" AND horarios.cod_hor="+hor+" \n" +
" AND diplomados.cod_dip='"+dip+"' \n" +
" AND periodo_academico.cod_pa=matricula.cod_pa \n" +
" AND horarios.cod_hor=matricula.cod_hor \n" +
" AND diplomados.cod_dip=matricula.cod_dip \n" +
" AND estudiante.cod_est=matricula.cod_est \n" +
" ORDER BY estudiante.Apellido_est";
           // JOptionPane.showMessageDialog(null, consultaBD);
            javax.swing.JTable Tabla = this.Tabla_calificaciones;
            // Enviamos los parametros para la consulta de la tabla
            //  conexion    consulta de la base de datos y el nombre de la tabla
            String cabesera[] = {"Matrícula", "Código del estudiante", "Apellido ", "Nombre"};
            cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
       
           
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro Tabla_calificaciones;
    private rojerusan.RSButtonMetro btn_nuevo;
    private rojerusan.RSButtonMetro btn_refrescar;
    private rojerusan.RSButtonMetro btn_reportes;
    private rojerusan.RSComboMetro cbox_Horarios;
    private rojerusan.RSComboMetro cbox_diplomados;
    private rojerusan.RSComboMetro cbox_periodo_aca;
    private javax.swing.JScrollPane docente_menu;
    private javax.swing.JScrollPane docente_menu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel txt_identificativo;
    // End of variables declaration//GEN-END:variables
}
