/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;
import controlador.Main;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.io.File;
import java.security.Principal;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




import java.security.Principal;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import tabla.MyScrollbarUI;


/**
 *
 * @author Danilo
 */
public class Reportes {
    String direccionBD = "jdbc:mysql://localhost:3307/seprytsa";
    String usuarioBD = "root";
    String contraBD = "";
    // Instanciamos la clase conectar 
    modelo.conectar cone1 = new modelo.conectar();
    // realizamos la conexion
    Connection cn = cone1.conexion(direccionBD, usuarioBD, contraBD);
    public void REstudiante_general(){
          JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\EstudiantesGeneral.jasper";
        try {
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
            JasperPrint jprint = JasperFillManager.fillReport(path, null, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void REstudiante_Parametro(String codigo){
         JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\Estudiantes_individual.jasper";
         try {
           reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
           Map parametro= new HashMap();
                   parametro.put("codigo",codigo );
           
           JasperPrint jprint = JasperFillManager.fillReport(path, parametro, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        
         } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
        
    }
    
    
    
     public void RDocente_general(){
          JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\DocentesGeneral.jasper";
        try {
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
            JasperPrint jprint = JasperFillManager.fillReport(path, null, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void RDocente_Parametro(String codigo){
         JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\Docentes_individual.jasper";
         try {
           reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
           Map parametro= new HashMap();
                   parametro.put("cod",codigo );
           
           JasperPrint jprint = JasperFillManager.fillReport(path, parametro, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        
         } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
        
    }
    
    
     public void RHorarios_general(){
          JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\Horarios_general.jasper";
        try {
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
            JasperPrint jprint = JasperFillManager.fillReport(path, null, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
       public void RPeriodeo_aca_general(){
          JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\Periodos_ac_general.jasper";
        try {
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
            JasperPrint jprint = JasperFillManager.fillReport(path, null, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
            
            
            
      public void RDiplomados_general(){
          JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\Diplomados_general.jasper";
        try {
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
            JasperPrint jprint = JasperFillManager.fillReport(path, null, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }         
    
      
      
      
      
      
       public void RMatriculas_general(){
          JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\Matriculas_general.jasper";
        try {
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
            JasperPrint jprint = JasperFillManager.fillReport(path, null, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
      
      
      
      
      
       public void RMatriculas_Parametro(String pa,String dip,int hor,String pa_txt,String dip_txt,String dias,String Horas){
         JasperReport reporte; //Creo el objeto reporte
         // Ubicacion del Reporte
        String path = "src\\Reportes\\RMatriculas_por_filtros.jasper";
         try {
           reporte = (JasperReport) JRLoader.loadObjectFromFile(path); //Cargo el reporte al objeto
           Map parametro= new HashMap();
                   parametro.put("pa",pa );
                   parametro.put("hor", hor);
                   parametro.put("dip", dip);
                   parametro.put("Horas", Horas);
                    parametro.put("dias", dias);
                    parametro.put("dip_txt", dip_txt);
                    parametro.put("pa_txt",pa_txt);
           
           JasperPrint jprint = JasperFillManager.fillReport(path, parametro, cn); //Llenado del Reporte con Tres parametros ubicacion,parametros,conexion a la base de datos
            JasperViewer viewer = new JasperViewer(jprint,false); //Creamos la vista del Reporte
             viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
          
             viewer.setVisible(true); //Inicializamos la vista del Reporte
        
         } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
        
    }
              
              
              
              
              
              
              
              
              
              
      
      
      
      
      
      
      
      
      
}
