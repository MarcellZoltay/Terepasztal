package project;

import static project.States.CONTINUE;

public class Pause implements State {

    @Override
    public States start() {

        return CONTINUE;

    }

}
