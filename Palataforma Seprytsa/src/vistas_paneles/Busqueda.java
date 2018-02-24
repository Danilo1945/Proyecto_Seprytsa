/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas_paneles;

import java.sql.Connection;
import javax.swing.JOptionPane;
import tabla.MyScrollbarUI;
import controlador.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import vistas_paneles.*;

/**
 *
 * @author Danilo
 */
public class Busqueda extends javax.swing.JFrame {
public String Entidad="f";
    /** Creates new form Busqueda */
    public Busqueda() {
        initComponents();
        docente_menu.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu.getHorizontalScrollBar().setUI(new MyScrollbarUI());

        control_botones();
        nofocus();
        vaciar_cajas();
        llenar_cbox_busqueda();
        //this.setLocationRelativeTo(this);
        cerrar();
    }
    
    
    ////conex
    String direccionBD = "jdbc:mysql://localhost:3307/seprytsa";
    String usuarioBD = "root";
    String contraBD = "";
    // Instanciamos la clase conectar 
    modelo.conectar cone1 = new modelo.conectar();
    // realizamos la conexion
    public Connection cn = cone1.conexion(direccionBD, usuarioBD, contraBD);
    // la conexion se hereda en cn
   
   public String palabra_busqueda1;
   public String palabra_busqueda2;
    String cabesera_general[] = null;
   
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        docente_menu = new javax.swing.JScrollPane();
        Tabla_Seleccion = new rojerusan.RSTableMetro();
        btn_guardar = new rojerusan.RSButtonMetro();
        txt_codigo = new rojerusan.RSMetroTextPlaceHolder();
        txt_nombre = new rojerusan.RSMetroTextPlaceHolder();
        jPanel4 = new javax.swing.JPanel();
        btn_nuevo = new rojerusan.RSButtonMetro();
        btn_Refrescar = new rojerusan.RSButtonMetro();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbox_buscar = new rojerusan.RSComboMetro();
        txt_buscar = new rojerusan.RSMetroTextPlaceHolder();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(450, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        docente_menu.setBackground(new java.awt.Color(21, 96, 136));
        docente_menu.setPreferredSize(new java.awt.Dimension(600, 402));

        Tabla_Seleccion.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla_Seleccion.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_Seleccion.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_Seleccion.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_Seleccion.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_Seleccion.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_Seleccion.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_Seleccion.setColorSelBackgound(new java.awt.Color(27, 108, 155));
        Tabla_Seleccion.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_Seleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_SeleccionMouseClicked(evt);
            }
        });
        docente_menu.setViewportView(Tabla_Seleccion);

        btn_guardar.setBackground(new java.awt.Color(21, 96, 136));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/guardar_52px.png"))); // NOI18N
        btn_guardar.setText("Seleccionar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_nuevo.setBackground(new java.awt.Color(21, 96, 136));
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/nuevo_52px.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_Refrescar.setBackground(new java.awt.Color(21, 96, 136));
        btn_Refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/refrescar52px.png"))); // NOI18N
        btn_Refrescar.setText("Refrescar");
        btn_Refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefrescarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(21, 96, 136));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/buscar_52px.png"))); // NOI18N
        jLabel1.setText("      Busquedas");

        cbox_buscar.setBackground(new java.awt.Color(21, 96, 136));
        cbox_buscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por.." }));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbox_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbox_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docente_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(docente_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_SeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SeleccionMouseClicked
        try {
            // TODO add your handling code here:

            int fila = Tabla_Seleccion.getSelectedRow();

            if (fila > -1) {
                //  Txt_Codigo.setText(Integer.toString(fila));
                txt_codigo.setText(Tabla_Seleccion.getValueAt(fila, 0).toString());
                txt_nombre.setText(Tabla_Seleccion.getValueAt(fila, 1).toString());

            }

        } catch (Exception ex) {
            // Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            alerta("Error", "No a seleccionado la opcion Nuevo" + ex, "/Img_alertas/Error_100px.png");
        }

    }//GEN-LAST:event_Tabla_SeleccionMouseClicked

    private void cbox_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_buscarActionPerformed
        // TODO add your handling code here:
        if(Entidad=="estudiante"){
              String Campo=cbox_buscar.getSelectedItem().toString();
          switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
               
                txt_buscar.setEnabled(false);
                 consutarTabla_General();
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
        }if(Entidad=="periodo_academico"){
            String Campo=cbox_buscar.getSelectedItem().toString();
          switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
               
                txt_buscar.setEnabled(false);
                 consutarTabla_General();
                 btn_True_false();
                 vaciar_cajas();
                break;
            case "Código":
                txt_buscar.setEnabled(true);

                 nuevo();
                
                break;
                case "Fecha inicio":
                    txt_buscar.setEnabled(true);
                    nuevo();
                
                break;
                case "Fecha fin":
                    txt_buscar.setEnabled(true);
                 nuevo();
                break;
                
        }
            
            
            
        }
        if(Entidad=="horarios"){
           String Campo=cbox_buscar.getSelectedItem().toString();
          switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
             //  Rango de Días Rango de Horas
                txt_buscar.setEnabled(false);
                 consutarTabla_General();
                 btn_True_false();
                 vaciar_cajas();
                break;
            case "Rango de Días":
                txt_buscar.setEnabled(true);

                 nuevo();
                
                break;
                case "Rango de Horas":
                    txt_buscar.setEnabled(true);
                    nuevo();
                
                break;
                case "Apellido":
                    txt_buscar.setEnabled(true);
                 nuevo();
                break;
        }
        }
         if(Entidad=="diplomados"){
            String Campo=cbox_buscar.getSelectedItem().toString();
          switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
               
                txt_buscar.setEnabled(false);
                 consutarTabla_General();
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
          
          
        }
        
                
        
        
        

    }//GEN-LAST:event_cbox_buscarActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        // TODO add your handling code here:
        if(Entidad=="estudiante"){
            String Campo = cbox_buscar.getSelectedItem().toString();
        String txtSql = txt_buscar.getText().toString();
       
   String  Campo2= null;
        switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
                
               

                break;
            case "Código":
               
                Campo2="cod_est";
                consutaBD( Campo2,txtSql);
                
                break;
                case "Nombre":
                   
                    Campo2="Nombre_est";
                consutaBD( Campo2,txtSql);
                
                break;
                case "Apellido":
                  
                Campo2="Apellido_est";
                consutaBD( Campo2,txtSql);
                break;
        }

            
        }if(Entidad=="periodo_academico"){
           String Campo = cbox_buscar.getSelectedItem().toString();
        String txtSql = txt_buscar.getText().toString();
       
   String  Campo2= null;
        switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
                
               
//Buscar Por.., Código, Fecha inicio, Fecha fin
                break;
            case "Código":
               
                Campo2="cod_pa";
                consutaBD( Campo2,txtSql);
                
                break;
                case "Fecha inicio":
                   
                    Campo2="fecha_ini_pa";
                consutaBD( Campo2,txtSql);
                
                break;
                case "Fecha fin":
                  
                Campo2="fecha_fin_pa";
                consutaBD( Campo2,txtSql);
                break;
        }
        }
        if(Entidad=="horarios"){
           String Campo = cbox_buscar.getSelectedItem().toString();
        String txtSql = txt_buscar.getText().toString();
       
   String  Campo2= null;
        switch (Campo) {
//Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":
                
            

                break;
            case "Rango de Días":
               
                Campo2="rango_dias_hor";
                consutaBD( Campo2,txtSql);
                
                break;
                case "Rango de Horas":
                   
                    Campo2="Horario_hor";
                consutaBD( Campo2,txtSql);
                
                break;
                case "Número de Módulos":
                    
                     Campo2="n_modulos_dip";
                consutaBD( Campo2,txtSql);
                break;
        }
        }
         if(Entidad=="diplomados"){
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
        }
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
//JOptionPane.showMessageDialog(null, Entidad);
String Lectura=txt_codigo.getText().toString();
if(Entidad=="estudiante"){
    Main.p.mat.txt_cod_estudiante.setText(Lectura); 
}
if(Entidad=="periodo_academico"){
    Main.p.mat.txt_cod_p_academico.setText(Lectura);
}
if(Entidad=="horarios"){
    Main.p.mat.txt_cod_horario.setText(Lectura);
}
if(Entidad=="diplomados"){
    Main.p.mat.txt_cod_diplomado.setText(Lectura);
}




   
this.dispose();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_RefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefrescarActionPerformed
    nuevo();     
    llenar_cbox_busqueda();
    consutarTabla_General();
        
    }//GEN-LAST:event_btn_RefrescarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
    
if(Entidad=="estudiante"){
   Main.p.pintar(6);
  Estudiantes est =new Estudiantes();
         
    new cambia_panel(Main.p.panel_master,est); 
}
if(Entidad=="periodo_academico"){
     Main.p. pintar(8);
        
        Periodo_Academico pe=new Periodo_Academico();
        new cambia_panel(Main.p.panel_master,pe); 
 
   
}
if(Entidad=="horarios"){
     Main.p.  pintar(7);
         Horarios hor =new Horarios();
    new cambia_panel(Main.p.panel_master,hor);
   
}
if(Entidad=="diplomados"){
     Main.p.  pintar(11);
          Diplomados dip=new Diplomados();
    new cambia_panel(Main.p.panel_master,dip);
   
}




   
this.dispose();

        
    }//GEN-LAST:event_btn_nuevoActionPerformed

    
     public void consutarTabla_General() {

        String consultaBD = "SELECT * FROM "+Entidad;
        javax.swing.JTable Tabla = this.Tabla_Seleccion;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
       
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera_general);

    }

    public void consutaBD(String Campo, String txtSQL) {

        //String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + "='" + txtSQL + "'";
          String consultaBD = "SELECT * FROM "+Entidad+" WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
          //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = this.Tabla_Seleccion;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
       
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera_general);

    }
     public void consutaBD_sinfiltros(String Campo, String txtSQL) {

        String consultaBD = "SELECT * FROM "+Entidad+" WHERE " + Campo + "='" + txtSQL + "'";
         // String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
          //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = this.Tabla_Seleccion;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla
        String cabesera[] = {"Código", "Nombre", "Número de Módulos"};
        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla,cabesera_general);

    }

    public void control_botones() {
        //btn_guardar.setEnabled(false);
        
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
     
        btn_guardar.setFocusPainted(false);

    }

    private void vaciar_cajas() {
        txt_nombre.setText("");
       
        txt_codigo.setText("");
         txt_nombre.setEditable(false);
        txt_codigo.setEditable(false);
        cbox_buscar.setEnabled(false);
        txt_buscar.setEnabled(false);

//        txt_nombre.setEnabled(false);
//        
    Tabla_Seleccion.setEnabled(false);
//        txt_buscar.setEnabled(false);
         
    }

    private void btn_True_false() {
//        btn_guardar.setEnabled(false);       
//        Tabla_diplomados.setEnabled(false);     
    }
    private void nuevo(){
//        btn_guardar.setEnabled(true);
//        txt_nombre.setEnabled(true);      
//        txt_codigo.setEnabled(true);
        Tabla_Seleccion.setEnabled(true);
        cbox_buscar.setEnabled(true);
        txt_buscar.setEnabled(true);

        
    }
  private  void llenar_cbox_busqueda(){
    //   JOptionPane.showMessageDialog(null, Entidad);
         if(Entidad=="estudiante"){
            String cabesera[] = {"Código", "Nombres", "Apellidos", "Dirección", "Teléfono", "Fecha de Naciemiento", "Nacionalidad","Tipo de Sangre"
        };
            cabesera_general=cabesera;
            //Buscar Por.., Código, Nombre, Apellido
            cbox_buscar.addItem("Código");
            cbox_buscar.addItem("Nombre");
            cbox_buscar.addItem("Apellido");
           
            
            
        }if(Entidad=="periodo_academico"){
            String cabesera[] = {"Código", "Fecha de Inicio", "Fecha de Fin","Nombre"};
           cabesera_general=cabesera;
            //Buscar Por.., Código, Fecha inicio, Fecha fin
            cbox_buscar.addItem("Código");
            cbox_buscar.addItem("Fecha inicio");
            cbox_buscar.addItem("Fecha fin");
        }
        if(Entidad=="horarios"){
            String cabesera[] = {"Código", "Rango de Días", "Rango de Horas"};
            cabesera_general=cabesera;
            //Buscar Por.., Rango de Días, Rango de Horas
            cbox_buscar.addItem("Rango de Días");
            cbox_buscar.addItem("Rango de Horas");
           
        }
         if(Entidad=="diplomados"){
            String cabesera[] = {"Código", "Nombre", "Número de Módulos"};
            cabesera_general=cabesera;
            //Buscar Por.., Código, Nombre, Apellido
            cbox_buscar.addItem("Código");
            cbox_buscar.addItem("Nombre");
             cbox_buscar.addItem("Apellido");
        }
        
    }
    
    
    
    public void cerrar(){
    try {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);

        this.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro Tabla_Seleccion;
    private rojerusan.RSButtonMetro btn_Refrescar;
    private rojerusan.RSButtonMetro btn_guardar;
    private rojerusan.RSButtonMetro btn_nuevo;
    private rojerusan.RSComboMetro cbox_buscar;
    private javax.swing.JScrollPane docente_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private rojerusan.RSMetroTextPlaceHolder txt_buscar;
    private rojerusan.RSMetroTextPlaceHolder txt_codigo;
    private rojerusan.RSMetroTextPlaceHolder txt_nombre;
    // End of variables declaration//GEN-END:variables

}
