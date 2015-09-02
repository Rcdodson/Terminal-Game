package com.company;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean playing = true;
    public static boolean justEntered = true;
    public static boolean enemyDead = false;
    public static boolean playerDead = false;
    public static boolean isBossLevel = false;
    public static List<Level> levels;
    public static int levelIndex = 0;
    public static Enemy enemy = new Enemy();
    public static Player player = new Player();
    public static Level level = new Level();


    public static void main (String[] args) throws InterruptedException {
        System.out.println("Welcome to TestGame");
        player = Start();

        while(playing) {
            Update(player);
        }
    }

    public static Player Start() {
        System.out.println("Enter your characters name: ");
        player.setCharName();
        player.setPlayerLevel(1);
        player.setHealth();
        player.setBaseDamage();
        System.out.println("Player: " + player.getCharName());
        System.out.println("Level: " + player.getPlayerLevel());
        System.out.println("Select Difficulty: 1)Easy 2)Medium 3)Hard");
        player.setDifficulty();
        levels = level.create(player.getDifficulty());
        levels.get(levelIndex).playerInLevel = true;
        return player;
    }

    public static void Update(Player player) throws InterruptedException {
        if(justEntered) {
            levels.get(levelIndex).playerInLevel = true;
            levels.get(levelIndex).setEnemy(SpawnEnemy());
            enemyDead = false;
        }

        if(!enemyDead) {
            Battle.Start(player, levels.get(levelIndex), levels.get(levelIndex).getEnemy());
            if (enemy.getHealth() <= 0) {
                enemyDead = true;
                if (levels.size() - 1 == levelIndex)
                    isBossLevel = true;
                else {
                    player.advancePlayer();
                    levels.get(levelIndex).playerInLevel = false;
                    levelIndex++;
                    justEntered = true;
                }
            }
        }

        if(playerDead) {
            System.out.println("You Died. Game Over");
            playing = false;
        }

        if(isBossLevel) {
            //System.out.println("Boss Level");
            //SpawnBoss();
        }

    }

    public static Enemy SpawnBoss() {
        enemy = enemy.create();
        return enemy;
    }

    public static Enemy SpawnEnemy() {
        justEntered = false;
        enemy = enemy.create();
        return enemy;
    }
}

