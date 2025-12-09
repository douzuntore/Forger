package forger;


import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samuelzun
 */
public class ManejoDeMenus {
    
    // Obteniendo la resolucion de la pantalla
    private GraphicsEnvironment GE = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private GraphicsDevice monitor = GE.getDefaultScreenDevice();
    private GraphicsConfiguration monitorConfig = monitor.getDefaultConfiguration();
    private Rectangle resolucion = monitorConfig.getBounds();
    // ------
    
    public void displayJFrame (JFrame jframe) {
        
        jframe.setResizable(false);
        jframe.setSize(new Dimension(800,600));
        //menu.getContentPane().setBackground(Color.decode("#000000"));
        jframe.setLocation(
                resolucion.x + (resolucion.width/2) - (jframe.getSize().width/2),
                resolucion.y + (resolucion.height/2) - (jframe.getSize().height/2)
        );
        jframe.setVisible(true);
        
    }
    
    public void displayJFrame (JFrame jframe, JFrame esconder) {
        
        jframe.setResizable(false);
        jframe.setSize(new Dimension(800,600));
        //menu.getContentPane().setBackground(Color.decode("#000000"));
        jframe.setLocation(
                resolucion.x + (resolucion.width/2) - (jframe.getSize().width/2),
                resolucion.y + (resolucion.height/2) - (jframe.getSize().height/2)
        );
        esconder.dispose();
        jframe.setVisible(true);
        
    }
    
    public void agregarArmas (JTabbedPane tabbed, Arsenal armas) {
        
        for (int i = 0; i < armas.getArsenalDeArmas().size(); i++) {
            
            JPanel panelDeArma = new PanelDeArma(armas.getArsenalDeArmas().get(i));
            tabbed.add(panelDeArma);
            
        }
        
    }

    
    
}
