public class Employee {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private int id;

    public Employee(int id, String dept, Double salary) {
        this.id = id;
        Dept = dept;
        this.salary = salary;
    }

    private String Dept;
    private Double salary;


}
