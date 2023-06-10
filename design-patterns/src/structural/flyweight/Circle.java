package structural.flyweight;

public class Circle implements Shape{
    private int radius;
    private String color;
    public Circle(String color) {
        this.color = color;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius: "+radius+" and color :"+color);
    }
}
