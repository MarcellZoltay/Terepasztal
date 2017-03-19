package project;
/**A Car-t és az Engint öszzefogó absztrakt osztály.
 */
public abstract class Train extends MapItem {

    protected int xEnd;
    protected int yEnd;
    protected Node onNode;
    protected Node prevNode;
	protected Car nextCar;

	public Status move() {
            return null;
	}
	
	public int getEndX() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Train].getEndX()\n");

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Train].getEndX()\n");
            
            Main.tabs--;
            return 0;
	}
	
	public int getEndY() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Train].getEndY()\n");

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Train].getEndY()\n");
            
            Main.tabs--;
            return 0;
	}
	
	public Node getOnNode() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Train].getOnNode()\n");

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Train].getOnNode()\n");
            
            Main.tabs--;
            return onNode;
	}
        
	public void setOnNode(Node n) {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                    System.out.print("\t");
            }
            System.out.print("->[:Train].setOnNode()\n");

            onNode = n;

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                    System.out.print("\t");
            }
            System.out.print("<-[:Train].setOnNode()\n");
            Main.tabs--;
	}
	
	public Node getPrevNode() {
            return null;
	}
	
	public void setPrevNode(Node p) {
	}
	
	public Car getNextCar() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Train].getNextCar()\n");
            
            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Train].getNextCar()\n");
            
            Main.tabs--;
            return nextCar;
	}

	/**Setter metódus, A vagont követő vagont állítja be.
     *@param c: A beállítandó vagon.
     */
	public void setNextCar(Car c) {	}

	/**Getter metódus.
     *@return A vagon színével tér vissza, ha üres: null
     */
	public String getColor() {
            return null;
	}

}
