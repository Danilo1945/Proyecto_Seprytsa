/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vistas.Principal;

/**
 *
 * @author Danilo
 */
public class Main {
public  static Principal p= new Principal();
    /**
     * @param args the command line arguments
     */
// public  
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        p.setVisible(true);
        Reloj_fecha r=new Reloj_fecha();
   //    Tiepo_esperaUpdateTable t= new Tiepo_esperaUpdateTable();
       
    }
//     public void fijartimpo(int tiempo){
//          r.tiempo_updateTable=tiempo; 
//        }
     
}
