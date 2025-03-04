package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 185;
        double man = Fit.manWeight(height);
        System.out.println("Man 185 is " + man);

        short height2 = 165;
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 165 is " + woman);
    }
}
