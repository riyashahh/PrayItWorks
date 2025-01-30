package com.example.prayitworks;

public class triangle extends Shape {
    private double base;
    private double height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}