package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.MyFirstProgramm.distance;

public class SquareTests {
    @Test
    public void testDistance()
    {
        Point p1 = new Point(5,2);
Point p2 = new Point(10,8);
        Assert.assertEquals(distance(p1,p2), 7.810249675906654)   ;
      //7.810249675906654
    }
}
