/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Danilo
 */
public class Datos {
    
    String direccionBD = "jdbc:mysql://192.168.123.147:3307/seprytsa";
//    String direccionBD = "jdbc:mysql://192.168.123.147:3306/seprytsa";
    String usuarioBD = "root";
    String contraBD = "";
public Datos(){
    
}
    public String getDireccionBD() {
        return direccionBD;
    }

    public void setDireccionBD(String direccionBD) {
        this.direccionBD = direccionBD;
    }

    public String getUsuarioBD() {
        return usuarioBD;
    }

    public void setUsuarioBD(String usuarioBD) {
        this.usuarioBD = usuarioBD;
    }

    public String getContraBD() {
        return contraBD;
    }

    public void setContraBD(String contraBD) {
        this.contraBD = contraBD;
    }
}
