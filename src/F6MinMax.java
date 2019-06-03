import java.util.Comparator;
import java.util.Optional;

public class F6MinMax {

    public static void main(String[] args) {

        Optional<Employee> minEmployee= Employee.getAllEmployees().stream().min(Comparator.comparing(Employee::getMarks));
        System.out.println("minimum mark of employee"+minEmployee.get());

        Optional<Employee> maxEmployee= Employee.getAllEmployees().stream().max(Comparator.comparing(Employee::getMarks));
        System.out.println("minimum mark of employee"+maxEmployee.get());
    }
}
