package com.solid.finished;

public class Ostrich implements FlightlessBird {

    @Override
    public void walk() {
        System.out.println("Ostrich is walking");
    }

    @Override
    public void layEggs() {
        System.out.println("Ostrich is laying eggs");
    }
}
