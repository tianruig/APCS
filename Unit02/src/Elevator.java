/*
 * Name: Tianrui Guo
 * Period: 5
 * Project: Elevator
 * Description: An Elevator class with basic functions including loading/unloading passengers and moving to different floors.
 */

public class Elevator {

    private int maxFloor, currentFloor, maxPassengers, numberOfPassengers;

    public Elevator(int f, int p) {
        maxFloor = f;
        maxPassengers = p;
        numberOfPassengers = 0;
        currentFloor = 1;
    }

    public boolean loadPassengers(int p) {
        if ((numberOfPassengers + p) <= maxPassengers) {
            numberOfPassengers += p;
            return true;
        }
        return false;
    }

    public boolean unloadPassengers(int p) {
        if (numberOfPassengers >= p) {
            numberOfPassengers -= p;
            return true;
        }
        return false;
    }

    public boolean moveToFloor(int f) {
        if (f >= 1 && f <= maxFloor) {
            currentFloor = f;
            return true;
        }
        return false;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
