package project;

import java.util.ArrayDeque;
import java.util.Deque;

public class Manager {

    private Deque<State> list;

    public Manager(){

        list = new ArrayDeque<>();

    }

    public void run(){
        list.push(new Menu());

        while (true){
            switch(list.peek().start()) {
                case PAUSE:
                    list.push(new Pause());
                    System.out.println(1);
                    break;
                case EXIT:
                    break;
                case NEWGAME:
                    break;
                case GAMEOVER:
                    break;
                case CONTINUE:
                    break;
            }
        }

    }

    public static void main(String[] args) {
        Manager man = new Manager();
        man.run();
    }
}
