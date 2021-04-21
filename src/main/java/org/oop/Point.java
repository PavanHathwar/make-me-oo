package org.oop;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public static double distance(Point from, Point to) {
        double xDistance = distance(to.getX(), from.getX());
        double yDistance = distance(to.getY(), from.getY());
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double distance(double to, double from) {

        return to - from;
    }

    public static double direction(Point from, Point to) {
        double xDistance = distance(to.getX(), from.getX());
        double yDistance = distance(to.getY(), from.getY());
        final double v = Math.atan2(yDistance, xDistance);
        return v;
    }
}
