package project;
/**A pályán elhelyezett elemeket absztrakt összefogó osztály
 */
public abstract class MapItem {

	protected int x;
    protected int y;

    /**Getter metódus.
    *@return A pályaelem helyének x kordinátájával tér vissza.
    */
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

	/**Getter metódus.
    *@return A pályaelem helyének y kordinátájával tér vissza.
     */
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
