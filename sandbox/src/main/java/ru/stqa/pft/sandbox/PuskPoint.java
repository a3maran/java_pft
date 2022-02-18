package ru.stqa.pft.sandbox;

public class PuskPoint {

  public static void main(String[] args) {
    Point p1 = new Point(5, 2);

    Point p2 = new Point(10, 8);

    System.out.println("Расстояние между точкой с координатами x=" + p1.x + ", y=" + p1.y + " и точкой с координатами x=" + p2.x + ", y=" + p2.y + " равно " + p1.distance(p2));
  }
}