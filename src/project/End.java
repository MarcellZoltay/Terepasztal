package project;

import static project.States.GAMEOVER;

public class End implements State{

    @Override
    public States start() {

        return GAMEOVER;

    }

}
