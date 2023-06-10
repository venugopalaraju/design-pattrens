package structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    //Intrinsic state
    private static final HashMap<String,Shape> shapes = new HashMap<>();

    public static Shape getCircle(String color){
        if(shapes.containsKey(color)){
            return shapes.get(color);
        }
        Circle circle = new Circle(color);
        shapes.put(color,circle);
        return circle;
    }
}
