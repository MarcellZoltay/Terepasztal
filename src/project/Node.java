package project;

import java.util.ArrayList;
import java.util.List;

public abstract class Node extends MapItem {

    protected List<Train> trainsOn = new ArrayList<Train>();
    protected Node nextNode;
    protected Node previousNode;

	public void addTrain(Train t) {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Node].addTrain()\n");
            
            t.setOnNode(this);
            
            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Node].addTrain()\n");

            Main.tabs--;
	}
	
	public void removeTrain(Train t) {	}
	
	public Train[] getTrains() {
            Train trains[] = {new Engine(1, 2, 1, 3)};
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Node].getTrains()\n");
            
            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Node].getTrains()\n");
            
            Main.tabs--;
    		return trains;
	}
	
	public Node getNext() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Node].getNext()\n");
            
            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Node].getNext()\n");
            
            Main.tabs--;
            return nextNode;
	}
	
	public void setNext(Node n) {
            nextNode = n;
	}
	
	public Node getPrev() {
		    return null;
	}
	
	public void setPrev(Node p) {

	}
}
