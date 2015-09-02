package com.company;

import java.util.Random;

public class LevelBaseClass {
    private String name;
    private String levelType;
    private Enemy enemy;
    public boolean playerInLevel;

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevelType() { return this.levelType; }

    public void setLevelType() {
        Random rand = new Random();
        int x = rand.nextInt(100) % 3;

        switch(x) {
            case 0:
                levelType = "Forest";
                break;
            case 1:
                levelType = "Hills";
                break;
            case 2:
                levelType = "Plains";
                break;
            default:
                levelType = "Plains";
                break;
        }
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
    public Enemy getEnemy() {
        return this.enemy;
    }
}
