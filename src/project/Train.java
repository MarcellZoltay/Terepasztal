package project;

import java.util.*;

/**
 * 
 */
public abstract class Train extends MapItem {

    /**
     * Default constructor
     */
    public Train() {
    }


    /**
     * @return
     */
    public Status move() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getEndX() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getEndY() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public Node getOnNode() {
        // TODO implement here
        return null;
    }

    /**
     * @param n
     */
    public void setOnNode(Node n) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Node getPrevNode() {
        // TODO implement here
        return null;
    }

    /**
     * @param p
     */
    public void setPrevNode(Node p) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Car getNextCar() {
        // TODO implement here
        return null;
    }

    /**
     * @param c
     */
    public void setNextCar(Car c) {
        // TODO implement here
    }

}