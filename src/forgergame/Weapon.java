/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forgergame;

/**
 *
 * @author samuelzun
 */
public class Weapon {
    
    private String name = "";
    private int damage;
    private int speed;
    private int defense;
    private int block;
    private String type;
    private String enchant;
    private String sprite;

    public Weapon() {
    }

    public Weapon(String name, int damage, int speed, int defense, int block) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
        this.defense = defense;
        this.block = block;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getBlock() {
        return block;
    }
    public void setBlock(int block) {
        this.block = block;
    }

    public Weapon(String name, int material, Grip grip, String enchantment, String type) {
        this.name = name;
        this.type = type;
        this.enchant = enchantment;
        int[] basestats = new int[4];
        switch (type) {
            case "Espada":
                basestats = new int[]{30,80,25,20};
                break;
            case "Arco":
                basestats = new int[]{25,60,15,30};
                break;
            case "Daga":
                basestats = new int[]{10,25,10,60};
                break;
            case "Escudo":
                basestats = new int[]{15,100,50,10};
                break;
            case "Maza":
                basestats = new int[]{40,100,10,10};
                break;
        }
        for (int i = 0; i < basestats.length; i++) {
            if (i != 1 && i != 3) {
                basestats[i] *= 1 + (material/2);
            } else if (i == 3) {
                basestats[i] += (material*5);
            }
        }
        this.damage = (basestats[0]+grip.getDmgAdd()) * grip.getDmgMult() / 100;
        this.speed = (basestats[1]+grip.getSpeedAdd()) * grip.getSpeedMult() / 100;
        this.defense = (basestats[2]+grip.getDefenseAdd()) * grip.getDefenseMult() / 100;
        this.block = basestats[3];
        
    }
    
    
    
}
