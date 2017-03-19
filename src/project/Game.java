package project;

import static project.Status.NEWGAME;
/**Játék állapot: Game, Új játék indulásakoz
 */
public class Game implements State{

    @Override
    public Status start() {

        return NEWGAME;

    }

}
