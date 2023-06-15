package behavioural.templatemethod;

public class Main {
    public static void main(String[] args) {
        JVM oracleJvm = new OracleJVM();
        JVM sunJvm = new SunJVM();
        oracleJvm.execute();
        System.out.println("=======================");
        sunJvm.execute();
    }
}
