package com.company;


public class Player extends Main{
    private String charName = "";
    private int Difficulty;
    private int playerLevel;
    private int playerPosition;
    private int meleeLevel = 1;
    private int rangedLevel = 1;
    private int stealthLevel = 1;
    private float health;
    private float baseDamage;
    private String attackType;

    public void setCharName() {
        charName = scanner.nextLine();
    }

    public String getCharName() {
        return charName;
    }

    public void setHealth() { health = 100f;}

    public float getHealth() { return health;}

    public void setDifficulty() { Difficulty = scanner.nextInt(); }

    public int getDifficulty() {
        return Difficulty;
    }

    public void setPlayerLevel(int x){ this.playerLevel = x; }

    public void setAttackType(String type) {this.attackType = type;}

    public String getAttackType() { return attackType;}

    public void setBaseDamage() { baseDamage = 20f;}

    public float getBaseDamage() {return baseDamage;}

    public int getPlayerLevel() { return playerLevel; }

    public int getPlayerPosition() {
        for (int x = 0; x < levels.size(); x++) {
            if(levels.get(x).playerInLevel)
                playerPosition = x;
                break;
        }
        return playerPosition;
    }

    public void advancePlayer() {
        playerPosition = playerPosition + 1;
    }
}
