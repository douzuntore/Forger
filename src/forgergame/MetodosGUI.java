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
    
    public static void mostrarWeaponScrollPane(JPanel parent, JScrollPane scroll, JPanel prim, JPanel secun) {
        
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

            //System.out.println(prim.toString());
            //System.out.println(secun.toString());

            parent.add(panel, BorderLayout.CENTER);

        }
        
        parent.revalidate();
        parent.repaint();
        
    }
    
    public static void mostrarGripScrollPane(JPanel parent, JScrollPane scroll, Forjar forja) {
        
        int panelSize = 150;
        
        scroll.setPreferredSize(new Dimension(
                panelSize*4,
                panelSize + scroll.getHorizontalScrollBar().getPreferredSize().height
        ));
        
        //System.out.println(panelSize);
        parent.setPreferredSize(new Dimension(
                (10 * Data.mangos.size()) + panelSize * Data.mangos.size() + 10,
                panelSize
        ));
        
        for (int g = 0; g < Data.mangos.size(); g++) {
            
            GripPanel gPanel = new GripPanel(Data.mangos.get(g), g, forja);
            
            gPanel.setSize(new Dimension(
                    panelSize,
                    panelSize
            ));
            
            gPanel.setLocation(
                    10 + g * panelSize + (10 * g),
                    0
            );
            
            parent.add(gPanel, BorderLayout.CENTER);
            
        }
        
        parent.revalidate();
        parent.repaint();
        
    }
    
    public static void mostrarEnchantScrollPane(JPanel parent, JScrollPane scroll, Forjar forja) {
        
        int panelSize = 75;
        
        scroll.setPreferredSize(new Dimension(
                panelSize*6,
                panelSize + scroll.getHorizontalScrollBar().getPreferredSize().height
        ));
        
        //System.out.println(panelSize);
        parent.setPreferredSize(new Dimension(
                (5 * Data.mangos.size()) + panelSize * Data.mangos.size() + 5,
                panelSize
        ));
        
        for (int g = 0; g < Data.encantamientos.size(); g++) {
            
            EnchantPanel gPanel = new EnchantPanel(g, forja);
            
            gPanel.setSize(new Dimension(
                    panelSize,
                    panelSize
            ));
            
            gPanel.setLocation(
                    5 + g * panelSize + (5 * g),
                    0
            );
            
            parent.add(gPanel, BorderLayout.CENTER);
            
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
