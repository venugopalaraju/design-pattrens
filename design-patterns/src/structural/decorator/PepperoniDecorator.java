package structural.decorator;

public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Added Extra Peppar ";
    }

    @Override
    public double getCost() {
        return super.getCost()+2;
    }
}
