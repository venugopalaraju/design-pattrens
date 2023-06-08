package structural.facade;

public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
    }

    public void performOperations(){
        subsystemA.opertaionA();
        subsystemB.operationB();
    }
}
