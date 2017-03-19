package project;

import static project.Status.CONTINUE;

/**Játék állapot: Pause, Játék megszakítása
 */
public class Pause implements State {

    @Override
    public Status start() {
        return CONTINUE;
    }

}
