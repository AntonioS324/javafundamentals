package com.fundamentals.practice;

public class Example {
    String value1; // instance variable

    public void sample(){
         value1 = "my example";
         sample2(value1);
      String msg ="Hello"; // local variable
    } // Method scope

    public void sample2(String msg){
        System.out.println(msg);
        int alpha = sample3(4,6);
        System.out.println(alpha);
    }

    public int sample3(int num1,int num2){
        return num1 + num2;
    }

} // Class scope
