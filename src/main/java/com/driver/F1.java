package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Sports", 1);
    }

    public int getCurrentGear() {
        return super.currentGear;
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        // Speed categories for gear shifting
        // ... (same as before)

        if (newSpeed <= 0) {
            stop(); // Stop the car, set gear as 1
        } else if (newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}

