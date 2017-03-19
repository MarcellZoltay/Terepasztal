package project;

import java.util.Scanner;

public class Engine extends Train {

	public Engine(int x, int y, int xE, int yE) {}
        
    @Override
    public Status move() {
            Main.tabs++;
            Status temp = Status.CONTINUE;

            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Engine].move()\n");

            Train trains[] = onNode.getNext().getTrains();
            trains[0].getX();
            trains[0].getY();
            trains[0].getEndX();
            trains[0].getEndY();
            
            System.out.print("?");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("? 4.1. Van ütközés? I/N: ");

            Scanner sc = new Scanner(System.in);
            String s = "";
            try{
                s = sc.nextLine();
            } catch(Exception e) {
                e.printStackTrace();
            }
            if (s.equals("N") || s.equals("n")) {
                onNode.getX();
                onNode.getY();
                Node next = onNode.getNext();
                next.getX();
                next.getY();
                next.addTrain(this);
                nextCar.move();
            }
            else if (s.equals("I") || s.equals("i")) {
                temp = Status.GAMEOVER;
            }

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Engine].move()\n");
            
            Main.tabs--;
            return temp;
    }
        
    @Override
    public String getColor() {
            Main.tabs++;
            System.out.print(">");
		    for(int i = 0; i < Main.tabs; i++) {
    			System.out.print("\t");
    		}
    		System.out.print("->[:Engine].getColor()\n");

    		System.out.print("<");
    		for(int i = 0; i < Main.tabs; i++) {
	    		System.out.print("\t");
    		}
    		System.out.print("<-[:Engine].getColor()\n");

    		Main.tabs--;
            return null;
    }

    @Override
    public void setNextCar(Car c){
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Engine].setNextCar()\n");

	        if(nextCar == null) {
                nextCar = c;
                nextCar.setPrevTrain(null);
            }
	        else {
                nextCar.setNextCar(c);
            }

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Engine].setNextCar()\n");

            Main.tabs--;
    }

}
