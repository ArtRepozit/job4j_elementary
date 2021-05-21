package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to39then4() {
        double expected = 4.47;
        int x1 = 1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when49to20then2() {
        double expected = 10.81;
        int x1 = 4;
        int y1 = -9;
        int x2 = -2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1349to310then2() {
        double expected = 52.20;
        int x1 = 13;
        int y1 = -49;
        int x2 = 31;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}