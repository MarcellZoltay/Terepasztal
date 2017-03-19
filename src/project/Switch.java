package project;

public class Switch extends Node {

	protected Node next2Node;

	public Switch(int x, int y, Node n, Node n2, Node p) {}
	
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
	
	public Node getSecond() {
	    	return next2Node;
	}
	
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
