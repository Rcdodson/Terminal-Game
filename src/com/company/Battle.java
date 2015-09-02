package com.company;

/**
 * Created by rdodso002c on 7/6/2015.
 */
public class Battle extends Main{

    public static String eType;
    public static String lType;

    public static void Start(Player player, Level level, Enemy enemy){
        System.out.println(player.getCharName() + " Health: " + player.getHealth());
        System.out.println(enemy.getName() + " " + enemy.getType() + " Health: " + enemy.getHealth());
        System.out.println("Level: " + level.getLevelType());
        int choice = ChooseAttacks();
        CalculateDamage(choice, player, level, enemy);
    }

    public static int ChooseAttacks() {
        int attackChoice;
        System.out.println("Choose Attack");
        System.out.println("1) Melee 2) Ranged 3) Stealth");
        attackChoice = scanner.nextInt();
        return attackChoice;
    }

    public static void CalculateDamage(int choice,Player player, Level level, Enemy enemy) {
        float locationMultiplier = 1;
        float defenderMultiplier = 1;
        float totalMultiplier = 1;
        float calcDmg;
        switch(choice) {
            //Melee
            case 1:
                lType = level.getLevelType();
                eType = enemy.getType();
                defenderMultiplier = setDefenderMultiplier(defenderMultiplier, choice);
                locationMultiplier = setLocationMultiplier(locationMultiplier, choice);
                totalMultiplier = (defenderMultiplier * locationMultiplier);
                calcDmg = player.getBaseDamage() * totalMultiplier;
                enemy.setHealth(enemy.getHealth() - calcDmg);
                break;
            //Ranged
            case 2:
                lType = level.getLevelType();
                eType = enemy.getType();
                defenderMultiplier = setDefenderMultiplier(defenderMultiplier, choice);
                locationMultiplier = setLocationMultiplier(locationMultiplier, choice);
                totalMultiplier = (defenderMultiplier * locationMultiplier);
                calcDmg = player.getBaseDamage() * totalMultiplier;
                enemy.setHealth(enemy.getHealth() - calcDmg);
                break;
            //Stealth
            case 3:
                lType = level.getLevelType();
                eType = enemy.getType();
                defenderMultiplier = setDefenderMultiplier(defenderMultiplier, choice);
                locationMultiplier = setLocationMultiplier(locationMultiplier, choice);
                totalMultiplier = (defenderMultiplier * locationMultiplier);
                calcDmg = player.getBaseDamage() * totalMultiplier;
                enemy.setHealth(enemy.getHealth() - calcDmg);
                break;
            //auto kill enemy, use for testing only
            default:
                enemy.setHealth(enemy.getHealth() - enemy.getHealth());
                break;
        }
    }

    public static float setLocationMultiplier(float multiplier, int choice) {
        switch (choice) {
            //Melee
            case 1:
                if (lType.equals("Hills"))
                    multiplier = .5f;
                else if (lType.equals("Plains"))
                    multiplier = 2;
                else if (lType.equals("Forest"))
                    multiplier = 1;
                return multiplier;
            //Ranged
            case 2:
                if (lType.equals("Hills"))
                    multiplier = 2;
                else if (lType.equals("Plains"))
                    multiplier = 1;
                else if (lType.equals("Forest"))
                    multiplier = .5f;
                return multiplier;
            //Stealth
            case 3:
                if (lType.equals("Hills"))
                    multiplier = 1;
                else if (lType.equals("Plains"))
                    multiplier = .5f;
                else if (lType.equals("Forest"))
                    multiplier = 2;
                return multiplier;
            default:
                multiplier = 1;
                return multiplier;
        }
    }

    public static float setDefenderMultiplier(float multiplier, int choice) {
        switch (choice) {
            //Melee
            case 1:
                if (eType.equals("Warrior"))
                    multiplier = .5f;
                else if (lType.equals("Archer"))
                    multiplier = 2;
                else if (lType.equals("Assassin"))
                    multiplier = 1;
                return multiplier;
            //Ranged
            case 2:
                if (lType.equals("Warrior"))
                    multiplier = 1;
                else if (lType.equals("Archer"))
                    multiplier = .5f;
                else if (lType.equals("Assassin"))
                    multiplier = 2;
                return multiplier;
            //Stealth
            case 3:
                if (lType.equals("Warrior"))
                    multiplier = 2;
                else if (lType.equals("Archer"))
                    multiplier = 1;
                else if (lType.equals("Assassin"))
                    multiplier = .5f;
                return multiplier;
            default:
                multiplier = 1;
                return multiplier;
        }
    }
}
