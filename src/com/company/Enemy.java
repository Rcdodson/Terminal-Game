package com.company;

import java.util.Random;

public class Enemy extends EnemyBaseClass {

    public Enemy create() {
        Enemy enemy = new Enemy();
        enemy.setName(EnemyName());
        enemy.setType(EnemyType());
        enemy.setHealth(getHealth());
        return enemy;
    }

    public String EnemyType() {
        Random rand = new Random();
        int x = rand.nextInt(100) % 3;

        switch(x) {
            case 0:
                setType("Warrior");
                setHealth(110f);
                break;
            case 1:
                setType("Archer");
                setHealth(100f);
                break;
            case 2:
                setType("Assassin");
                setHealth(90f);
                break;
            default:
                setType("Warrior");
                setHealth(110f);
                break;
        }
        return getType();
    }

    public String EnemyName() {
        Random rand = new Random();
        int x = rand.nextInt(100) % 3;

        switch(x) {
            case 0:
                setName("Ogre");
                break;
            case 1:
                setName("Human");
                break;
            case 2:
                setName("Zombie");
                break;
            default:
                setName("Human");
                break;
        }
        return getName();
    }
}
