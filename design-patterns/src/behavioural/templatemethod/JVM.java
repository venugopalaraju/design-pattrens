package behavioural.templatemethod;

public abstract class JVM {
    public void execute(){
        System.out.println("Syntax and Semantics Verification Step");
        loadClasses();
        compileCode();
        runCode();
    }

    protected abstract void loadClasses();
    protected abstract void compileCode();
    protected abstract void runCode();

}
