package com.fundamentals.labs;

public class SmartTv extends Television {

    private String operatingSystem;

    public SmartTv(int screenSize, double price, int
            numPorts, boolean isMountable, String operatingSystem) {
        super(screenSize, price, numPorts, isMountable);
         this.operatingSystem = operatingSystem;
        }
    public SmartTv(int screenSize, double price, String
                operatingSystem) {
        this(screenSize, price,4, true, operatingSystem);


        }
    public void connectToWifi() {
        System.out.println("The " + getScreenSize() + "inch Smart TV" +
                " is connecting to Wifi using "
                + operatingSystem + ".");

        }
        public String getOperatingSystem() {
            return  operatingSystem;

        }
        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }

        public void turnOn() {
        System.out.println("The " + getScreenSize() + " inch SmartTV running "
                + operatingSystem + " is on.");
        }
        public static void main(String[] args) {
            Television tv1 = new Television(55, 499.99, 4, true);
            tv1.turnOn();
        }
    }

