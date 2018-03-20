/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import vistas.Loguin;
import vistas.Logo_inicial;
/**
 *
 * @author Danilo
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
        Logo_inicial li= new Logo_inicial();
        li.setVisible(true);
           Thread.sleep(10000);
           li.dispose();
           
     Loguin log = new Loguin(null, true);
      log.setVisible(true);
      
      int estatus=log.Estatus();
        } catch (Exception e) {
        }
        
//  
    }
    
}
