package com.bytelegend;

public class Circle extends Shape {
    /** `diameter` is the diameter of the circle. Hint: you can use `Math.PI`. */
    private final double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return diameter/2*Math.PI;
    }
}
