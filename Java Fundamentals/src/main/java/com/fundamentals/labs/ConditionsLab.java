package com.fundamentals.labs;

public class ConditionsLab {

    public void task1(String msg1, String msg2) {
        if (msg1.equals(msg2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }


    public char gradeDescription(char grade) {
        switch (grade) {
            case 'E':
                System.out.println("Excellent Grade");
                break;
            case 'V':
                System.out.println("Very Good Grade");
                break;
            case 'G':
                System.out.println("Good Grade");
                break;
            case 'A':
                System.out.println("Average Grade");
            case 'F':
                System.out.println("Failed Grade");
                break;
            default:
                System.out.println("Not a valid " + grade);

        }
        return grade;
    }

    }


