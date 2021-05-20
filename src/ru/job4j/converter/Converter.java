package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");

        int euroIn = 140;
        int expected = 2;
        int euroOut = Converter.rubleToEuro(euroIn);
        boolean passed = expected == euroOut;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        int dollarIn = 120;
        int dollarOut = Converter.rubleToDollar(dollarIn);
        boolean passed1 = expected == dollarOut;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed1);
    }
}
