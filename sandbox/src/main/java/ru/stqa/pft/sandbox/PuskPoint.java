package ru.stqa.pft.sandbox;

import static ru.stqa.pft.sandbox.Point.distance;

public class PuskPoint {

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);

        Point p2 = new Point(10, 8);

        System.out.println("Расстояние между точкой с координатами x=" + p1.x + ", y=" + p1.y + " и точкой с координатами x=" + p2.x + ", y=" + p2.y + " равно " + distance(p1, p2));
    }
}