package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to22then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to34then5() {
        double expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to340then5() {
        double expected = 5;
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 4, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }


    @Test
    public void when000to122then3() {
        double expected = 3;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }


    @Test
    public void when000to000then0() {
        double expected = 0;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}