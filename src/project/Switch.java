package project;

/** A váltót megvalósító osztály.
 */
public class Switch extends Node {

	protected Node next2Node;

	public Switch(int x, int y, Node n, Node n2, Node p) {}

	/**Váltó állítás, az ellenkező állásba állítja a kimenetét.
     */
	public void changeOutput() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Switch].changeOutput()\n");

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Switch].changeOutput()\n");

            Main.tabs--;
	}

	/**Gette metódus
     *@return  Visszatér a második számu kinenetén szereplő elemmel.
     */
	public Node getSecond() {
	    	return next2Node;
	}


    /**Sette metódus
     *@param n2 Beállítja a második számu kinenetén szereplő elemet.
     */
	public void setSecond(Node n2) {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Switch].setSecond()\n");
            
            next2Node = n2;
            
            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Switch].setSecond()\n");

            Main.tabs--;
	}

}
