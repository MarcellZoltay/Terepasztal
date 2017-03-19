package project;

import static project.Status.PAUSE;
/**Játék állapot: Menü
 */
public class Menu implements State {

    @Override
    public Status start(){

        return PAUSE;

    }

}
