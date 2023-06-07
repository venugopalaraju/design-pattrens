package structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        CheesePizza pizzaDecorator = new CheesePizza(new Margherita());
        PepperoniDecorator pepperoniDecorator = new PepperoniDecorator(pizzaDecorator);
        System.out.println(pepperoniDecorator.getDescription()+" And Cost"+pepperoniDecorator.getCost());
    }
}
