import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E1Filter {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tharindu",90));
        employees.add(new Employee("Hirushan",88));
        employees.add(new Employee("Lahiru",95));
        employees.add(new Employee("Kasun",85));
        employees.add(new Employee("Sisira",98));
        employees.add(new Employee("Krishantha",91));
        employees.add(new Employee("Isuru",92));

        List<Employee> employeeList = employees.stream().filter(emp->emp.getName().length()>5).collect(Collectors.toList());

      //  System.out.println(employeeList);
    }
}
