package com.fundamentals.labs;


public class NumbersLab {

    public void task1 () {

        int decimalValue = 29;

        String binaryValue =
                Integer.toBinaryString(decimalValue);
        String hexValue =
                Integer.toHexString(decimalValue);

        System.out.println("Decimal: " + decimalValue);
        System.out.println("Binary:" + binaryValue);
        System.out.println("Hexadecimal: " + hexValue);

    }
    public void temp () {
        int binaryValue = (0b11101);
        int hexValue = (0x1d);

    }


    public void convertAndPrint (byte a,short b,int c) {

        //widening conversion

        int byteToInt = a;
        long shortToLong = b;
        float intToFloat = c;

    /* Print results */

        System.out.println("Byte to Int: " + byteToInt);
        System.out.println("Short to Long: " + shortToLong);
        System.out.println("Int to Float: " + intToFloat);
    }

    public static void main(String[] args) {
        NumbersLab myLab = new NumbersLab();
        byte a = 10;
        short b =100;
        int c = 1000;
        myLab.convertAndPrint(22.5,98.6f,37l);
    }
    public void convertAndPrint (double a,float b,long c) {
        long doubleToLong = (long)a;
        int floatToInt = (int)b;
        short longToShort = (short) c;
        System.out.println("double to long: " + doubleToLong);
        System.out.println("float to int: " + floatToInt);
        System.out.println("long to short: " + longToShort);


    }

}




