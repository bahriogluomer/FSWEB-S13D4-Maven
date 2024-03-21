package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point p) {
        return Math.sqrt((p.x-x)*(p.x-x) + (p.y-y)*(p.y-y));
    }

    public double distance(int a, int b) {
        return Math.sqrt((a-x)*(a-x) + (b-y)*(b-y));
    }
}
