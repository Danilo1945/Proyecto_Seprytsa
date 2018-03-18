
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class conectar {

    static void setText(String desconectar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String direccionBD;
    private String usuarioBD;
    private String contraBD;
    private String consultaBD;
    private javax.swing.JTable Tabla;
    private  Connection conectar=null;/// variable de tipo conexion

    public Connection conexion(String direccionBD, String usuarioBD, String contraBD) {
        this.direccionBD = direccionBD;
        this.usuarioBD = usuarioBD;
        this.contraBD = contraBD;
      
         try {
            Class.forName("com.mysql.jdbc.Driver");
          conectar=DriverManager.getConnection(this.direccionBD,this.usuarioBD,this.contraBD); 
           //JOptionPane.showMessageDialog(null,"Conexión exitosa");// mensaje de notificacion
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());// mensaje de notificacion
        }
        return conectar;
    }
    
  
    
    
    public void GetTablaApartir_SQL_BD(Connection coneccionBD, String consultaSQL_BD, javax.swing.JTable NombreTabla) {
       
        this.consultaBD = consultaSQL_BD;
        this.Tabla = NombreTabla;
        
         try {
           
          Statement stm = coneccionBD.createStatement();
        
         ResultSet rst= stm.executeQuery(this.consultaBD); // realiza la consulta base de datos
         
         ResultSetMetaData rsMd=rst.getMetaData();
         
         int num_columnas=rsMd.getColumnCount();
         
         DefaultTableModel modelo =new DefaultTableModel();// creamos un objeto de tipo tabla
          this.Tabla.setModel(modelo);// agregamos el objeto tabla a la tabla creada en diseñador
          
            for (int x = 1; x <= num_columnas; x++) {// or para agregar las cabezeras de la tabla
              modelo.addColumn(rsMd.getColumnLabel(x));// agregamos las cabezeras atrapadas
            }
          while (rst.next()){
              Object [] fila= new Object[num_columnas];// Recibe todo el objeto de tipo Cliente de la base de datos
              for (int y = 0; y < num_columnas; y++) {
                 fila[y]=rst.getObject(y+1);// agregamos al objeto los datos de cada fila obtenida
              }
              
              modelo.addRow(fila);
             
          }
          
          
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        
    }
    
    
    
    
  public void GetTabla_Sincabeseras_sql_bd(Connection coneccionBD, String consultaSQL_BD, javax.swing.JTable NombreTabla,String  cabesera[]){
      
    
       
        this.consultaBD = consultaSQL_BD;
        this.Tabla = NombreTabla;
        
         try {
           
          Statement stm = coneccionBD.createStatement();
        
         ResultSet rst= stm.executeQuery(this.consultaBD); // realiza la consulta base de datos
         
         ResultSetMetaData rsMd=rst.getMetaData();
         
         int num_columnas=rsMd.getColumnCount();
         
         DefaultTableModel modelo =new DefaultTableModel();// creamos un objeto de tipo tabla
          this.Tabla.setModel(modelo);// agregamos el objeto tabla a la tabla creada en diseñador
          
            for (int x = 0; x < cabesera.length; x++) {// or para agregar las cabezeras de la tabla
              modelo.addColumn( cabesera[x]);// agregamos las cabezeras atrapadas
              //rsMd.getColumnLabel(x)
            }
            
            
          while (rst.next()){
              Object [] fila= new Object[num_columnas];// Recibe todo el objeto de tipo Cliente de la base de datos
              for (int y = 0; y < num_columnas; y++) {
                 fila[y]=rst.getObject(y+1);// agregamos al objeto los datos de cada fila obtenida
              }
              
              modelo.addRow(fila);
             
          }
          
          
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        
    }
       
   
    
    
 
    
    
    
    
    
    
    
    
    
    
}
