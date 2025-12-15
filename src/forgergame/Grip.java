/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forgergame;

/**
 *
 * @author samuelzun
 */
public class Grip {
    
    private String name;
    private int speedAdd;
    private int dmgAdd;
    private int defenseAdd;
    private int speedMult;
    private int dmgMult;
    private int defenseMult;
    private String sprite;

    public Grip() {
    }

    public Grip(String name, int speedAdd, int dmgAdd, int defenseAdd, int speedMult, int dmgMult, int defenseMult) {
        this.name = name;
        this.speedAdd = speedAdd;
        this.dmgAdd = dmgAdd;
        this.defenseAdd = defenseAdd;
        this.speedMult = speedMult;
        this.dmgMult = dmgMult;
        this.defenseMult = defenseMult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedAdd() {
        return speedAdd;
    }

    public void setSpeedAdd(int speedAdd) {
        this.speedAdd = speedAdd;
    }

    public int getDmgAdd() {
        return dmgAdd;
    }

    public void setDmgAdd(int dmgAdd) {
        this.dmgAdd = dmgAdd;
    }

    public int getDefenseAdd() {
        return defenseAdd;
    }

    public void setDefenseAdd(int defenseAdd) {
        this.defenseAdd = defenseAdd;
    }

    public int getSpeedMult() {
        return speedMult;
    }

    public void setSpeedMult(int speedMult) {
        this.speedMult = speedMult;
    }

    public int getDmgMult() {
        return dmgMult;
    }

    public void setDmgMult(int dmgMult) {
        this.dmgMult = dmgMult;
    }

    public int getDefenseMult() {
        return defenseMult;
    }

    public void setDefenseMult(int defenseMult) {
        this.defenseMult = defenseMult;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
    
    
    /*
    public String statString() {
        String str = "";
        
        if (this.dmgAdd == 0) {
            str += ""
                    + "DMG: +"+this.dmgAdd+"\n";
        } else if (this.dmgMult == 100) {
            str += ""
                    + "DMG: x"+this.dmgMult+"\n";
        }
        if (!(this.dmgAdd == 0 && this.dmgMult == 100)) {
            str += ""
                    + "DMG: +"+this.dmgAdd+", x"+this.dmgMult+"\n";
        }
        
        if (this.speedAdd == 0) {
            str += ""
                    + "SPD: +"+this.speedAdd+"\n";
        } else if (this.speedMult == 100) {
            str += ""
                    + "SPD: x"+this.speedMult+"\n";
        }
        if (!(this.speedAdd == 0 && this.speedMult == 100)) {
            str += ""
                    + "SPD: +"+this.speedAdd+", x"+this.speedMult+"\n";
        }
        
        if (this.defenseAdd == 0) {
            str += ""
                    + "Daño: +"+this.defenseAdd+"\n";
        } else if (this.defenseMult == 100) {
            str += ""
                    + "Daño: x"+this.defenseMult+"\n";
        }
        if (!(this.defenseAdd == 0 && this.defenseMult == 100)) {
            str += ""
                    + "Daño: +"+this.defenseAdd+", x"+this.defenseMult+"\n";
        }
        
        if (str.length() == 0) {
            str += "Sin bonus";
        }
        
        return str;
    }
    */
    public String dmgstatString() {
        String multstr = "";
        if (this.dmgMult < 100) {
            multstr += "0."+this.dmgMult;
        } else {
            multstr += Integer.toString(this.dmgMult).substring(0,Integer.toString(this.dmgMult).length()-2)+"."
                    + Integer.toString(this.dmgMult).substring(Integer.toString(this.dmgMult).length()-2,Integer.toString(this.dmgMult).length());
        }
        
        String str = "";
        
        if (this.dmgMult == 100) {
            str += ""
                    + "DMG: +"+this.dmgAdd;
        } 
        if (this.dmgAdd == 0) {
            str += ""
                    + "DMG: x"+multstr;
        }
        if (!(this.dmgAdd == 0 || this.dmgMult == 100)) {
            str += ""
                    + "DMG: +"+this.dmgAdd+", x"+multstr;
        } else if (this.dmgAdd == 0 && this.dmgMult == 100){
            str = "";
        }
        
        return str;
    }
    
    public String spdstatString() {
        String multstr = "";
        if (this.speedMult < 100) {
            multstr += "0."+this.speedMult;
        } else {
            multstr += Integer.toString(this.speedMult).substring(0,Integer.toString(this.speedMult).length()-2)+"."
                    + Integer.toString(this.speedMult).substring(Integer.toString(this.speedMult).length()-2,Integer.toString(this.speedMult).length());
        }
        
        String str = "";
        
        if (this.speedMult == 100) {
            str += ""
                    + "SPD: +"+this.speedAdd;
        } if (this.speedAdd == 0) {
            str += ""
                    + "SPD: x"+multstr;
        }
        if (!(this.speedAdd == 0 || this.speedMult == 100)) {
            str += ""
                    + "SPD: +"+this.speedAdd+", x"+multstr;
        } else if (this.speedAdd == 0 && this.speedMult == 100){
            str = "";
        }
        
        return str;
    }
    
    public String defstatString() {
        String multstr = "";
        if (this.defenseMult < 100) {
            multstr += "0."+this.defenseMult;
        } else {
            multstr += Integer.toString(this.defenseMult).substring(0,Integer.toString(this.defenseMult).length()-2)+"."
                    + Integer.toString(this.defenseMult).substring(Integer.toString(this.defenseMult).length()-2,Integer.toString(this.defenseMult).length());
        }
        
        String str = "";
        
        if (this.defenseMult == 100) {
            str += ""
                    + "DEF: +"+this.defenseAdd;
        } if (this.defenseAdd == 0) {
            str += ""
                    + "DEF: x"+multstr;
        }
        if (!(this.defenseAdd == 0 || this.defenseMult == 100)) {
            str += ""
                    + "DEF: +"+this.defenseAdd+", x"+multstr;
        } else if (this.defenseAdd == 0 && this.defenseMult == 100){
            str = "";
        }
        
        return str;
    }
    
}
