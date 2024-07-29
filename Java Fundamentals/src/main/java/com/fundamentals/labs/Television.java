package com.fundamentals.labs;

public class Television {

    private int screenSize;
    private double price;
    private int numPorts;
    private boolean isMountable;

    public Television(int screenSize, double price,
                           int numPorts, boolean isMountable) {
                      this.screenSize = screenSize;
                      this.price = price;
                      this.numPorts = numPorts;
                      this.isMountable = isMountable;
    }
    public Television(int screenSize, double price) {
        this(screenSize, price, 2, true);


    }


    public int getScreenSize() { return  screenSize; }

    public void setScreenSize(int screenSize) { this.screenSize = screenSize; }

    public double getPrice() { return price; }

    public void setPrice(double price) {this.price = price; }

    public int getnumPorts() { getnumPorts(); return  numPorts; }

    public void setNumPorts(int numPorts) { this.numPorts = numPorts; }

    public boolean getIsMountable() { return isMountable; }

    public void setMountable(boolean isMountable) { this.isMountable = isMountable; }

// method to turn on tv

    public void turnOn() {

        System.out.println("The " +  screenSize  + " inch TV is on.");
    }

    public static void main(String[] arg) {
        Television tv1 = new Television(55, 499.99, 4, true);
                tv1.turnOn();
    }


}





