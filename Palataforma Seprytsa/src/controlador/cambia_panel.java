/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JPanel;

/**
 *
 * @author Danilo
 */
public class cambia_panel {

    public cambia_panel(JPanel panel_master, JPanel panel_a_cambiar) {

        panel_master.removeAll();
        panel_master.revalidate();
        panel_master.repaint();
        panel_master.setLayout(new java.awt.BorderLayout());
        panel_master.add(panel_a_cambiar);
        panel_master.revalidate();
        panel_master.validate();
        panel_master.repaint();

    }

}
