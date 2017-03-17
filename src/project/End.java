package project;

import static project.Status.GAMEOVER;

public class End implements State{

    @Override
    public Status start() {

        return GAMEOVER;

    }

}
