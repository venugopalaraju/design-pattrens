package structural.bridge.implementor;

//Concrete Implementor
public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Green Color");
    }
}
