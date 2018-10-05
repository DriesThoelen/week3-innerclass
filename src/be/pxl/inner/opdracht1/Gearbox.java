package be.pxl.inner.opdracht1;

import java.util.ArrayList;

public class Gearbox {
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;
    private ArrayList<Gear> gears;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;

        for (int i = 0; i <= maxGears; i++) {
            Gear gear = new Gear();
            gear.gearNumber = i;
            gear.ratio = gear.gearNumber * 5.3;
            this.gears.add(gear);
        }

        this.gears = new ArrayList<>();
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(Gear gear) {
        this.gears.add(gear);
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public double driveSpeed(int revs) {
           return revs * ratio;
        }
    }
}
