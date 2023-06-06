package structural.bridge.implementor;

//Concrete Implementor
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Red Color");
    }
}
