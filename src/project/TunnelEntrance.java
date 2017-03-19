package project;
/**Alagút bejáratot megvalósító osztály, ami a Switch osztályból származik
 */
public class TunnelEntrance extends Switch {

	public TunnelEntrance(int x, int y, Node n, Node n2, Node p) {
			super(x, y, n, n2, p);
	}

	/**
	 * Overridelja a Switch changeOutput függvényét, az alagútból a továbbhaladási irányt állítja be
	 */
	@Override
	public void changeOutput(){
		Main.tabs++;
		System.out.print(">");
		for(int i = 0 ; i< Main.tabs ; i++){
			System.out.print("\t");
		}
		System.out.println("->[:TunnelEntrance].changeOutput()");

		System.out.print("<");
		for(int i = 0; i < Main.tabs; i++) {
			System.out.print("\t");
		}
		System.out.println("<-[:TunnelEntrance].changeOutput()");

		Main.tabs--;

	}

	/**
	 *Setter metódus, beállítja az alagút másik csomópontját
	 * @param n Beállítja a paraméterként kapott elemet második alagútbejáratként
	 */
	@Override
	public void setSecond(Node n){
		Main.tabs++;
		System.out.print(">");
		for(int i = 0 ; i< Main.tabs ; i++){
			System.out.print("\t");
		}
		System.out.println("->[:TunnelEntrance].setSecond(TunnelEntrance test)");

		System.out.print("<");
		for(int i = 0; i < Main.tabs; i++) {
			System.out.print("\t");
		}
		System.out.println("<-[:TunnelEntrance].setSecond(TunnelEntrance test)");

		Main.tabs--;
	}

	/**
	 * Getter metódus
	 * @return Visszatér a másik alagútbejárattal
	 */
	@Override
	public Node getSecond(){
		return null;
	}

}
