package project;

import java.util.ArrayList;
import java.util.List;

public class Model{

	private List<Station> stations;
	private List<Switch> switches;
	private List<TunnelEntrance> tunnelEntrances;
	private List<Rail> rails;
	private List<Engine> engines;
	private List<Car> cars;

	public Model() {
			engines = new ArrayList<>();
	}
	
	public Status moveEngines() {
			Main.tabs++;
			Status temp = Status.CONTINUE;

			System.out.print(">");
			for(int i = 0; i < Main.tabs; i++) {
				System.out.print("\t");
			}
			System.out.print("->[:Model].moveEngines()\n");

			/*  Muszáj initelni, hogy működjön a függvény, emiatt lesz pár 'felesleges' függvényhívás,
    	    *   mely a végleges programban nem lesz.
        	*/
			Engine e = new Engine(1,1,1,2);
			engines.add(e);
			Car c = new Car(1, 1, 1, 3, null);
			e.setNextCar(c);

			Rail r1 = new Rail(1, 2, null, null);
			Rail r2 = new Rail(2, 3, null, r1);
			r1.setNext(r2);
            
			engines.get(0).setOnNode(r1);
			engines.get(0).getNextCar().setOnNode(engines.get(0).getOnNode());

			for(int i = 0; i < engines.size(); i++) {
				if ( engines.get(i).move() == Status.GAMEOVER) temp = Status.GAMEOVER;
			}

			System.out.print("<");
			for(int i = 0; i < Main.tabs; i++) {
				System.out.print("\t");
			}
			System.out.print("<-[:Model].moveEngines()\n");

			Main.tabs--;
			return temp;
	}
	
	public void addTrainToMap() {
			Main.tabs++;

			System.out.print(">");
			for(int i = 0; i < Main.tabs; i++) {
				System.out.print("\t");
			}
			System.out.print("->[:Model].addTrainToMap()\n");

			Engine e = new Engine(1, 1, 1, 1);
			Car car1 = new Car(1, 1, 2, 1, "Red");
			Car car2 = new Car(1, 1, 3, 1, "Green");

			e.setNextCar(car1);
			e.setNextCar(car2);

			System.out.print("<");
			for(int i = 0; i < Main.tabs; i++) {
				System.out.print("\t");
			}
			System.out.print("<-[:Model].addTrainToMap()\n");

			Main.tabs--;
	}
	
	public void decideActions(int x1, int y1, int x2, int y2) {}
	
	private void addTunnelEntrance(int x1, int y1, int x2, int y2) {}
	
	private void removeTunnelEntrance(TunnelEntrance tE) {}
	
	private void changeSwitch(Switch s) {}
	
	private void removeTrain(Train trainPart) {}
	
	private boolean isMapEmpty() {
			return false;
	}
}
