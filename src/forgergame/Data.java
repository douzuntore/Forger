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
    
    public static int[] materiales = new int[4]; // Madera | Hierro | Topacio | Diamante
    
    public static ArrayList<String> encantamientos = new ArrayList();
    
    public static Weapon[] equipado = new Weapon[2];
    
    public static final String[] MATERIALS = new String[]{
        "Madera",
        "Hierro",
        "Topacio",
        "Diamante"
    };
    
    private static final String[] ENCHANTS = new String[]{
        "Crecimiento",//Global, x1.3 de daño
        "Enfoque",//Global, chance de hacer doble daño
        "Perforacion", //Espada, atraviesa la linea
        "Parry", //Espada, mas chance de bloqueo
        "Tiro tríple", //Arco, hit a toda la fila, reduce ligeramente el daño
        "Ricochet", //Arco, rebota entre enemigos, reduce daño por rebote
        "Doble ataque", //Daga, ataca a dos enemigos aleatoriamente
        "Tríple ataque", //Daga, ataca a dos enemigos aleatoriamente
        "Empuje",//Escudo, empuja el enemígo atacado hacia atras, reduce su daño
        "Acumulación",//Escudo, acumula energía para despues desatar un gran ataque
        "Impacto", //Maza, impacta una cruz
        "Giro", //Maza, impacta 5 veces una linea
    };

    public static int[] getMateriales() {
        return materiales;
    }
    public static void addMaterial (int mat) {
        if (mat >= materiales.length) {mat = materiales.length-1;}
        else if (mat < 0) {mat = 0;}
        materiales[mat]++;
    }
    
}
