package project;

import java.util.Scanner;

public class Main {
    public static int tabs = 0;
    
    public static void main(String[] args) {
        int b = 0;
        do {
            b = menuWrite();
            if (b < 1 || b > 6) {
                System.out.print("Ilyen parancs nem létezik!");
            }
            else {
                runSkeleton(b);
            }
        } while (b != 6);
    }

    /**Megjeleníti a menüt
     * @return A kiválasztott menüpont számával visszatér
     */
    private static int menuWrite() {
        System.out.print("\n \nMenü:" + "\n" +
                "1. Váltó állítása" + "\n" +
                "2. Alagút létrehozása" + "\n" +
                "3. Alagút törlése" + "\n" +
                "4. Vonat mozgatása" + "\n" +
                "5. Vonat hozzáadása" + "\n" +
                "6. Kilépés" + "\n" +"\n" +
                "? Adja meg a parancs kódját: "
        );
        Scanner sc = new Scanner(System.in);
        int a = 0;
        try {
            a = sc.nextInt();
        } catch (Exception e) {}
        return a;
    }

    /**Az átadott paraméterhez tartozó menüpontot elindítja
    *@param b: A menű sorszáma.
    */
    private static void runSkeleton(int b) {
        switch (b) {
            case 1:
                System.out.println(b + ". Váltó állítása");
                changeSwitch();
                break;
            case 2:
                System.out.println(b + ". Alagút létrehozása");
                addTunnelEntrance();
                break;
            case 3:
                System.out.println(b + ". Alagút törlése");
                removeTunnelEntrance();
                break;
            case 4:
                System.out.println(b + ". Vonat mozgatása");
                moveTrains();
                break;
            case 5:
                System.out.println(b + ". Vonat hozzáadása");
                addTrainToMap();
                break;
            case 6:
                System.out.println(b + ". Kilépés");
                break;
        }
    }

    //---------------------------------------------------
    //           Menüpontok megvalósítása               |
    //---------------------------------------------------
    /**1. Váltó állítása menüponthoz tartozó megvalósítás
     */
    private static void changeSwitch() {
        System.out.print("? 1.1 Szeretné átállítani a váltó kimenetét? I/N: ");
        char c = 0;
        try {
            c = (char) System.in.read();
            if (c == 'I' || c == 'i') {
                Switch s = new Switch(1, 1, null, null, null);
                s.changeOutput();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**2. Alagút létrehozása menüponthoz tartozó megvalósítás
     */
    private static void addTunnelEntrance () {
        System.out.print("? 2.1 Hány alagút van a pályán?  0/1/2: ");
        int i = 0;
        try {
            i = Character.getNumericValue(System.in.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 0) {
            System.out.print("? 2.2 Érvényes helyre akarja építeni? I/N: ");
            char c = 0;
            try {
                System.in.read();
                c = (char) System.in.read();
                if (c == 'I' || c == 'i') {
                    TunnelEntrance te = new TunnelEntrance(0, 0, null, null, null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i == 1) {
            System.out.print("? 2.2 Érvényes helyre akarja építeni? I/N: ");
            char c = 0;
            try {
                System.in.read();
                c = (char) System.in.read();
                if (c == 'I' || c == 'i') {
                    TunnelEntrance test1 = new TunnelEntrance(0, 0, null, null, null);
                    TunnelEntrance test2 = new TunnelEntrance(0, 0, null, test1, null);
                    test1.changeOutput();
                    test1.setSecond(test2);
                    test2.changeOutput();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**3. Alagút törlésée menüponthoz tartozó megvalósítás
     */
    private static void removeTunnelEntrance(){
        TunnelEntrance test2 = new TunnelEntrance(0,0,null,null,null);
        TunnelEntrance test1 = new TunnelEntrance(0,0,null,null,null);
        System.out.print("? 3.1 Hány alagút van a pályán?  0/1/2: ");
        int i = 0;
        try {
            i = Character.getNumericValue(System.in.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 2) {
            test1.changeOutput();
        }
        else if (i == 1){
            
        }
    }

    /**4. Vonat mozgatása menüponthoz tartozó megvalósítás
     */
    private static void moveTrains() {
        Model map = new Model();
        map.moveEngines();
    }

    /**5.Vonat hozzáadása menüponthoz tartozó megvalósítás
     */
    private static void addTrainToMap(){
        System.out.print("? 5.1 Szeretne vonatot adni a pályához? I/N: ");
        char c = 0;
        try {
            c = (char) System.in.read();
            if (c == 'I' || c == 'i') {
                Model m = new Model();
                m.addTrainToMap();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
