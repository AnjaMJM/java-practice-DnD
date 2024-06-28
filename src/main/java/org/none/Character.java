package org.none;

import java.util.Scanner;

public class Character {
    private String name;
    private String race;
    private String sex;
    private Integer hp;
    private Integer xp;
    private Integer level;


    //character creation loop at the start of the game
    //character must be fully created.
    //loop ends with leaving the startlocation.
    public void characterLoop() {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            boolean refreshDone = false;
            boolean searchDesk = false;
            boolean checkMirror = false;


        }
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
