package com.fundamentals.labs;

public class StringsLab {

    /* */
    public void task1(String myString) {
        String lower = myString.toLowerCase();
        System.out.println(lower);

        char value = myString.charAt(1);
        System.out.println(value);

        int total = myString.length();
        System.out.println(total);

    }


    public void task2() {
        String poem = "Jack an Jill went up the hill" +
                " to fetch a pail of water," +
                "\nJack fell down and broke his crown " +
                "and Jill came tumbling after\n";
        System.out.println("poem");
    }


}
