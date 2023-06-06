package structural.bridge.abstraction;

import structural.bridge.implementor.Color;
//Abstraction
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
