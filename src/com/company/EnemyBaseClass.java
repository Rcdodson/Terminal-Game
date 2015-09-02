package com.company;

public class EnemyBaseClass {
    private float health;
    private String type;
    private String enemyName;
    private boolean Boss;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String enemyName) {
        this.enemyName = enemyName;
    }

    public String getName() {
        return enemyName;
    }

    public Boolean isBoss() {
        return this.Boss;
    }

    public void setBoss(Boolean Boss) {this.Boss = Boss;}

    public void setHealth(float health) {this.health = health;}

    public float getHealth() { return this.health;}

}
