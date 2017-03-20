package project;

import java.util.Scanner;
/**Vagont megvalósító osztály
 */
public class Car extends Train {

	private Train prevTrain;
    private String color;

	public Car(int x, int y, int xE, int yE, String c) {
           color = c;
	}

    /**Mozgatja a vagont, kezeli az új helyzethez kapcsolodó teendőket
     *@return Status: A lépés során keletkezett állapot kezeléséhez szükséges
     */
    @Override
    public Status move() {
            Main.tabs++;
            Status temp = Status.CONTINUE;

            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Car].move()\n");
            
            System.out.print("?");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("4.2 Allomasra lep a vagon? I/N: ");

            Scanner sc = new Scanner(System.in);
            String s = "";
            try{
                s = sc.nextLine();
            } catch(Exception e) {
                e.printStackTrace();
            }
            if (s.equals("I") || s.equals("i")) {
                Station st = new Station(1, 1, null, null);
                onNode.setNext(st);
            }

            onNode.getX();
            onNode.getY();
            Node next = onNode.getNext();
            next.getX();
            next.getY();
            next.addTrain(this);
            
            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Car].move()\n");
            
            Main.tabs--;
            return temp;   
        }

    /**Megvizsgálja hogy leszállhatnak-e az utasok és leszállítja a vagon utasait.
     */
	public void getOffPassengers() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Car].getOffPassengers()\n");

            prevTrain = new Car(1, 1, 3, 5, null);

            if (prevTrain.getColor() == null) color = null;

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Car].getOffPassengers()\n");

            Main.tabs--;
	}

    /**Getter metódus.
     *@return A megelöző vagont adja vissza
     */
	public Train getPrevTrain() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Car].getPervTrain()\n");

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Car].getPrevTrain()\n");

            Main.tabs--;
            return prevTrain;
	}

    /**Setter metódus, A vagont megelöző vagont állítja be.
     *@param t: A beállítandó vagon.
     */
	public void setPrevTrain(Train t) {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Car].setPrevTrain()\n");

            if(prevTrain == null)
                prevTrain=t;

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Car].setPrevTrain()\n");

            Main.tabs--;
	}

    /**Setter metódus, A vagont követő vagont állítja be.
     *@param c: A beállítandó vagon.
     */
    @Override
    public void setNextCar(Car c){
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Car].setNextCar()\n");

            if(nextCar == null) {
                nextCar = c;
                nextCar.setPrevTrain(this);
            }
            else {
                nextCar.setNextCar(c);
            }

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Car].setNextCar()\n");

            Main.tabs--;
    }

    /**Getter metódus.
     *@return A vagon színével tér vissza, ha üres: null
     */
    @Override
	public String getColor() {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Car].getColor()\n");

            System.out.print("?");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("5.1. Milyen szinu a vagon? R/Green/B/Y/Gray :");
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }

            System.out.print("<-[:Car].getColor()\n");
            Main.tabs--;

            //Szürke kocsi szín esetén üresnek tekintjük a vagont,
            if (s.equals("Gray") || s.equals("gray")) return null;
            return s;
	}

}