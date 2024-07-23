package com.fundamentals.labs;

import java.util.Scanner;

public class OperatorsLab {


    public void mathProblem() {
        int total = 10 + 32 * 12 / 3;
        int altTotal = (10 + 32) * 12 / 3;
        System.out.println("Total " + total);
        System.out.println("Alt Total " + altTotal);
    }


    public void main(String[] args) {
        OperatorsLab myLab = new OperatorsLab();
        myLab.mathProblem();
    }


    public void task2(int a, int b) {
        a += b;
        System.out.println("+= operator " + b);
        b *= a;
        System.out.println("*= operator " + b);
        a %= b;
        System.out.println("%= operator " + b);
    }

    public int task3() {
        int localVariable = 5;

        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Please enter a number");

        int userInput = scanner.nextInt();
        int total = userInput % localVariable;


        return total;
    }
    
}







