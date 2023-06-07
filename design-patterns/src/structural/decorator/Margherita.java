package structural.decorator;

// Concrete component
class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 8.99;
    }
}
