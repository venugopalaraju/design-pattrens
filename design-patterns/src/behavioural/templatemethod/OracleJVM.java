package behavioural.templatemethod;

public class OracleJVM extends JVM{
    @Override
    protected void loadClasses() {
        System.out.println("Load classes using Oracle JVM class loaders");
    }

    @Override
    protected void compileCode() {
        System.out.println("Compile code using Oracle JVM Compiler");
    }

    @Override
    protected void runCode() {
        System.out.println("Run the Code using Oracle Interpreter");
    }
}
