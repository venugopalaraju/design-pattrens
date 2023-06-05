package creational.prototype;

public class ConcretePrototype{
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        return new ConcretePrototype(this.name);
    }
}
