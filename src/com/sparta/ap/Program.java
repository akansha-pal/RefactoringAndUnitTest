package com.sparta.ap;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;

        greeting(timeOfDay);
    }

    private static String greeting(int timeOfDay) {
        String greetingOutput;
        if (timeOfDay >= 5 && timeOfDay <=12) {
            greetingOutput ="Good Morning";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greetingOutput ="Good Afternoon";
        } else {
            greetingOutput="Good Evening";
        }
        return greetingOutput;
    }
}