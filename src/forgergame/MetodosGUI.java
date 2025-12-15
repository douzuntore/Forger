package forgergame;

/**
 *
 * @author samuelzun
 */
import javax.swing.*;
import java.awt.*;

public class MetodosGUI {
    
    public static void mostrarPanel(JPanel panel, JPanel parent) {
        
        //this.menuPanel.validate();
        //addMenu.
        panel.setSize(parent.getSize());
        panel.setLocation(0,0);
        parent.removeAll();
        //panel.setLayout(null);
        parent.add(panel, BorderLayout.CENTER);
        parent.revalidate();
        parent.repaint();
        
        
    }
    
    public static void mostrarPanelW(JPanel parent, JScrollPane scroll, JPanel prim, JPanel secun) {
        
        //panel.validate();
        
        int panelSize = parent.getPreferredSize().width/3;
        System.out.println(panelSize);
        parent.setPreferredSize(new Dimension(
                parent.getPreferredSize().width - scroll.getVerticalScrollBar().getPreferredSize().width,
                50+(50*((Data.armas.size()+1)/2))+(((Data.armas.size()+1)/2)*panelSize)
        ));
        
        parent.revalidate();
        
        parent.removeAll();
        
        for (int w = 0; w < Data.armas.size(); w++) {
            
            WeaponPanel panel = new WeaponPanel(Data.armas.get(w), w, prim, secun);
            
            panel.setSize(new Dimension(
                    panelSize,
                    panelSize
            ));
            
            panel.setLocation(
                    (parent.getPreferredSize().width*(1+((w%2)*2)))/4 - panel.getSize().width/2,
                    50+(50*(w/2))+((w/2)*panelSize)
            );

            System.out.println(prim.toString());
            System.out.println(secun.toString());

            parent.add(panel, BorderLayout.CENTER);

        }
        
        parent.revalidate();
        parent.repaint();
        
    }
    
    /*public static void resizeWeaponPanels(JPanel panel, JScrollPane scroll) {
        
        int panelSize = panel.getPreferredSize().width/3;
        System.out.println(panelSize);
        panel.setSize(
                panel.getPreferredSize().width,
                100+(100*((Data.armas.size()+1)/2))+(((Data.armas.size()+1)/2)*panelSize)
        );
        
        panel.revalidate();
        //panel.repaint();
        
    }*/
    
}
