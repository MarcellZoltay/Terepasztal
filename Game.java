package project;

import static project.Status.NEWGAME;

public class Game implements State{

    @Override
    public Status start() {

        return NEWGAME;

    }

}
