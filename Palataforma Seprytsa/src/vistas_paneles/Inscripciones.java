/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas_paneles;

import Reportes.Reportes;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
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
import javax.swing.plaf.TabbedPaneUI;
import tabla.MyScrollbarUI;

/**
 *
 * @author Danilo
 */
public class Inscripciones extends javax.swing.JPanel {

    public int indicador = 0;
    public String Entidad = "cursos_estudiante";
    String cabesera_general[] = {"Código", "Código del Curso", "Código del Estudiante", "Año"};

    /**
     * Creates new form Panel_Home
     */
    public Inscripciones() {
        initComponents();
        // jLabel6.setBorder(no);

        docente_menu.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        docente_menu1.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu1.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        docente_menu2.getVerticalScrollBar().setUI(new MyScrollbarUI());
        docente_menu2.getHorizontalScrollBar().setUI(new MyScrollbarUI());
//        docente_menu3.getVerticalScrollBar().setUI(new MyScrollbarUI());
//        docente_menu3.getHorizontalScrollBar().setUI(new MyScrollbarUI());

        consutarTabla_General(Tabla_cursos);
        control_botones();
        nofocus();
        vaciar_cajas();
         btn_True_false();

        tabbledPaneGeneral.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Point punto = MouseInfo.getPointerInfo().getLocation();
                int x1 = punto.x;
                int y1 = punto.y;
                cambiar_pos();

                // JOptionPane.showMessageDialog(docente_menu, "x="+x1+"  y="+y1);
                //JOptionPane.showMessageDialog(docente_menu,paneInscripciones .getSelectedIndex()); 
            }

        });

    }

    private void cambiar_pos() {
        indicador = tabbledPaneGeneral.getSelectedIndex();
        //JOptionPane.showMessageDialog(docente_menu,indicador);
//                Buscar Por.., Código, Código del estudiante, Código del Curso
// JOptionPane.showMessageDialog(docente_menu, indicador);
//  JOptionPane.showMessageDialog(docente_menu, Entidad);
//   JOptionPane.showMessageDialog(docente_menu,cabesera_general );
        if (indicador == 0) {
             btn_True_false();
            limpiar_combo(cbox_buscar);
            cbox_buscar.addItem("Código");
            cbox_buscar.addItem("Código del Estudiante");
            cbox_buscar.addItem("Código del Curso");
            cbox_buscar.addItem("Año");
            
            Entidad = "cursos_estudiante";
            String cabesera[] = {"Código", "Código del Curso", "Código del Estudiante", "Año"};
            cabesera_general = cabesera;
           consutarTabla_General(Tabla_cursos);
        }
         if (indicador == 1) {
              btn_True_false();
            limpiar_combo(cbox_buscar);
            cbox_buscar.addItem("Código");
            cbox_buscar.addItem("Código del Estudiante");
            cbox_buscar.addItem("Código del Seminario");
           
             cbox_buscar.addItem("Año");
            Entidad = "seminarios_estudiante";
            String cabesera[] = {"Código", "Código del Seminario", "Código del Estudiante", "Año"};
            cabesera_general = cabesera;
             consutarTabla_General(Tabla_Seminarios);
        }
          if (indicador == 2) {
               btn_True_false();
            limpiar_combo(cbox_buscar);
            cbox_buscar.addItem("Código");
            cbox_buscar.addItem("Código del Estudiante");
            cbox_buscar.addItem("Código del Congreso");
           
             cbox_buscar.addItem("Año");
            Entidad = "estudiante_congresos";
            String cabesera[] = {"Código", "Código del Congreso", "Código del Estudiante", "Año"};
            cabesera_general = cabesera;
             consutarTabla_General(Tabla_Congresos);
        }
        
            if (indicador == 3) {
               btn_True_false();
            limpiar_combo(cbox_buscar);
            cbox_buscar.addItem("Código");
            cbox_buscar.addItem("Código del Estudiante");
            cbox_buscar.addItem("Código de la Licencia");
           
           
            Entidad = "estudiante_licencias";
            String cabesera[] = {"Código", "Código de la Licencia", "Código del Estudiante"};
            cabesera_general = cabesera;
             consutarTabla_General(Tabla_Licencias);
        }
        
        
        
        
        
        
        
        

    }

    void limpiar_combo(rojerusan.RSComboMetro combo) {
        for (int i = combo.getItemCount() - 1; i > 0; i--) {
            combo.removeItemAt(i);
        }
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
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new rojerusan.RSButtonMetro();
        cbox_buscar = new rojerusan.RSComboMetro();
        txt_buscar = new rojerusan.RSMetroTextPlaceHolder();
        tabbledPaneGeneral = new org.matrix.BlackTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        txt_codigo_cur = new rojerusan.RSMetroTextPlaceHolder();
        txt_cod_estudiante_cur = new rojerusan.RSMetroTextPlaceHolder();
        btn_cod_cur = new rojerusan.RSButtonMetro();
        btn_cur = new rojerusan.RSButtonMetro();
        txt_cod_Curso = new rojerusan.RSMetroTextPlaceHolder();
        btn_guardar_cur = new rojerusan.RSButtonMetro();
        btn_nuevo_cur = new rojerusan.RSButtonMetro();
        docente_menu = new javax.swing.JScrollPane();
        Tabla_cursos = new rojerusan.RSTableMetro();
        btn_actualizar_cur = new rojerusan.RSButtonMetro();
        btn_refrescar_cur = new rojerusan.RSButtonMetro();
        btn_reportes_cur = new rojerusan.RSButtonMetro();
        btn_eliminar_cur = new rojerusan.RSButtonMetro();
        year_cur = new rojeru_san.componentes.RSYearDate();
        jPanel11 = new javax.swing.JPanel();
        txt_codigo_sem = new rojerusan.RSMetroTextPlaceHolder();
        txt_cod_sem = new rojerusan.RSMetroTextPlaceHolder();
        btn_sem = new rojerusan.RSButtonMetro();
        btn_cod_est_sem = new rojerusan.RSButtonMetro();
        txt_cod_estudiante_sem = new rojerusan.RSMetroTextPlaceHolder();
        year_sem = new rojeru_san.componentes.RSYearDate();
        btn_guardar_sem = new rojerusan.RSButtonMetro();
        btn_nuevo_sem = new rojerusan.RSButtonMetro();
        btn_actualizar_sem = new rojerusan.RSButtonMetro();
        btn_eliminar_sem = new rojerusan.RSButtonMetro();
        btn_reportes_sem = new rojerusan.RSButtonMetro();
        btn_refrescar_sem = new rojerusan.RSButtonMetro();
        docente_menu1 = new javax.swing.JScrollPane();
        Tabla_Seminarios = new rojerusan.RSTableMetro();
        jPanel12 = new javax.swing.JPanel();
        txt_codigo_con = new rojerusan.RSMetroTextPlaceHolder();
        txt_cod_con = new rojerusan.RSMetroTextPlaceHolder();
        txt_cod_estudiante_con = new rojerusan.RSMetroTextPlaceHolder();
        year_con = new rojeru_san.componentes.RSYearDate();
        btn_guardar_con = new rojerusan.RSButtonMetro();
        btn_con = new rojerusan.RSButtonMetro();
        btn_cod_est_con = new rojerusan.RSButtonMetro();
        btn_nuevo_con = new rojerusan.RSButtonMetro();
        docente_menu2 = new javax.swing.JScrollPane();
        Tabla_Congresos = new rojerusan.RSTableMetro();
        btn_actualizar_con = new rojerusan.RSButtonMetro();
        btn_eliminar_con = new rojerusan.RSButtonMetro();
        btn_reportes_con = new rojerusan.RSButtonMetro();
        btn_refrescar_con = new rojerusan.RSButtonMetro();
        jPanel13 = new javax.swing.JPanel();
        txt_codigo_lic = new rojerusan.RSMetroTextPlaceHolder();
        txt_cod_lic = new rojerusan.RSMetroTextPlaceHolder();
        btn_lic = new rojerusan.RSButtonMetro();
        btn_cod_est_lic = new rojerusan.RSButtonMetro();
        txt_cod_estudiante_lic = new rojerusan.RSMetroTextPlaceHolder();
        btn_guardar_lic = new rojerusan.RSButtonMetro();
        btn_nuevo_lic = new rojerusan.RSButtonMetro();
        docente_menu3 = new javax.swing.JScrollPane();
        Tabla_Licencias = new rojerusan.RSTableMetro();
        btn_actualizar_lic = new rojerusan.RSButtonMetro();
        btn_eliminar_lic = new rojerusan.RSButtonMetro();
        btn_reportes_lic = new rojerusan.RSButtonMetro();
        btn_refrescar_lic = new rojerusan.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(21, 96, 136));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/Inscription_52px.png"))); // NOI18N
        jLabel1.setText("       Inscripciones");

        btn_buscar.setBackground(new java.awt.Color(21, 96, 136));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/buscar_52px.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        cbox_buscar.setBackground(new java.awt.Color(21, 96, 136));
        cbox_buscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por..", "Código", "Código del Estudiante", "Código del Curso" }));
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
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(cbox_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        tabbledPaneGeneral.setBackground(new java.awt.Color(27, 108, 155));
        tabbledPaneGeneral.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tabbledPaneGeneral.setOpaque(true);
        tabbledPaneGeneral.setTabSelectedColor(new java.awt.Color(21, 96, 136));
        tabbledPaneGeneral.setTabUnselectedColor(new java.awt.Color(27, 108, 155));
        tabbledPaneGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbledPaneGeneralMouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        txt_codigo_cur.setForeground(new java.awt.Color(27, 108, 155));
        txt_codigo_cur.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_codigo_cur.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_codigo_cur.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_codigo_cur.setDisabledTextColor(new java.awt.Color(21, 96, 136));
        txt_codigo_cur.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_codigo_cur.setPhColor(new java.awt.Color(27, 108, 155));
        txt_codigo_cur.setPlaceholder("Código de la Inscripción del Curso:");

        txt_cod_estudiante_cur.setForeground(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_cur.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_cur.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_cur.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_cur.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_cur.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cod_estudiante_cur.setPhColor(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_cur.setPlaceholder("Código del Estudiante:");
        txt_cod_estudiante_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_estudiante_curActionPerformed(evt);
            }
        });
        txt_cod_estudiante_cur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_estudiante_curKeyTyped(evt);
            }
        });

        btn_cod_cur.setBackground(new java.awt.Color(21, 96, 136));
        btn_cod_cur.setText("Seleccionar:");
        btn_cod_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cod_curActionPerformed(evt);
            }
        });

        btn_cur.setBackground(new java.awt.Color(21, 96, 136));
        btn_cur.setText("Seleccionar:");
        btn_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curActionPerformed(evt);
            }
        });

        txt_cod_Curso.setForeground(new java.awt.Color(27, 108, 155));
        txt_cod_Curso.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_cod_Curso.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_cod_Curso.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_cod_Curso.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_cod_Curso.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cod_Curso.setPhColor(new java.awt.Color(27, 108, 155));
        txt_cod_Curso.setPlaceholder("Código del curso:");
        txt_cod_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_CursoActionPerformed(evt);
            }
        });
        txt_cod_Curso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_CursoKeyTyped(evt);
            }
        });

        btn_guardar_cur.setBackground(new java.awt.Color(21, 96, 136));
        btn_guardar_cur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/guardar_52px.png"))); // NOI18N
        btn_guardar_cur.setText("Guardar");
        btn_guardar_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_curActionPerformed(evt);
            }
        });

        btn_nuevo_cur.setBackground(new java.awt.Color(21, 96, 136));
        btn_nuevo_cur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/nuevo_52px.png"))); // NOI18N
        btn_nuevo_cur.setText("Nuevo");
        btn_nuevo_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_curActionPerformed(evt);
            }
        });

        docente_menu.setBackground(new java.awt.Color(21, 96, 136));

        Tabla_cursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_cursos.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_cursos.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_cursos.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_cursos.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_cursos.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_cursos.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_cursos.setColorSelBackgound(new java.awt.Color(27, 108, 155));
        Tabla_cursos.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_cursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_cursosMouseClicked(evt);
            }
        });
        docente_menu.setViewportView(Tabla_cursos);

        btn_actualizar_cur.setBackground(new java.awt.Color(21, 96, 136));
        btn_actualizar_cur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/actualizar_52px.png"))); // NOI18N
        btn_actualizar_cur.setText("Actualizar");
        btn_actualizar_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_curActionPerformed(evt);
            }
        });

        btn_refrescar_cur.setBackground(new java.awt.Color(21, 96, 136));
        btn_refrescar_cur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/refrescar52px.png"))); // NOI18N
        btn_refrescar_cur.setText("Refrescar");
        btn_refrescar_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescar_curActionPerformed(evt);
            }
        });

        btn_reportes_cur.setBackground(new java.awt.Color(21, 96, 136));
        btn_reportes_cur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/reportes52px.png"))); // NOI18N
        btn_reportes_cur.setText("Reportes");
        btn_reportes_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportes_curActionPerformed(evt);
            }
        });

        btn_eliminar_cur.setBackground(new java.awt.Color(21, 96, 136));
        btn_eliminar_cur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/eliminar_52px.png"))); // NOI18N
        btn_eliminar_cur.setText("Eliminar");
        btn_eliminar_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_curActionPerformed(evt);
            }
        });

        year_cur.setColorBackground(new java.awt.Color(21, 96, 136));
        year_cur.setColorButtonHover(new java.awt.Color(21, 96, 136));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_codigo_cur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(year_cur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cod_estudiante_cur, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(txt_cod_Curso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cod_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btn_guardar_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btn_nuevo_cur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_actualizar_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_eliminar_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_reportes_cur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_refrescar_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docente_menu)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txt_codigo_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cod_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cod_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cod_estudiante_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year_cur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nuevo_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reportes_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refrescar_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(docente_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))))
        );

        tabbledPaneGeneral.addTab("Cursos         ", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        txt_codigo_sem.setForeground(new java.awt.Color(27, 108, 155));
        txt_codigo_sem.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_codigo_sem.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_codigo_sem.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_codigo_sem.setDisabledTextColor(new java.awt.Color(21, 96, 136));
        txt_codigo_sem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_codigo_sem.setPhColor(new java.awt.Color(27, 108, 155));
        txt_codigo_sem.setPlaceholder("Código de la inscripcion del seminario:");

        txt_cod_sem.setForeground(new java.awt.Color(27, 108, 155));
        txt_cod_sem.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_cod_sem.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_cod_sem.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_cod_sem.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_cod_sem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cod_sem.setPhColor(new java.awt.Color(27, 108, 155));
        txt_cod_sem.setPlaceholder("Código del Seminario:");
        txt_cod_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_semActionPerformed(evt);
            }
        });
        txt_cod_sem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_semKeyTyped(evt);
            }
        });

        btn_sem.setBackground(new java.awt.Color(21, 96, 136));
        btn_sem.setText("Seleccionar:");
        btn_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_semActionPerformed(evt);
            }
        });

        btn_cod_est_sem.setBackground(new java.awt.Color(21, 96, 136));
        btn_cod_est_sem.setText("Seleccionar:");
        btn_cod_est_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cod_est_semActionPerformed(evt);
            }
        });

        txt_cod_estudiante_sem.setForeground(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_sem.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_sem.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_sem.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_sem.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_sem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cod_estudiante_sem.setPhColor(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_sem.setPlaceholder("Código del Estudiante:");
        txt_cod_estudiante_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_estudiante_semActionPerformed(evt);
            }
        });
        txt_cod_estudiante_sem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_estudiante_semKeyTyped(evt);
            }
        });

        year_sem.setColorBackground(new java.awt.Color(21, 96, 136));
        year_sem.setColorButtonHover(new java.awt.Color(21, 96, 136));

        btn_guardar_sem.setBackground(new java.awt.Color(21, 96, 136));
        btn_guardar_sem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/guardar_52px.png"))); // NOI18N
        btn_guardar_sem.setText("Guardar");
        btn_guardar_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_semActionPerformed(evt);
            }
        });

        btn_nuevo_sem.setBackground(new java.awt.Color(21, 96, 136));
        btn_nuevo_sem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/nuevo_52px.png"))); // NOI18N
        btn_nuevo_sem.setText("Nuevo");
        btn_nuevo_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_semActionPerformed(evt);
            }
        });

        btn_actualizar_sem.setBackground(new java.awt.Color(21, 96, 136));
        btn_actualizar_sem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/actualizar_52px.png"))); // NOI18N
        btn_actualizar_sem.setText("Actualizar");
        btn_actualizar_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_semActionPerformed(evt);
            }
        });

        btn_eliminar_sem.setBackground(new java.awt.Color(21, 96, 136));
        btn_eliminar_sem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/eliminar_52px.png"))); // NOI18N
        btn_eliminar_sem.setText("Eliminar");
        btn_eliminar_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_semActionPerformed(evt);
            }
        });

        btn_reportes_sem.setBackground(new java.awt.Color(21, 96, 136));
        btn_reportes_sem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/reportes52px.png"))); // NOI18N
        btn_reportes_sem.setText("Reportes");
        btn_reportes_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportes_semActionPerformed(evt);
            }
        });

        btn_refrescar_sem.setBackground(new java.awt.Color(21, 96, 136));
        btn_refrescar_sem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/refrescar52px.png"))); // NOI18N
        btn_refrescar_sem.setText("Refrescar");
        btn_refrescar_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescar_semActionPerformed(evt);
            }
        });

        docente_menu1.setBackground(new java.awt.Color(21, 96, 136));

        Tabla_Seminarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Seminarios.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_Seminarios.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_Seminarios.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_Seminarios.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_Seminarios.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_Seminarios.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_Seminarios.setColorSelBackgound(new java.awt.Color(27, 108, 155));
        Tabla_Seminarios.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_Seminarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_SeminariosMouseClicked(evt);
            }
        });
        docente_menu1.setViewportView(Tabla_Seminarios);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_guardar_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txt_codigo_sem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(year_sem, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txt_cod_estudiante_sem, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txt_cod_sem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cod_est_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_nuevo_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_actualizar_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_eliminar_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_reportes_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_refrescar_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docente_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txt_codigo_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cod_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cod_estudiante_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cod_est_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(220, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nuevo_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reportes_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refrescar_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(docente_menu1))))
        );

        tabbledPaneGeneral.addTab("Seminarios     ", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        txt_codigo_con.setForeground(new java.awt.Color(27, 108, 155));
        txt_codigo_con.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_codigo_con.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_codigo_con.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_codigo_con.setDisabledTextColor(new java.awt.Color(21, 96, 136));
        txt_codigo_con.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_codigo_con.setPhColor(new java.awt.Color(27, 108, 155));
        txt_codigo_con.setPlaceholder("Código de la inscripcion del Congreso:");

        txt_cod_con.setForeground(new java.awt.Color(27, 108, 155));
        txt_cod_con.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_cod_con.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_cod_con.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_cod_con.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_cod_con.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cod_con.setPhColor(new java.awt.Color(27, 108, 155));
        txt_cod_con.setPlaceholder("Código del Congreso:");
        txt_cod_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_conActionPerformed(evt);
            }
        });
        txt_cod_con.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_conKeyTyped(evt);
            }
        });

        txt_cod_estudiante_con.setForeground(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_con.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_con.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_con.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_con.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_con.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cod_estudiante_con.setPhColor(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_con.setPlaceholder("Código del Estudiante:");
        txt_cod_estudiante_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_estudiante_conActionPerformed(evt);
            }
        });
        txt_cod_estudiante_con.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_estudiante_conKeyTyped(evt);
            }
        });

        year_con.setColorBackground(new java.awt.Color(21, 96, 136));
        year_con.setColorButtonHover(new java.awt.Color(21, 96, 136));

        btn_guardar_con.setBackground(new java.awt.Color(21, 96, 136));
        btn_guardar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/guardar_52px.png"))); // NOI18N
        btn_guardar_con.setText("Guardar");
        btn_guardar_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_conActionPerformed(evt);
            }
        });

        btn_con.setBackground(new java.awt.Color(21, 96, 136));
        btn_con.setText("Seleccionar:");
        btn_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conActionPerformed(evt);
            }
        });

        btn_cod_est_con.setBackground(new java.awt.Color(21, 96, 136));
        btn_cod_est_con.setText("Seleccionar:");
        btn_cod_est_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cod_est_conActionPerformed(evt);
            }
        });

        btn_nuevo_con.setBackground(new java.awt.Color(21, 96, 136));
        btn_nuevo_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/nuevo_52px.png"))); // NOI18N
        btn_nuevo_con.setText("Nuevo");
        btn_nuevo_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_conActionPerformed(evt);
            }
        });

        docente_menu2.setBackground(new java.awt.Color(21, 96, 136));

        Tabla_Congresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Congresos.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_Congresos.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_Congresos.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_Congresos.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_Congresos.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_Congresos.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_Congresos.setColorSelBackgound(new java.awt.Color(27, 108, 155));
        Tabla_Congresos.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_Congresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_CongresosMouseClicked(evt);
            }
        });
        docente_menu2.setViewportView(Tabla_Congresos);

        btn_actualizar_con.setBackground(new java.awt.Color(21, 96, 136));
        btn_actualizar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/actualizar_52px.png"))); // NOI18N
        btn_actualizar_con.setText("Actualizar");
        btn_actualizar_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_conActionPerformed(evt);
            }
        });

        btn_eliminar_con.setBackground(new java.awt.Color(21, 96, 136));
        btn_eliminar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/eliminar_52px.png"))); // NOI18N
        btn_eliminar_con.setText("Eliminar");
        btn_eliminar_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_conActionPerformed(evt);
            }
        });

        btn_reportes_con.setBackground(new java.awt.Color(21, 96, 136));
        btn_reportes_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/reportes52px.png"))); // NOI18N
        btn_reportes_con.setText("Reportes");
        btn_reportes_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportes_conActionPerformed(evt);
            }
        });

        btn_refrescar_con.setBackground(new java.awt.Color(21, 96, 136));
        btn_refrescar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/refrescar52px.png"))); // NOI18N
        btn_refrescar_con.setText("Refrescar");
        btn_refrescar_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescar_conActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_codigo_con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(year_con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cod_estudiante_con, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(txt_cod_con, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_con, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cod_est_con, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btn_guardar_con, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btn_nuevo_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_actualizar_con, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_eliminar_con, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_reportes_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_refrescar_con, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docente_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txt_codigo_con, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cod_con, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_con, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cod_est_con, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cod_estudiante_con, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar_con, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nuevo_con, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar_con, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_con, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reportes_con, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refrescar_con, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(docente_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))))
        );

        tabbledPaneGeneral.addTab("Congresos      ", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        txt_codigo_lic.setForeground(new java.awt.Color(27, 108, 155));
        txt_codigo_lic.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_codigo_lic.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_codigo_lic.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_codigo_lic.setDisabledTextColor(new java.awt.Color(21, 96, 136));
        txt_codigo_lic.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_codigo_lic.setPhColor(new java.awt.Color(27, 108, 155));
        txt_codigo_lic.setPlaceholder("Código de la inscripcion de la Licencia:");

        txt_cod_lic.setForeground(new java.awt.Color(27, 108, 155));
        txt_cod_lic.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_cod_lic.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_cod_lic.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_cod_lic.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_cod_lic.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cod_lic.setPhColor(new java.awt.Color(27, 108, 155));
        txt_cod_lic.setPlaceholder("Código de la Licencia:");
        txt_cod_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_licActionPerformed(evt);
            }
        });
        txt_cod_lic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_licKeyTyped(evt);
            }
        });

        btn_lic.setBackground(new java.awt.Color(21, 96, 136));
        btn_lic.setText("Seleccionar:");
        btn_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_licActionPerformed(evt);
            }
        });

        btn_cod_est_lic.setBackground(new java.awt.Color(21, 96, 136));
        btn_cod_est_lic.setText("Seleccionar:");
        btn_cod_est_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cod_est_licActionPerformed(evt);
            }
        });

        txt_cod_estudiante_lic.setForeground(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_lic.setBorderColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_lic.setBotonColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_lic.setCaretColor(new java.awt.Color(21, 96, 136));
        txt_cod_estudiante_lic.setDisabledTextColor(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_lic.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_cod_estudiante_lic.setPhColor(new java.awt.Color(27, 108, 155));
        txt_cod_estudiante_lic.setPlaceholder("Código del Estudiante:");
        txt_cod_estudiante_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_estudiante_licActionPerformed(evt);
            }
        });
        txt_cod_estudiante_lic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_estudiante_licKeyTyped(evt);
            }
        });

        btn_guardar_lic.setBackground(new java.awt.Color(21, 96, 136));
        btn_guardar_lic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/guardar_52px.png"))); // NOI18N
        btn_guardar_lic.setText("Guardar");
        btn_guardar_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_licActionPerformed(evt);
            }
        });

        btn_nuevo_lic.setBackground(new java.awt.Color(21, 96, 136));
        btn_nuevo_lic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/nuevo_52px.png"))); // NOI18N
        btn_nuevo_lic.setText("Nuevo");
        btn_nuevo_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_licActionPerformed(evt);
            }
        });

        docente_menu3.setBackground(new java.awt.Color(21, 96, 136));

        Tabla_Licencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Licencias.setColorBackgoundHead(new java.awt.Color(21, 96, 136));
        Tabla_Licencias.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        Tabla_Licencias.setColorBordeHead(new java.awt.Color(21, 96, 136));
        Tabla_Licencias.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla_Licencias.setColorFilasForeground1(new java.awt.Color(21, 96, 136));
        Tabla_Licencias.setColorFilasForeground2(new java.awt.Color(21, 96, 136));
        Tabla_Licencias.setColorSelBackgound(new java.awt.Color(27, 108, 155));
        Tabla_Licencias.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla_Licencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_LicenciasMouseClicked(evt);
            }
        });
        docente_menu3.setViewportView(Tabla_Licencias);

        btn_actualizar_lic.setBackground(new java.awt.Color(21, 96, 136));
        btn_actualizar_lic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/actualizar_52px.png"))); // NOI18N
        btn_actualizar_lic.setText("Actualizar");
        btn_actualizar_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_licActionPerformed(evt);
            }
        });

        btn_eliminar_lic.setBackground(new java.awt.Color(21, 96, 136));
        btn_eliminar_lic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/eliminar_52px.png"))); // NOI18N
        btn_eliminar_lic.setText("Eliminar");
        btn_eliminar_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_licActionPerformed(evt);
            }
        });

        btn_reportes_lic.setBackground(new java.awt.Color(21, 96, 136));
        btn_reportes_lic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/reportes52px.png"))); // NOI18N
        btn_reportes_lic.setText("Reportes");
        btn_reportes_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportes_licActionPerformed(evt);
            }
        });

        btn_refrescar_lic.setBackground(new java.awt.Color(21, 96, 136));
        btn_refrescar_lic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_menu/refrescar52px.png"))); // NOI18N
        btn_refrescar_lic.setText("Refrescar");
        btn_refrescar_lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescar_licActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_codigo_lic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_cod_estudiante_lic, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(txt_cod_lic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cod_est_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btn_guardar_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btn_nuevo_lic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_actualizar_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_eliminar_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_reportes_lic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_refrescar_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docente_menu3)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txt_codigo_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cod_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cod_est_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cod_estudiante_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nuevo_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reportes_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refrescar_lic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(docente_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))))
        );

        tabbledPaneGeneral.addTab("Licencias      ", jPanel13);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabbledPaneGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabbledPaneGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_curActionPerformed
        // TODO add your handling code here:
        try {

            String codigo = txt_codigo_cur.getText().toString();
            String cod_estudiante = txt_cod_estudiante_cur.getText().toString();
            String cod_Curso = txt_cod_Curso.getText().toString();
            int anio = 2017;
            anio = year_cur.getYear();

            int status = 2;

            try {
                if (codigo != "") {
                    PreparedStatement pst;
                    pst = cn.prepareStatement("INSERT INTO `cursos_estudiante`(`cod_cur_est`, `codigo_cur`, `cod_est`, `Anio`) VALUES (?,?,?,?)");

                    pst.setString(1, codigo);
                    pst.setString(2, cod_Curso);
                    pst.setString(3, cod_estudiante);
                    pst.setInt(4, anio);
                    pst.executeUpdate();

                    alerta("Notificación", "Datos Guardados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
                    consutarTabla_General(Tabla_cursos);
                    btn_True_false();
                    vaciar_cajas();

                } else {
                    alerta("Error", "Campo de la clave oblicagatorio", "/Img_alertas/satisfactoriamente_100px.png");
                    txt_codigo_cur.setFocusable(true);

                }
                //           JOptionPane.showMessageDialog(null, "se guardo el datos " + Tabla_dis.getValueAt(i, 0).toString() + " y " + Tabla_dis.getValueAt(i, 1).toString());
            } catch (SQLException ex) {

                alerta("Error", "No se pudo guardar  Faltan campos" + ex, "/Img_alertas/Error_100px.png");

                Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception ex) {

            alerta("Error", "Faltan Campos de LLenar " + ex, "/Img_alertas/Error_100px.png");

            txt_codigo_cur.requestFocus();

        }


    }//GEN-LAST:event_btn_guardar_curActionPerformed


    private void btn_reportes_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportes_curActionPerformed
      try {
          Menu_RInscripciones_General mi= new Menu_RInscripciones_General(null, true);
         
          rojerusan.RSComboMetro  combo=mi.cbox_OPCIONES;  
          String enti="cursos";
            consultar_Combo(combo, enti);
            mi.codigo_general=0;
            mi.txt_TITULO_CORRESPONDE.setText("CURSOS");
                mi.setVisible(true);     
                    
        } catch (Exception e) {
             alerta("Error", "A ocurrido un error al tratar de generar el reporte: " + e, "/Img_alertas/Error_100px.png");
        }


    }//GEN-LAST:event_btn_reportes_curActionPerformed

    private void btn_refrescar_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescar_curActionPerformed
        // TODO add your handling code here:
        consutarTabla_General(Tabla_cursos);
        control_botones();
        txt_buscar.setText("");
        cbox_buscar.setSelectedIndex(0);
    }//GEN-LAST:event_btn_refrescar_curActionPerformed

    private void btn_eliminar_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_curActionPerformed
        try {

            int res = confirmar("Alerta", "Seguro que desea eliminar este campo ", "/Img_alertas/Error_100px.png");

            if (res == 1) {

                // TODO add your handling code here:
                String codigo = txt_codigo_cur.getText().toString();
                PreparedStatement pst;
                pst = cn.prepareStatement("DELETE FROM `cursos_estudiante` WHERE cursos_estudiante.cod_cur_est=?");
                pst.setString(1, codigo);
                pst.executeUpdate();
                alerta("Notificación", "Datos eliminados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
            } else {
                alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
            }

        } catch (SQLException ex) {
            alerta("Error", "No se elimino los datos " + ex, "/Img_alertas/Error_100px.png");
        }
        consutarTabla_General(Tabla_cursos);
        btn_True_false();
        vaciar_cajas();

    }//GEN-LAST:event_btn_eliminar_curActionPerformed

    private void btn_actualizar_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_curActionPerformed

        // TODO add your handling code here:
        int res = confirmar("Alerta", "Seguro que desea actualizar este campo? ", "/Img_alertas/Error_100px.png");

        if (res == 1) {

            String codigo = txt_codigo_cur.getText().toString();
            String cod_estudiante = txt_cod_estudiante_cur.getText().toString();
            String cod_curso = txt_cod_Curso.getText().toString();
            int anio = 2017;
            anio = year_cur.getYear();

            //alerta("Notificacion", "Datos Guardados exitosamente" , "/Img_alertas/satisfactoriamente_.png");
            try {

                PreparedStatement pst = cn.prepareStatement("UPDATE `cursos_estudiante` SET `codigo_cur`=?,`cod_est`=?,`Anio`=? WHERE cursos_estudiante.cod_cur_est='" + codigo + "'");

                pst.setString(1, cod_curso);
                pst.setString(2, cod_estudiante);

                pst.setInt(3, anio);

                pst.executeUpdate();
                alerta("Notificación", "Datos se actualizaron exitosamente ", "/Img_alertas/satisfactoriamente_100px.png");

            } catch (SQLException e) {
                // JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LOS DATOS" + e.getMessage());
                alerta("Error", "No se pudo actualizar los datos " + e, "/Img_alertas/Error_100px.png");
            }

            consutarTabla_General(Tabla_cursos);
            btn_True_false();
            vaciar_cajas();

        } else {
            alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
        }
    }//GEN-LAST:event_btn_actualizar_curActionPerformed

    private void txt_cod_CursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_CursoKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if (!Character.isLetter(letra) && !Character.isSpaceChar(letra)) {// si no es letra
            evt.consume();// cancelo ingreso de la letra
        }
    }//GEN-LAST:event_txt_cod_CursoKeyTyped

    private void txt_cod_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_CursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_CursoActionPerformed

    private void txt_cod_estudiante_curKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_estudiante_curKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if (!Character.isLetter(letra) && !Character.isSpaceChar(letra)) {// si no es letra
            evt.consume();// cancelo ingreso de la letra
        }
    }//GEN-LAST:event_txt_cod_estudiante_curKeyTyped

    private void txt_cod_estudiante_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_estudiante_curActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_estudiante_curActionPerformed

    private void btn_nuevo_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_curActionPerformed
        // TODO add your handling code here:

        nuevo();
    }//GEN-LAST:event_btn_nuevo_curActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        // TODO add your handling code here:
        //Buscar Por..
        if (indicador == 0) {

            String Campo = cbox_buscar.getSelectedItem().toString();
            String txtSql = txt_buscar.getText().toString();

            String Campo2 = null;
            switch (Campo) {
                //Buscar Por.., Código, Nombre, Apellido
                case "Buscar Por..":
//Buscar Por.., Código, Código del Estudiante, Código del Curso
                    break;
                case "Código":

                    Campo2 = "cod_cur_est";
                    consutaBD(Campo2, txtSql, Tabla_cursos);

                    break;
                case "Código del Estudiante":

                    Campo2 = "cod_est";
                    consutaBD(Campo2, txtSql, Tabla_cursos);

                    break;
                case "Código del Curso":

                    Campo2 = "codigo_cur";
                    consutaBD(Campo2, txtSql, Tabla_cursos);
                    break;
                     case "Año":

                    Campo2 = "anio";
                    consutaBD(Campo2, txtSql, Tabla_cursos);
                    break;
            }
        }
         if (indicador == 1) {

            String Campo = cbox_buscar.getSelectedItem().toString();
            String txtSql = txt_buscar.getText().toString();

            String Campo2 = null;
            switch (Campo) {
                //Buscar Por.., Código, Nombre, Apellido
                case "Buscar Por..":
//Buscar Por.., Código, Código del Estudiante, Código del Curso
                    break;
                case "Código":

                    Campo2 = "cod_sem_est";
                    consutaBD(Campo2, txtSql, Tabla_Seminarios);

                    break;
                case "Código del Estudiante":

                    Campo2 = "cod_est";
                    consutaBD(Campo2, txtSql, Tabla_Seminarios);

                    break;
                case "Código del Seminario":

                    Campo2 = "codigo_sem";
                    consutaBD(Campo2, txtSql, Tabla_Seminarios);
                    break;
                     case "Año":

                    Campo2 = "anio";
                    consutaBD(Campo2, txtSql, Tabla_Seminarios);
                    break;
            }
        }
if (indicador == 2) {

            String Campo = cbox_buscar.getSelectedItem().toString();
            String txtSql = txt_buscar.getText().toString();

            String Campo2 = null;
            switch (Campo) {
                //Buscar Por.., Código, Nombre, Apellido
                case "Buscar Por..":
//Buscar Por.., Código, Código del Estudiante, Código del Curso
                    break;
                case "Código":

                    Campo2 = "cod_con_est";
                    consutaBD(Campo2, txtSql, Tabla_Congresos);

                    break;
                case "Código del Estudiante":

                    Campo2 = "cod_est";
                    consutaBD(Campo2, txtSql, Tabla_Congresos);

                    break;
                case "Código del Congreso":

                    Campo2 = "codigo_con";
                    consutaBD(Campo2, txtSql, Tabla_Congresos);
                    break;
                     case "Año":

                    Campo2 = "Anio";
                    consutaBD(Campo2, txtSql, Tabla_Congresos);
                    break;
            }
        }

if (indicador == 3) {

            String Campo = cbox_buscar.getSelectedItem().toString();
            String txtSql = txt_buscar.getText().toString();

            String Campo2 = null;
            switch (Campo) {
                //Buscar Por.., Código, Nombre, Apellido
                case "Buscar Por..":
//Buscar Por.., Código, Código del Estudiante, Código del Curso
                    break;
                case "Código":

                    Campo2 = "cod_lic_est";
                    consutaBD(Campo2, txtSql, Tabla_Licencias);

                    break;
                case "Código del Estudiante":

                    Campo2 = "cod_est";
                    consutaBD(Campo2, txtSql, Tabla_Licencias);

                    break;
                case "Código de la Licencia":

                    Campo2 = "cod_lic";
                    consutaBD(Campo2, txtSql, Tabla_Licencias);
                    break;
                     
            }
        }

    }//GEN-LAST:event_txt_buscarKeyReleased

    private void cbox_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_buscarActionPerformed
        // TODO add your handling code here:
        if(indicador==0){
        String Campo = cbox_buscar.getSelectedItem().toString();
        switch (Campo) {
            //Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":

                txt_buscar.setEnabled(false);
                consutarTabla_General(Tabla_cursos);
                btn_True_false();
                vaciar_cajas();
                break;
            case "Código":
                txt_buscar.setEnabled(true);

                nuevo();

                break;
            case "Código del Estudiante":
                txt_buscar.setEnabled(true);
                nuevo();

                break;
            case "Código del Curso":
                txt_buscar.setEnabled(true);
                nuevo();
                break;
                 case "Año":
                txt_buscar.setEnabled(true);
                nuevo();
                break;
        }
                      }
        if(indicador==1){
             String Campo = cbox_buscar.getSelectedItem().toString();
        switch (Campo) {
            //Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":

                txt_buscar.setEnabled(false);
                consutarTabla_General(Tabla_cursos);
                btn_True_false();
                vaciar_cajas();
                break;
            case "Código":
                txt_buscar.setEnabled(true);

                nuevo();

                break;
            case "Código del Estudiante":
                txt_buscar.setEnabled(true);
                nuevo();

                break;
            case "Código del Seminario":
                txt_buscar.setEnabled(true);
                nuevo();
                break;
                 case "Año":
                txt_buscar.setEnabled(true);
                nuevo();
                break;
        }
        }
        
        if(indicador==2){
             String Campo = cbox_buscar.getSelectedItem().toString();
        switch (Campo) {
            //Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":

                txt_buscar.setEnabled(false);
                consutarTabla_General(Tabla_cursos);
                btn_True_false();
                vaciar_cajas();
                break;
            case "Código":
                txt_buscar.setEnabled(true);

                nuevo();

                break;
            case "Código del Estudiante":
                txt_buscar.setEnabled(true);
                nuevo();

                break;
            case "Código del Congreso":
                txt_buscar.setEnabled(true);
                nuevo();
                break;
                 case "Año":
                txt_buscar.setEnabled(true);
                nuevo();
                break;
        }
        }
         if(indicador==3){
             String Campo = cbox_buscar.getSelectedItem().toString();
        switch (Campo) {
            //Buscar Por.., Código, Nombre, Apellido
            case "Buscar Por..":

                txt_buscar.setEnabled(false);
                consutarTabla_General(Tabla_cursos);
                btn_True_false();
                vaciar_cajas();
                break;
            case "Código":
                txt_buscar.setEnabled(true);

                nuevo();

                break;
            case "Código del Estudiante":
                txt_buscar.setEnabled(true);
                nuevo();

                break;
            case "Código de la Licencia":
                txt_buscar.setEnabled(true);
                nuevo();
                break;
                
        }
        }
        
        
        
        

    }//GEN-LAST:event_cbox_buscarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if (indicador == 0) {
            String Campo = cbox_buscar.getSelectedItem().toString();
            String Campo2 = null;
            String txtSql = txt_buscar.getText().toString();
            switch (Campo) {
                //Buscar Por.., Código, Nombre, Apellido
                case "Buscar Por..":
//Código
//Código del estudiante
//Código del periodo académico
                    txt_buscar.setEnabled(false);
                    consutarTabla_General(Tabla_cursos);

                    btn_True_false();
                    vaciar_cajas();
                    nuevo();
                    break;
                case "Código":
                    Campo2 = "cod_cur_est";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_cursos);

                    txt_buscar.setEnabled(true);

                    break;
                case "Código del Estudiante":

                    Campo2 = "cod_est";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_cursos);

                    txt_buscar.setEnabled(true);

                    break;
                case "Código del Curso":

                    Campo2 = "codigo_cur";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_cursos);

                    txt_buscar.setEnabled(true);

                    break;
                     case "Año":

                    Campo2 = "anio";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_cursos);

                    txt_buscar.setEnabled(true);

                    break;
            }
        }
if (indicador == 1) {
            String Campo = cbox_buscar.getSelectedItem().toString();
            String Campo2 = null;
            String txtSql = txt_buscar.getText().toString();
            switch (Campo) {
                //Buscar Por.., Código, Nombre, Apellido
                case "Buscar Por..":
//Código
//Código del estudiante
//Código del periodo académico
                    txt_buscar.setEnabled(false);
                    consutarTabla_General(Tabla_Seminarios);

                    btn_True_false();
                    vaciar_cajas();
                    nuevo();
                    break;
                case "Código":
                    Campo2 = "cod_sem_est";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Seminarios);

                    txt_buscar.setEnabled(true);

                    break;
                case "Código del Estudiante":

                    Campo2 = "cod_est";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Seminarios);

                    txt_buscar.setEnabled(true);

                    break;
                case "Código del Seminario":

                    Campo2 = "codigo_sem";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Seminarios);

                    txt_buscar.setEnabled(true);

                    break;
                    case "Año":

                    Campo2 = "anio";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Seminarios);

                    txt_buscar.setEnabled(true);

                    break;
            }
        }
            if (indicador == 2) {
            String Campo = cbox_buscar.getSelectedItem().toString();
            String Campo2 = null;
            String txtSql = txt_buscar.getText().toString();
            switch (Campo) {
                //Buscar Por.., Código, Nombre, Apellido
                case "Buscar Por..":
//Código
//Código del estudiante
//Código del periodo académico
                    txt_buscar.setEnabled(false);
                    consutarTabla_General(Tabla_Congresos);

                    btn_True_false();
                    vaciar_cajas();
                    nuevo();
                    break;
                case "Código":
                    Campo2 = "cod_con_est";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Congresos);

                    txt_buscar.setEnabled(true);

                    break;
                case "Código del Estudiante":

                    Campo2 = "cod_est";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Congresos);

                    txt_buscar.setEnabled(true);

                    break;
                case "Código del Congreso":

                    Campo2 = "codigo_con";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Congresos);

                    txt_buscar.setEnabled(true);

                    break;
                    case "Año":

                    Campo2 = "Anio";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Congresos);

                    txt_buscar.setEnabled(true);

                    break;
            }
        }
            
            
            if (indicador == 3) {
            String Campo = cbox_buscar.getSelectedItem().toString();
            String Campo2 = null;
            String txtSql = txt_buscar.getText().toString();
            switch (Campo) {
                //Buscar Por.., Código, Nombre, Apellido
                case "Buscar Por..":
//Código
//Código del estudiante
//Código del periodo académico
                    txt_buscar.setEnabled(false);
                    consutarTabla_General(Tabla_Licencias);

                    btn_True_false();
                    vaciar_cajas();
                    nuevo();
                    break;
                case "Código":
                    Campo2 = "cod_lic_est";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Licencias);

                    txt_buscar.setEnabled(true);

                    break;
                case "Código del Estudiante":

                    Campo2 = "cod_est";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Licencias);

                    txt_buscar.setEnabled(true);

                    break;
                case "Código de la Licencia":

                    Campo2 = "cod_lic";
                    consutaBD_sinfiltros(Campo2, txtSql, Tabla_Licencias);

                    txt_buscar.setEnabled(true);

                    break;
                   

                   
            }
        } 
            
            

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void Tabla_cursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_cursosMouseClicked
        try {
            // TODO add your handling code here:

            int fila = Tabla_cursos.getSelectedRow();

            if (fila > -1) {
                //  Txt_Codigo.setText(Integer.toString(fila));
                txt_codigo_cur.setText(Tabla_cursos.getValueAt(fila, 0).toString());
                txt_cod_Curso.setText(Tabla_cursos.getValueAt(fila, 1).toString());
                txt_cod_estudiante_cur.setText(Tabla_cursos.getValueAt(fila, 2).toString());

            }

        } catch (Exception ex) {
            // Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            alerta("Error", "No a seleccionado la opcion Nuevo" + ex, "/Img_alertas/Error_100px.png");
        }

    }//GEN-LAST:event_Tabla_cursosMouseClicked

    private void btn_cod_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cod_curActionPerformed
        // TODO add your handling code here:
        Busqueda bs = new Busqueda();

        bs.setVisible(true);
        bs.Entidad = "estudiante";
    }//GEN-LAST:event_btn_cod_curActionPerformed

    private void btn_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curActionPerformed
        // TODO add your handling code here:
        Busqueda bs = new Busqueda();

        bs.setVisible(true);
        bs.Entidad = "cursos";
    }//GEN-LAST:event_btn_curActionPerformed

    private void tabbledPaneGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbledPaneGeneralMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabbledPaneGeneralMouseClicked

    private void txt_cod_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_semActionPerformed

    private void txt_cod_semKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_semKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_semKeyTyped

    private void btn_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_semActionPerformed
        // TODO add your handling code here:
         Busqueda bs = new Busqueda();

        bs.setVisible(true);
        bs.Entidad = "seminarios";
    }//GEN-LAST:event_btn_semActionPerformed

    private void btn_cod_est_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cod_est_semActionPerformed
        // TODO add your handling code here:
        Busqueda bs = new Busqueda();

        bs.setVisible(true);
        bs.Entidad = "estudiante";
    }//GEN-LAST:event_btn_cod_est_semActionPerformed

    private void txt_cod_estudiante_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_estudiante_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_estudiante_semActionPerformed

    private void txt_cod_estudiante_semKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_estudiante_semKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_estudiante_semKeyTyped

    private void btn_guardar_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_semActionPerformed
        // TODO add your handling code here:
        
         try {

            String codigo = txt_codigo_sem.getText().toString();
            String cod_estudiante = txt_cod_estudiante_sem.getText().toString();
            String cod_seminario= txt_cod_sem.getText().toString();
            int anio = 2017;
            anio = year_sem.getYear();

            int status = 2;

            try {
                if (codigo !="") {
                    PreparedStatement pst;
                    pst = cn.prepareStatement("INSERT INTO `seminarios_estudiante`(`cod_sem_est`, `codigo_sem`, `cod_est`, `Anio`) VALUES (?,?,?,?)");

                    pst.setString(1, codigo);
                    pst.setString(2, cod_seminario);
                    pst.setString(3, cod_estudiante);
                    pst.setInt(4, anio);
                    pst.executeUpdate();

                    alerta("Notificación", "Datos Guardados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
                    consutarTabla_General(Tabla_Seminarios);
                    btn_True_false();
                    vaciar_cajas();

                } else {
                    alerta("Error", "Campo de la clave oblicagatorio", "/Img_alertas/satisfactoriamente_100px.png");
                    txt_codigo_cur.setFocusable(true);

                }
                //           JOptionPane.showMessageDialog(null, "se guardo el datos " + Tabla_dis.getValueAt(i, 0).toString() + " y " + Tabla_dis.getValueAt(i, 1).toString());
            } catch (SQLException ex) {

                alerta("Error", "No se pudo guardar  Faltan campos" + ex, "/Img_alertas/Error_100px.png");

                Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception ex) {

            alerta("Error", "Faltan Campos de LLenar " + ex, "/Img_alertas/Error_100px.png");

            txt_codigo_cur.requestFocus();

        }
        
    }//GEN-LAST:event_btn_guardar_semActionPerformed

    private void btn_nuevo_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_semActionPerformed
        // TODO add your handling code here:
         nuevo();
    }//GEN-LAST:event_btn_nuevo_semActionPerformed

    private void btn_actualizar_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_semActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int res = confirmar("Alerta", "Seguro que desea actualizar este campo? ", "/Img_alertas/Error_100px.png");

        if (res == 1) {

            String codigo = txt_codigo_sem.getText().toString();
            String cod_estudiante = txt_cod_estudiante_sem.getText().toString();
            String cod_seminario = txt_cod_sem.getText().toString();
            int anio = 2017;
            anio = year_sem.getYear();

            //alerta("Notificacion", "Datos Guardados exitosamente" , "/Img_alertas/satisfactoriamente_.png");
            try {

                PreparedStatement pst = cn.prepareStatement("UPDATE `seminarios_estudiante` SET `codigo_sem`=?,`cod_est`=?,`Anio`=? WHERE seminarios_estudiante.cod_sem_est='" + codigo + "'");

                pst.setString(1, cod_seminario);
                pst.setString(2, cod_estudiante);

                pst.setInt(3, anio);

                pst.executeUpdate();
                alerta("Notificación", "Datos se actualizaron exitosamente ", "/Img_alertas/satisfactoriamente_100px.png");

            } catch (SQLException e) {
                // JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LOS DATOS" + e.getMessage());
                alerta("Error", "No se pudo actualizar los datos " + e, "/Img_alertas/Error_100px.png");
            }

            consutarTabla_General(Tabla_Seminarios);
            btn_True_false();
            vaciar_cajas();

        } else {
            alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
        }
        
        
    }//GEN-LAST:event_btn_actualizar_semActionPerformed

    private void btn_eliminar_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_semActionPerformed
        // TODO add your handling code here:
          try {

            int res = confirmar("Alerta", "Seguro que desea eliminar este campo ", "/Img_alertas/Error_100px.png");

            if (res == 1) {

                // TODO add your handling code here:
                String codigo = txt_codigo_sem.getText().toString();
                PreparedStatement pst;
                pst = cn.prepareStatement("DELETE FROM `seminarios_estudiante` WHERE seminarios_estudiante.cod_sem_est=?");
                pst.setString(1, codigo);
                pst.executeUpdate();
                alerta("Notificación", "Datos eliminados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
            } else {
                alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
            }

        } catch (SQLException ex) {
            alerta("Error", "No se elimino los datos " + ex, "/Img_alertas/Error_100px.png");
        }
        consutarTabla_General(Tabla_Seminarios);
        btn_True_false();
        vaciar_cajas();
        
    }//GEN-LAST:event_btn_eliminar_semActionPerformed

    private void btn_reportes_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportes_semActionPerformed
        // TODO add your handling code here:
        try {
          Menu_RInscripciones_General mi= new Menu_RInscripciones_General(null, true);
         
          rojerusan.RSComboMetro  combo=mi.cbox_OPCIONES;  
          String enti="seminarios";
            consultar_Combo(combo, enti);
            mi.codigo_general=0;
            mi.txt_TITULO_CORRESPONDE.setText("SEMINARIOS");
                mi.setVisible(true);     
                    
        } catch (Exception e) {
             alerta("Error", "A ocurrido un error al tratar de generar el reporte: " + e, "/Img_alertas/Error_100px.png");
        }
    }//GEN-LAST:event_btn_reportes_semActionPerformed

    private void btn_refrescar_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescar_semActionPerformed
        // TODO add your handling code here:
      consutarTabla_General(Tabla_Seminarios);
        control_botones();
        vaciar_cajas();
        txt_buscar.setText("");
        cbox_buscar.setSelectedIndex(0);
    }//GEN-LAST:event_btn_refrescar_semActionPerformed

    private void Tabla_SeminariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_SeminariosMouseClicked
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:

            int fila = Tabla_Seminarios.getSelectedRow();

            if (fila > -1) {
                //  Txt_Codigo.setText(Integer.toString(fila));
                txt_codigo_sem.setText(Tabla_Seminarios.getValueAt(fila, 0).toString());
                txt_cod_sem.setText(Tabla_Seminarios.getValueAt(fila, 1).toString());
                txt_cod_estudiante_sem.setText(Tabla_Seminarios.getValueAt(fila, 2).toString());

            }

        } catch (Exception ex) {
            // Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            alerta("Error", "No a seleccionado la opcion Nuevo" + ex, "/Img_alertas/Error_100px.png");
        }
    }//GEN-LAST:event_Tabla_SeminariosMouseClicked

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void txt_cod_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_conActionPerformed

    private void txt_cod_conKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_conKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_conKeyTyped

    private void txt_cod_estudiante_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_estudiante_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_estudiante_conActionPerformed

    private void txt_cod_estudiante_conKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_estudiante_conKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_estudiante_conKeyTyped

    private void btn_guardar_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_conActionPerformed
        // TODO add your handling code here:
          try {

            String codigo = txt_codigo_con.getText().toString();
            String cod_estudiante = txt_cod_estudiante_con.getText().toString();
            String cod_congreso= txt_cod_con.getText().toString();
            int anio = 2017;
            anio = year_con.getYear();

            int status = 2;

            try {
                if (codigo !="") {
                    PreparedStatement pst;
                    pst = cn.prepareStatement("INSERT INTO `estudiante_congresos`(`cod_con_est`, `codigo_con`, `cod_est`, `Anio`) VALUES (?,?,?,?)");

                    pst.setString(1, codigo);
                    pst.setString(2, cod_congreso);
                    pst.setString(3, cod_estudiante);
                    pst.setInt(4, anio);
                    pst.executeUpdate();

                    alerta("Notificación", "Datos Guardados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
                    consutarTabla_General(Tabla_Congresos);
                    btn_True_false();
                    vaciar_cajas();

                } else {
                    alerta("Error", "Campo de la clave oblicagatorio", "/Img_alertas/satisfactoriamente_100px.png");
                    txt_codigo_cur.setFocusable(true);

                }
                //           JOptionPane.showMessageDialog(null, "se guardo el datos " + Tabla_dis.getValueAt(i, 0).toString() + " y " + Tabla_dis.getValueAt(i, 1).toString());
            } catch (SQLException ex) {

                alerta("Error", "No se pudo guardar  Faltan campos" + ex, "/Img_alertas/Error_100px.png");

                Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception ex) {

            alerta("Error", "Faltan Campos de LLenar " + ex, "/Img_alertas/Error_100px.png");

            txt_codigo_cur.requestFocus();

        } 
    }//GEN-LAST:event_btn_guardar_conActionPerformed

    private void btn_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conActionPerformed
        // TODO add your handling code here:
        Busqueda bs = new Busqueda();

        bs.setVisible(true);
        bs.Entidad = "congresos";
    }//GEN-LAST:event_btn_conActionPerformed

    private void btn_cod_est_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cod_est_conActionPerformed
        // TODO add your handling code here:
         Busqueda bs = new Busqueda();

        bs.setVisible(true);
        bs.Entidad = "estudiante";
    }//GEN-LAST:event_btn_cod_est_conActionPerformed

    private void btn_nuevo_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_conActionPerformed
nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_conActionPerformed

    private void Tabla_CongresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_CongresosMouseClicked
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:

            int fila = Tabla_Congresos.getSelectedRow();

            if (fila > -1) {
                //  Txt_Codigo.setText(Integer.toString(fila));
                txt_codigo_con.setText(Tabla_Congresos.getValueAt(fila, 0).toString());
                txt_cod_con.setText(Tabla_Congresos.getValueAt(fila, 1).toString());
                txt_cod_estudiante_con.setText(Tabla_Congresos.getValueAt(fila, 2).toString());
                year_con.setYear(Integer.parseInt(Tabla_Congresos.getValueAt(fila, 3).toString()));
            }

        } catch (Exception ex) {
            // Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            alerta("Error", "No a seleccionado la opcion Nuevo" + ex, "/Img_alertas/Error_100px.png");
        }
    }//GEN-LAST:event_Tabla_CongresosMouseClicked

    private void btn_actualizar_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_conActionPerformed
        // TODO add your handling code here:
         int res = confirmar("Alerta", "Seguro que desea actualizar este campo? ", "/Img_alertas/Error_100px.png");

        if (res == 1) {

            String codigo = txt_codigo_con.getText().toString();
            String cod_estudiante = txt_cod_estudiante_con.getText().toString();
            String cod_congreso = txt_cod_con.getText().toString();
            int anio = 2017;
            anio = year_con.getYear();

            //alerta("Notificacion", "Datos Guardados exitosamente" , "/Img_alertas/satisfactoriamente_.png");
            try {

                PreparedStatement pst = cn.prepareStatement("UPDATE `estudiante_congresos` SET `codigo_con`=?,`cod_est`=?,`Anio`=? WHERE estudiante_congresos.cod_con_est='" + codigo + "'");

                pst.setString(1, cod_congreso);
                pst.setString(2, cod_estudiante);

                pst.setInt(3, anio);

                pst.executeUpdate();
                alerta("Notificación", "Datos se actualizaron exitosamente ", "/Img_alertas/satisfactoriamente_100px.png");

            } catch (SQLException e) {
                // JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LOS DATOS" + e.getMessage());
                alerta("Error", "No se pudo actualizar los datos " + e, "/Img_alertas/Error_100px.png");
            }

            consutarTabla_General(Tabla_Congresos);
            btn_True_false();
            vaciar_cajas();

        } else {
            alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
        }
    }//GEN-LAST:event_btn_actualizar_conActionPerformed

    private void btn_eliminar_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_conActionPerformed
        // TODO add your handling code here:
          try {

            int res = confirmar("Alerta", "Seguro que desea eliminar este campo ", "/Img_alertas/Error_100px.png");

            if (res == 1) {

                // TODO add your handling code here:
                String codigo = txt_codigo_con.getText().toString();
                PreparedStatement pst;
                pst = cn.prepareStatement("DELETE FROM `estudiante_congresos` WHERE estudiante_congresos.cod_con_est=?");
                pst.setString(1, codigo);
                pst.executeUpdate();
                alerta("Notificación", "Datos eliminados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
            } else {
                alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
            }

        } catch (SQLException ex) {
            alerta("Error", "No se elimino los datos " + ex, "/Img_alertas/Error_100px.png");
        }
        consutarTabla_General(Tabla_Congresos);
        btn_True_false();
        vaciar_cajas();
        
    }//GEN-LAST:event_btn_eliminar_conActionPerformed

    private void btn_reportes_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportes_conActionPerformed
        // TODO add your handling code here:
         try {
          Menu_RInscripciones_General mi= new Menu_RInscripciones_General(null, true);
         
          rojerusan.RSComboMetro  combo=mi.cbox_OPCIONES;  
          String enti="congresos";
            consultar_Combo(combo, enti);
            mi.codigo_general=0;
            mi.txt_TITULO_CORRESPONDE.setText("CONGRESOS");
                mi.setVisible(true);     
                    
        } catch (Exception e) {
             alerta("Error", "A ocurrido un error al tratar de generar el reporte: " + e, "/Img_alertas/Error_100px.png");
        }
    }//GEN-LAST:event_btn_reportes_conActionPerformed

    private void btn_refrescar_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescar_conActionPerformed
        // TODO add your handling code here:
        consutarTabla_General(Tabla_Congresos);
        control_botones();
        vaciar_cajas();
        txt_buscar.setText("");
        cbox_buscar.setSelectedIndex(0);
    }//GEN-LAST:event_btn_refrescar_conActionPerformed

    private void txt_cod_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_licActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_licActionPerformed

    private void txt_cod_licKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_licKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_licKeyTyped

    private void btn_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_licActionPerformed
 Busqueda bs = new Busqueda();

        bs.setVisible(true);
        bs.Entidad = "licencias";        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_licActionPerformed

    private void btn_cod_est_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cod_est_licActionPerformed
        // TODO add your handling code here:
         Busqueda bs = new Busqueda();

        bs.setVisible(true);
        bs.Entidad = "estudiante";
    }//GEN-LAST:event_btn_cod_est_licActionPerformed

    private void txt_cod_estudiante_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_estudiante_licActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_estudiante_licActionPerformed

    private void txt_cod_estudiante_licKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_estudiante_licKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_estudiante_licKeyTyped

    private void btn_guardar_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_licActionPerformed
        // TODO add your handling code here:
         try {

            String codigo = txt_codigo_lic.getText().toString();
            String cod_estudiante = txt_cod_estudiante_lic.getText().toString();
            String cod_licencia= txt_cod_lic.getText().toString();
         

            int status = 2;

            try {
                if (codigo !="") {
                    PreparedStatement pst;
                    pst = cn.prepareStatement("INSERT INTO `estudiante_licencias`(`cod_lic_est`, `cod_lic`, `cod_est`) VALUES (?,?,?)");

                    pst.setString(1, codigo);
                    pst.setString(2, cod_licencia);
                    pst.setString(3, cod_estudiante);
                  
                    pst.executeUpdate();

                    alerta("Notificación", "Datos Guardados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
                    consutarTabla_General(Tabla_Licencias);
                    btn_True_false();
                    vaciar_cajas();

                } else {
                    alerta("Error", "Campo de la clave oblicagatorio", "/Img_alertas/satisfactoriamente_100px.png");
                    txt_codigo_cur.setFocusable(true);

                }
                //           JOptionPane.showMessageDialog(null, "se guardo el datos " + Tabla_dis.getValueAt(i, 0).toString() + " y " + Tabla_dis.getValueAt(i, 1).toString());
            } catch (SQLException ex) {

                alerta("Error", "No se pudo guardar  Faltan campos" + ex, "/Img_alertas/Error_100px.png");

                Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception ex) {

            alerta("Error", "Faltan Campos de LLenar " + ex, "/Img_alertas/Error_100px.png");

            txt_codigo_cur.requestFocus();

        } 
    }//GEN-LAST:event_btn_guardar_licActionPerformed

    private void btn_nuevo_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_licActionPerformed
        // TODO add your handling code here:
        nuevo();
        
        
    }//GEN-LAST:event_btn_nuevo_licActionPerformed

    private void Tabla_LicenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_LicenciasMouseClicked
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:

            int fila = Tabla_Licencias.getSelectedRow();

            if (fila > -1) {
                //  Txt_Codigo.setText(Integer.toString(fila));
                txt_codigo_lic.setText(Tabla_Licencias.getValueAt(fila, 0).toString());
                txt_cod_lic.setText(Tabla_Licencias.getValueAt(fila, 1).toString());
                txt_cod_estudiante_lic.setText(Tabla_Licencias.getValueAt(fila, 2).toString());
               
            }

        } catch (Exception ex) {
            // Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
            alerta("Error", "No a seleccionado la opcion Nuevo" + ex, "/Img_alertas/Error_100px.png");
        }
    }//GEN-LAST:event_Tabla_LicenciasMouseClicked

    private void btn_actualizar_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_licActionPerformed
        // TODO add your handling code here:
         int res = confirmar("Alerta", "Seguro que desea actualizar este campo? ", "/Img_alertas/Error_100px.png");

        if (res == 1) {

            String codigo = txt_codigo_lic.getText().toString();
            String cod_estudiante = txt_cod_estudiante_lic.getText().toString();
            String cod_licencia = txt_cod_lic.getText().toString();
           
          

            //alerta("Notificacion", "Datos Guardados exitosamente" , "/Img_alertas/satisfactoriamente_.png");
            try {

                PreparedStatement pst = cn.prepareStatement("UPDATE `estudiante_licencias` SET `cod_lic`=?,`cod_est`=?WHERE estudiante_licencias.cod_lic_est='" + codigo + "'");

                pst.setString(1, cod_licencia);
                pst.setString(2, cod_estudiante);


                pst.executeUpdate();
                alerta("Notificación", "Datos se actualizaron exitosamente ", "/Img_alertas/satisfactoriamente_100px.png");

            } catch (SQLException e) {
                // JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LOS DATOS" + e.getMessage());
                alerta("Error", "No se pudo actualizar los datos " + e, "/Img_alertas/Error_100px.png");
            }

            consutarTabla_General(Tabla_Licencias);
            btn_True_false();
            vaciar_cajas();

        } else {
            alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
        }
    }//GEN-LAST:event_btn_actualizar_licActionPerformed

    private void btn_eliminar_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_licActionPerformed
        // TODO add your handling code here:
         try {

            int res = confirmar("Alerta", "Seguro que desea eliminar este campo ", "/Img_alertas/Error_100px.png");

            if (res == 1) {

                // TODO add your handling code here:
                String codigo = txt_codigo_lic.getText().toString();
                PreparedStatement pst;
                pst = cn.prepareStatement("DELETE FROM `estudiante_licencias` WHERE estudiante_licencias.cod_lic_est=?");
                pst.setString(1, codigo);
                pst.executeUpdate();
                alerta("Notificación", "Datos eliminados exitosamente", "/Img_alertas/satisfactoriamente_100px.png");
            } else {
                alerta("Notificación", "Se cancelo la operación", "/Img_alertas/satisfactoriamente_100px.png");
            }

        } catch (SQLException ex) {
            alerta("Error", "No se elimino los datos " + ex, "/Img_alertas/Error_100px.png");
        }
        consutarTabla_General(Tabla_Licencias);
        btn_True_false();
        vaciar_cajas();
    }//GEN-LAST:event_btn_eliminar_licActionPerformed

    private void btn_reportes_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportes_licActionPerformed
        // TODO add your handling code here:
        try {
          Menu_RInscripciones_General mi= new Menu_RInscripciones_General(null, true);
         
          rojerusan.RSComboMetro  combo=mi.cbox_OPCIONES;  
          String enti="licencias";
            consultar_Combo(combo, enti);
            mi.codigo_general=0;
            mi.txt_TITULO_CORRESPONDE.setText("LICENCIAS");
                mi.setVisible(true);     
                    
        } catch (Exception e) {
             alerta("Error", "A ocurrido un error al tratar de generar el reporte: " + e, "/Img_alertas/Error_100px.png");
        }
        
    }//GEN-LAST:event_btn_reportes_licActionPerformed
public void consultar_Combo(rojerusan.RSComboMetro combo, String entidad) {

        try {
//            cbox_periodo_aca.removeAllItems();
//            cbox_periodo_aca.addItem("Periodo Académico:");
            Statement estado;
            String Nombre_per_aca = "";
            String codigo = "";

/// hacemos consulata sql
            estado = cn.createStatement();
            ResultSet resultado = estado.executeQuery("SELECT *FROM "+entidad);

            while (resultado.next()) {
                codigo = resultado.getString(1);
                Nombre_per_aca = resultado.getString(2);
                combo.addItem(codigo + "/" + Nombre_per_aca);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Calificaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void btn_refrescar_licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescar_licActionPerformed
        // TODO add your handling code here:
         consutarTabla_General(Tabla_Licencias);
        control_botones();
        vaciar_cajas();
        txt_buscar.setText("");
        cbox_buscar.setSelectedIndex(0);
    }//GEN-LAST:event_btn_refrescar_licActionPerformed

    public void consutarTabla_General(rojerusan.RSTableMetro tabla) {
        try {
            String consultaBD = "SELECT * FROM " + Entidad;
           // JOptionPane.showMessageDialog(docente_menu, consultaBD);
            javax.swing.JTable Tabla = tabla;
            // Enviamos los parametros para la consulta de la tabla
            //  conexion    consulta de la base de datos y el nombre de la tabla

            cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera_general);
        } catch (Exception e) {
            System.out.println("no se pudo consultar " + contraBD);
        }

    }

    public void consutaBD(String Campo, String txtSQL, rojerusan.RSTableMetro tabla) {

        //String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + "='" + txtSQL + "'";
        String consultaBD = "SELECT * FROM " + Entidad + " WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
        //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = tabla;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla

        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera_general);

    }

    public void consutaBD_sinfiltros(String Campo, String txtSQL, rojerusan.RSTableMetro tabla) {

        String consultaBD = "SELECT * FROM " + Entidad + " WHERE " + Campo + "='" + txtSQL + "'";
        // String consultaBD = "SELECT * FROM `docente` WHERE " + Campo + " LIKE '" + txtSQL + "_%'";
        //JOptionPane.showMessageDialog(null, consultaBD);
        javax.swing.JTable Tabla = tabla;
        // Enviamos los parametros para la consulta de la tabla
        //  conexion    consulta de la base de datos y el nombre de la tabla

        cone1.GetTabla_Sincabeseras_sql_bd(cn, consultaBD, Tabla, cabesera_general);

    }

    public void control_botones() {
        btn_guardar_cur.setEnabled(false);
        btn_nuevo_cur.setEnabled(true);
        btn_actualizar_cur.setEnabled(false);
        btn_eliminar_cur.setEnabled(false);
        btn_reportes_cur.setEnabled(true);
        btn_refrescar_cur.setEnabled(true);
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
        btn_nuevo_cur.setFocusPainted(false);
        btn_actualizar_cur.setFocusPainted(false);
        btn_eliminar_cur.setFocusPainted(false);
        btn_reportes_cur.setFocusPainted(false);
        btn_refrescar_cur.setFocusPainted(false);
        btn_guardar_cur.setFocusPainted(false);

    }

    private void vaciar_cajas() {
        txt_cod_estudiante_cur.setText("");
        txt_cod_Curso.setText("");
        txt_codigo_cur.setText("");
        
        //////////
        txt_cod_estudiante_sem.setText("");
        txt_cod_sem.setText("");
        txt_codigo_sem.setText("");
        
        
         txt_cod_estudiante_con.setText("");
        txt_cod_con.setText("");
        txt_codigo_con.setText("");
       
         txt_cod_estudiante_lic.setText("");
        txt_cod_lic.setText("");
        txt_codigo_lic.setText("");
        
        
        txt_buscar.setEnabled(false);
        
        txt_codigo_cur.setEnabled(false);
        Tabla_cursos.setEnabled(false);
        btn_cod_cur.setEnabled(false);
        btn_cur.setEnabled(false);
        year_cur.setEnabled(false);
        txt_cod_estudiante_cur.setEnabled(false);
        txt_cod_Curso.setEnabled(false);

        
        
        txt_codigo_sem.setEnabled(false);
        Tabla_Seminarios.setEnabled(false);
        btn_cod_est_sem.setEnabled(false);
        btn_sem.setEnabled(false);
        year_sem.setEnabled(false);
        txt_cod_estudiante_sem.setEnabled(false);
        txt_cod_sem.setEnabled(false);
        btn_guardar_sem.setEnabled(false);
        
         txt_codigo_con.setEnabled(false);
        Tabla_Congresos.setEnabled(false);
        btn_cod_est_con.setEnabled(false);
        btn_con.setEnabled(false);
        year_con.setEnabled(false);
        txt_cod_estudiante_con.setEnabled(false);
        txt_cod_con.setEnabled(false);
        btn_guardar_con.setEnabled(false);
        
        
        txt_codigo_lic.setEnabled(false);
        Tabla_Licencias.setEnabled(false);
        btn_cod_est_lic.setEnabled(false);
        btn_lic.setEnabled(false);     
        txt_cod_estudiante_lic.setEnabled(false);
        txt_cod_lic.setEnabled(false);
        btn_guardar_lic.setEnabled(false);
        
        
        
        
    }

    private void btn_True_false() {
        btn_guardar_cur.setEnabled(false);
        btn_nuevo_cur.setEnabled(true);
        btn_actualizar_cur.setEnabled(false);
        btn_eliminar_cur.setEnabled(false);
        btn_reportes_cur.setEnabled(true);
        btn_refrescar_cur.setEnabled(true);
        Tabla_cursos.setEnabled(false);
        
        btn_guardar_sem.setEnabled(false);
        btn_nuevo_sem.setEnabled(true);
        btn_actualizar_sem.setEnabled(false);
        btn_eliminar_sem.setEnabled(false);
        btn_reportes_sem.setEnabled(true);
        btn_refrescar_sem.setEnabled(true);
        Tabla_Seminarios.setEnabled(false);
        
        btn_guardar_con.setEnabled(false);
        btn_nuevo_con.setEnabled(true);
        btn_actualizar_con.setEnabled(false);
        btn_eliminar_con.setEnabled(false);
        btn_reportes_con.setEnabled(true);
        btn_refrescar_con.setEnabled(true);
        Tabla_Congresos.setEnabled(false);
        
        btn_guardar_lic.setEnabled(false);
        btn_nuevo_lic.setEnabled(true);
        btn_actualizar_lic.setEnabled(false);
        btn_eliminar_lic.setEnabled(false);
        btn_reportes_lic.setEnabled(true);
        btn_refrescar_lic.setEnabled(true);
        Tabla_Licencias.setEnabled(false);
        
        

    }

    private void nuevo() {
        btn_guardar_cur.setEnabled(true);
          txt_cod_estudiante_lic.setEnabled(true);
        txt_cod_lic.setEnabled(true);
        txt_codigo_lic.setEnabled(true);
        Tabla_Licencias.setEnabled(true);
        btn_cod_est_lic.setEnabled(true);
        btn_lic.setEnabled(true);
        btn_guardar_lic.setEnabled(true);
          btn_actualizar_lic.setEnabled(true);
        btn_eliminar_lic.setEnabled(true);
        btn_reportes_lic.setEnabled(true);
        btn_refrescar_lic.setEnabled(true);
        
         txt_cod_estudiante_con.setEnabled(true);
        txt_cod_con.setEnabled(true);
        year_con.setEnabled(true);
        txt_codigo_con.setEnabled(true);
        Tabla_Congresos.setEnabled(true);
        btn_cod_est_con.setEnabled(true);
        btn_con.setEnabled(true);
        btn_guardar_con.setEnabled(true);
          btn_actualizar_con.setEnabled(true);
        btn_eliminar_con.setEnabled(true);
        btn_reportes_con.setEnabled(true);
        btn_refrescar_con.setEnabled(true);
        
        //btn_guardar_cur.setEnabled(true);
        btn_nuevo_cur.setEnabled(false);
        btn_actualizar_cur.setEnabled(true);
        btn_eliminar_cur.setEnabled(true);
        btn_reportes_cur.setEnabled(true);
        btn_refrescar_cur.setEnabled(true);

        txt_cod_estudiante_cur.setEnabled(true);
        txt_cod_Curso.setEnabled(true);
        year_cur.setEnabled(true);
        txt_codigo_cur.setEnabled(true);
        Tabla_cursos.setEnabled(true);
        btn_cod_cur.setEnabled(true);
        btn_cur.setEnabled(true);
       
        
         txt_cod_estudiante_sem.setEnabled(true);
        txt_cod_sem.setEnabled(true);
        year_sem.setEnabled(true);
        txt_codigo_sem.setEnabled(true);
        Tabla_Seminarios.setEnabled(true);
        btn_cod_est_sem.setEnabled(true);
        btn_sem.setEnabled(true);
        btn_guardar_sem.setEnabled(true);
          btn_actualizar_sem.setEnabled(true);
        btn_eliminar_sem.setEnabled(true);
        btn_reportes_sem.setEnabled(true);
        btn_refrescar_sem.setEnabled(true);
        
       
       
        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro Tabla_Congresos;
    private rojerusan.RSTableMetro Tabla_Licencias;
    private rojerusan.RSTableMetro Tabla_Seminarios;
    private rojerusan.RSTableMetro Tabla_cursos;
    private rojerusan.RSButtonMetro btn_actualizar_con;
    private rojerusan.RSButtonMetro btn_actualizar_cur;
    private rojerusan.RSButtonMetro btn_actualizar_lic;
    private rojerusan.RSButtonMetro btn_actualizar_sem;
    private rojerusan.RSButtonMetro btn_buscar;
    private rojerusan.RSButtonMetro btn_cod_cur;
    private rojerusan.RSButtonMetro btn_cod_est_con;
    private rojerusan.RSButtonMetro btn_cod_est_lic;
    private rojerusan.RSButtonMetro btn_cod_est_sem;
    private rojerusan.RSButtonMetro btn_con;
    private rojerusan.RSButtonMetro btn_cur;
    private rojerusan.RSButtonMetro btn_eliminar_con;
    private rojerusan.RSButtonMetro btn_eliminar_cur;
    private rojerusan.RSButtonMetro btn_eliminar_lic;
    private rojerusan.RSButtonMetro btn_eliminar_sem;
    private rojerusan.RSButtonMetro btn_guardar_con;
    private rojerusan.RSButtonMetro btn_guardar_cur;
    private rojerusan.RSButtonMetro btn_guardar_lic;
    private rojerusan.RSButtonMetro btn_guardar_sem;
    private rojerusan.RSButtonMetro btn_lic;
    private rojerusan.RSButtonMetro btn_nuevo_con;
    private rojerusan.RSButtonMetro btn_nuevo_cur;
    private rojerusan.RSButtonMetro btn_nuevo_lic;
    private rojerusan.RSButtonMetro btn_nuevo_sem;
    private rojerusan.RSButtonMetro btn_refrescar_con;
    private rojerusan.RSButtonMetro btn_refrescar_cur;
    private rojerusan.RSButtonMetro btn_refrescar_lic;
    private rojerusan.RSButtonMetro btn_refrescar_sem;
    private rojerusan.RSButtonMetro btn_reportes_con;
    private rojerusan.RSButtonMetro btn_reportes_cur;
    private rojerusan.RSButtonMetro btn_reportes_lic;
    private rojerusan.RSButtonMetro btn_reportes_sem;
    private rojerusan.RSButtonMetro btn_sem;
    private rojerusan.RSComboMetro cbox_buscar;
    private javax.swing.JScrollPane docente_menu;
    private javax.swing.JScrollPane docente_menu1;
    private javax.swing.JScrollPane docente_menu2;
    private javax.swing.JScrollPane docente_menu3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private org.matrix.BlackTabbedPane tabbledPaneGeneral;
    private rojerusan.RSMetroTextPlaceHolder txt_buscar;
    public rojerusan.RSMetroTextPlaceHolder txt_cod_Curso;
    public rojerusan.RSMetroTextPlaceHolder txt_cod_con;
    public rojerusan.RSMetroTextPlaceHolder txt_cod_estudiante_con;
    public rojerusan.RSMetroTextPlaceHolder txt_cod_estudiante_cur;
    public rojerusan.RSMetroTextPlaceHolder txt_cod_estudiante_lic;
    public rojerusan.RSMetroTextPlaceHolder txt_cod_estudiante_sem;
    public rojerusan.RSMetroTextPlaceHolder txt_cod_lic;
    public rojerusan.RSMetroTextPlaceHolder txt_cod_sem;
    private rojerusan.RSMetroTextPlaceHolder txt_codigo_con;
    private rojerusan.RSMetroTextPlaceHolder txt_codigo_cur;
    private rojerusan.RSMetroTextPlaceHolder txt_codigo_lic;
    private rojerusan.RSMetroTextPlaceHolder txt_codigo_sem;
    private rojeru_san.componentes.RSYearDate year_con;
    private rojeru_san.componentes.RSYearDate year_cur;
    private rojeru_san.componentes.RSYearDate year_sem;
    // End of variables declaration//GEN-END:variables
}
