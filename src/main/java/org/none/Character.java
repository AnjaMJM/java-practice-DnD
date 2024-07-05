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
        Story introduction = new Story();
        Scanner scanner = new Scanner(System.in);
        boolean refreshDone = false;
        boolean searchDesk = false;
        boolean checkBody = false;

        System.out.println(introduction.chapter1Start);
        String userInput = scanner.nextLine();

        while (true) {
            if (userInput.equalsIgnoreCase("look around")) {
                System.out.println(introduction.chapter1LookAround);
            } else if (userInput.equalsIgnoreCase("check body")) {
                System.out.println("Is your character male of female?");
                userInput;
                if (userInput.equalsIgnoreCase("male")) {
                    setSex("male");
                    System.out.printf(introduction.chapter1CheckBodyMale);
                } else if (userInput.equalsIgnoreCase("female")) {
                    setSex("female");
                    System.out.println(introduction.chapter1CheckBodyFemale);
                }
                checkBody = true;
             }
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
