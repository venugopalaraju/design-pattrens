package structural.bridge.abstraction;

import structural.bridge.implementor.Color;
//Refine Abstraction
public class Circle extends Shape {

    private int x, y, radius;
    public Circle(int x, int y, int radius, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at ("+x+","+y+") redius :"+radius);
        color.applyColor();
    }
}
