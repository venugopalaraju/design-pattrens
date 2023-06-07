package structural.composite;

import java.util.Arrays;

public class CompositeTest {
    public static void main(String[] args) {
        Employee developer =new Developer("Venu","SSE");
        Employee sde =new Developer("Venugopalaraju","SDE");
        Employee manager =new Manager("Vijay","SDM", Arrays.asList(developer,sde));
        manager.showDetails();
    }
}
