/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forgergame;

/**
 *
 * @author samuelzun
 */
import java.util.ArrayList;

public class Data {
    
    public static ArrayList<Weapon> armas = new ArrayList();
    public static ArrayList<Grip> mangos = new ArrayList();
    public static ArrayList<String> materiales = new ArrayList();
    public static ArrayList<String> encantamientos = new ArrayList();
    public static Weapon[] equipado = new Weapon[2];
    
    private static final String[] MATERIALS = new String[]{
        "Madera",
        "Hierro"
    };
    
}
