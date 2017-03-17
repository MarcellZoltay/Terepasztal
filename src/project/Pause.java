package project;

import static project.Status.CONTINUE;

public class Pause implements State {

    @Override
    public Status start() {

        return CONTINUE;

    }

}
