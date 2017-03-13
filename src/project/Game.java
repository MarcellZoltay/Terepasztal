package project;

import static project.States.NEWGAME;

public class Game implements State{

    @Override
    public States start() {

        return NEWGAME;

    }

}
