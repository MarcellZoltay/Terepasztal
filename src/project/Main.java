package project;

public class Main {

    public static void main(String[] args) {
        Manager man = new Manager();
        man.run();
    }
}

enum States {
    PAUSE,
    EXIT,
    NEWGAME,
    GAMEOVER,
    CONTINUE
}
