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
    
    
    
}
