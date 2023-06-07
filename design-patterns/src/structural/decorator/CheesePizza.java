package structural.decorator;

public class CheesePizza extends PizzaDecorator{
    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Added Extra Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost()+10.00;
    }
}
