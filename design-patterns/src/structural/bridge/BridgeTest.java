package structural.bridge;

import structural.bridge.abstraction.Circle;
import structural.bridge.abstraction.Shape;
import structural.bridge.abstraction.Square;
import structural.bridge.implementor.GreenColor;
import structural.bridge.implementor.RedColor;

public class BridgeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(2,3,4,new RedColor());
        Shape square = new Square(3,5,6,new GreenColor());
        circle.draw();
        square.draw();
    }
}
