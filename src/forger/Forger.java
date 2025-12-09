package forger;

/**
 *
 * @author samuelzun
 */
import javax.swing.*;
import java.awt.*;

public class Forger {
    
    public static Arsenal arsenalArmas = new Arsenal();
    
    public static void main(String[] args) {
        
        arsenalArmas.getArsenalDeArmas().add(new Arma("Sword",10,10,0,0,0,0));
        
        new ManejoDeMenus().displayJFrame(new Menu());
        
        
        
        //new ManejoDeMenus().agregarArmas(tabbed, arsenalArmas);
        
    }
    
}
