package structural.bridge.abstraction;

import structural.bridge.implementor.Color;
//Refine Abstraction
public class Square extends Shape {
    private int x, y, side;

    public Square(int x, int y, int side, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square at (" + x + ", " + y + ") with side " + side);
        color.applyColor();
    }
}