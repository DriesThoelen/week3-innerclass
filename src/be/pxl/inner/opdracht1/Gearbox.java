package be.pxl.inner.opdracht1;

import java.util.ArrayList;

public class Gearbox {
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;
    private ArrayList<Gear> gears;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();

        for (int i = 0; i <= maxGears; i++) {
            Gear gear = new Gear();
            gear.gearNumber = i;
            gear.ratio = gear.gearNumber * 5.3;
            this.gears.add(gear);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void changeGear(int newGear) {
        if ((clutchIsIn) && (newGear >= 0) && (newGear <= gears.size())) {
            this.currentGear = newGear;
            System.out.println("Gear " + this.currentGear + " selected.");
        } else {
            this.currentGear = 0;
            System.out.println("Grind! (of een ander vreemd geluid van je versnellingsbak)");
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Grind! (of een ander vreemd geluid van je versnellingsbak)");
            return 0.0;
        } else {
            return this.gears.get(currentGear).driveSpeed(revs);
        }
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
