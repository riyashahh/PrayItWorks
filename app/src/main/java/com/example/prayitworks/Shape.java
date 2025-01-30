package com.example.prayitworks;

public abstract class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea(); // Abstract method for calculating area
}
