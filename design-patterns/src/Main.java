import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        List<Employee> empList = Arrays.asList (
        new Employee(1, "Computer", 22000.00)
                ,new Employee(2, "Computer", 12000.00)
                ,new Employee(3, "Computer", 48000.00),
                new Employee(4, "Accounts", 35000.00)
                ,new Employee(5, "Accounts", 27000.00));

        Map<String, Optional<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(collect.toString());
        // eaaaaaaabc, abbbbbbbccccdcc are similar
// aaabc bbbbaaac are similar
// bca, aec are not similar.
// aaaabc, ae are not similar

        System.out.println(areStrignAreEquealParams("aaabc","bbbbaaace"));
    }

    public static boolean areStrignAreEquealParams(String s1,String s2){
        if(s1.length()==0&&s1.length()==s2.length()){
            return true;
        }else if(s1.length()>0){
            String s=String.valueOf(s1.charAt(0));
            if(s2.contains(s)) {
                s1 = s1.replaceAll(s, "");
                s2 = s2.replaceAll(s, "");
                return areStrignAreEquealParams(s1, s2);
            }else{
                return false;
            }
        }
        return false;
    }

}





