package Game;

import Game.Character.*;

public class Maze extends Game{

    private int time;
    private World worlds;
    private Hero heroes;
    private Screen configureScreen;

    public Maze(int time, World worlds, Hero heroes, Screen configureScreen) {
        this.time = time;
        this.worlds = worlds;
        this.heroes = heroes;
        this.configureScreen = configureScreen;
    }
    
    
}
