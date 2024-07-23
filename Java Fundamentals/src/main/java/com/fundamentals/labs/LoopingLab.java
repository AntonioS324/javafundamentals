package com.fundamentals.labs;

public class LoopingLab {

    public void Task1() {
        int count = 0;

        while (count <= 15) {
            if (count == 5) {

                System.out.println("Five");
            } else if (count == 10) {

                System.out.println("Ten");
            } else if (count == 15) {
                System.out.println("Fifteen");
            } else {

                System.out.println(count);
            }
            count++;
        }
    }


    public void task2() {
        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


}

