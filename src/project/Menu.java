package project;

import static project.Status.PAUSE;

public class Menu implements State {

    @Override
    public Status start(){

        return PAUSE;

    }

}
