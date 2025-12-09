/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forger;

/**
 *
 * @author samuelzun
 */
public class Arma {
    
    private String name = "Placeholder";
    private int type; //0 - sword, 1 - bow, 2 - maze
    private int damage;
    private int speed;
    private int material;
    private int handle;
    private int quality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Arma() {
    }

    public Arma(String name, int type, int damage, int speed, int material, int handle, int quality) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.speed = speed;
        this.material = material;
        this.handle = handle;
        this.quality = quality;
    }
    
    
    
}
