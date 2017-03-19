package project;

import static project.Status.GAMEOVER;
/**Játék állapot: End, A játék vége esetén.
 */
public class End implements State{

    @Override
    public Status start() {

        return GAMEOVER;

    }

}
