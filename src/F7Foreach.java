import java.util.Comparator;
import java.util.EventObject;
import java.util.List;

public class F7Foreach {

    public static void main(String[] args) {

//        Employee.getAllEmployees().forEach(e->
//               // System.out.println(e.getName()));

        Employee.getAllEmployees().stream().filter(e->e.getName().length()>=5)
                .map(e->new Employee(e.getName().substring(0,1).toUpperCase().concat(e.getName().substring(1)),e.getMarks()))
                .sorted(Comparator.comparing(Employee::getName).reversed()).
                forEach(System.out::println);
    }
}
