package com.fundamentals.lessons;


public class Lesson13 extends Lesson12 {

    public Lesson13(String msg) {
        super(msg);

    }

    public Lesson13(String title, int hours) {
        super(title, hours);
    }

    public static void main(String[] args) {
        Lesson13 myLesson =
                new Lesson13("Hello There");
        Lesson13 my13 =
                new Lesson13("Rising Storm2" , 350);
        System.out.println(my13.getGameTitle());
    }
}
