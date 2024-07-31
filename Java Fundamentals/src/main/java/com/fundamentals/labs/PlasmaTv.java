package com.fundamentals.labs;

public class PlasmaTv extends Television {

    private boolean hasBurnInProtection;

    public PlasmaTv(int screenSize, double price, int numPorts, boolean isMountable,
                    boolean hasBurnProtection) {
        super(screenSize, price, numPorts, isMountable);
        this.hasBurnInProtection = hasBurnInProtection;
    }

    public PlasmaTv(int screenSize, double price, boolean hasBurnInProtection) {

        this(screenSize, price, 6, true, hasBurnInProtection);

    }
        public void enableBurnProtection() {
            if (hasBurnInProtection) {
                System.out.println("The " + getScreenSize() + " inch Plasma" +
                        "TV has burn in protection enabled.");
            } else {
                System.out.println("The TV does not support burn in protection.");
            }


        }

    public boolean hasBurnProtection () {
        return  hasBurnInProtection;
    }

    public void setHasBurnInProtection(boolean hasBurnInProtection) {
        this.hasBurnInProtection = hasBurnInProtection;
    }

    public void turnOn() {
        System.out.println("The " + getScreenSize() + " inch Plasma TV is on. Burn in protection: " +
                getScreenSize() + (hasBurnInProtection ? "Enabled" : "Not available"));
    }

    public static void main(String[] args) {
        PlasmaTv plasmaTv = new PlasmaTv(65, 799.99,
                4, true, true);
    }


}