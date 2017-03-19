package project;

import java.util.ArrayList;
import java.util.List;

/**
 * A csomópontokat megvalósító absztrakt osztály ami, a MapItem osztályból öröklődik
 */
public abstract class Node extends MapItem {

    protected List<Train> trainsOn = new ArrayList<Train>();
    protected Node nextNode;
    protected Node previousNode;

    /**
     * A csomóponthoz hozzáadja a kocsit vagy a mozdonyt
     * @param t
     */
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

    /**
     * A csomópontból eltávolítja a kocsit vagy mozdonyt
     * @param t
     */
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

    /**
     * Getter metódus
     * @return A következő csomópontot adja vissza
     */
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

    /**
     * Beállítja a csomópont következő csomópontját
     * @param n Paramétere a beállítandó csomópont
     */
	public void setNext(Node n) {
            nextNode = n;
	}

    /**
     * Getter metódus
     * @return Visszatér az előző csomóponttal
     */
	public Node getPrev() {
		    return null;
	}

    /**
     * Setter metódus, beállítja az előző csomópontot
     * @param p Paramétere a beállítandó csomópont
     */
	public void setPrev(Node p) {

	}
}
