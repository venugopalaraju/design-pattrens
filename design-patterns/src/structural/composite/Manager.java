package structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Manager implements Employee{
    private String name;
    private String position;
    private List<Employee> subordinates;

    public Manager(String name, String position, List<Employee> subordinates) {
        this.name = name;
        this.position = position;
        this.subordinates = new ArrayList<>(subordinates);
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeEmployee(Employee employee){
        subordinates.remove(employee);
    }
    @Override
    public void showDetails() {
        System.out.println("Employee Name: "+name+" and position: "+position);
        System.out.println("Subordinates :: ");
        subordinates.forEach(employee -> employee.showDetails());
    }
}
