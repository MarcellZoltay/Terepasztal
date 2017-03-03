package project;

import static project.States.PAUSE;

public class Menu implements State {

    @Override
    public States start(){

        return PAUSE;

    }

}
