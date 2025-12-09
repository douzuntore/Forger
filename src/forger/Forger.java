package forger;

/**
 *
 * @author samuelzun
 */
import javax.swing.*;
import java.awt.*;

public class Forger {
    
    public static void main(String[] args) {
        
        new ManejoDeMenus().displayJFrame(new Menu());
        
        Arsenal arsenalArmas = new Arsenal();
        
        //new ManejoDeMenus().agregarArmas(tabbed, arsenalArmas);
        
    }
    
}
