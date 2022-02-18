package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

  @Test
  public void testDistance1() {
    Point p1 = new Point(5, 2);
    Point p2 = new Point(10, 8);
    Assert.assertEquals(p1.distance(p2), 7.810249675906654);
    //7.810249675906654
  }

  @Test
  public void testDistance2() {
    Point p1 = new Point(4, 2);
    Point p2 = new Point(1, 8);
    Assert.assertEquals(p1.distance(p2), 6.708203932499369);
    //6.708203932499369
  }

  @Test
  public void testDistance3() {
    Point p1 = new Point(-4, -2);
    Point p2 = new Point(3, 7);
    Assert.assertEquals(p1.distance(p2), 6.708203932499369);
    //11.40175425099138
  }
}

