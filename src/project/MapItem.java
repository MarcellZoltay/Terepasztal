package project;

public abstract class MapItem {

	protected int x;
    protected int y;

	public int getX() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:MapItem].getX()\n");

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:MapItem].getX()\n");
            
            Main.tabs--;
            return 0;
	}
	
	public int getY() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:MapItem].getY()\n");

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:MapItem].getY()\n");
            
            Main.tabs--;
            return 0;
	}

}
