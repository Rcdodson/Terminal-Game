package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Level extends LevelBaseClass {

    public Level create() {
        Level level = new Level();
        level.setLevelType();
        level.setName("LevelName");
        return level;
    }

    public List<Level> create(int quantity) {
        ArrayList levels = new ArrayList();

        for(int x = 0; x < quantity; ++x) {
            levels.add(this.create());
        }

        return levels;
    }

}
