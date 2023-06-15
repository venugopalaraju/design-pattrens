package behavioural.templatemethod;

public class SunJVM extends JVM{
    @Override
    protected void loadClasses() {
        System.out.println("Load Classes using SUN JVM");
    }

    @Override
    protected void compileCode() {
        System.out.println("Compile Classes using SUN JVM");
    }

    @Override
    protected void runCode() {
        System.out.println("Run Code using SUN JVM");
    }
}
