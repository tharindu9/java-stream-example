import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F5Sort {

    public static void main(String[] args) {

        List<Employee> sortedEmpList = Employee.getAllEmployees().stream()
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

        System.out.println("Based on name "+sortedEmpList);


        List<Employee> sortedEmpList1 = Employee.getAllEmployees().stream()
                .sorted(Comparator.comparing(Employee::getMarks)).collect(Collectors.toList());

        System.out.println("Based on marks "+sortedEmpList1);

        //without comparitor

        List<Employee> sortedEmpList2 = Employee.getAllEmployees().stream()
                .sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());

        System.out.println("Without comparitor  "+sortedEmpList2);


        List<Employee> sortedEmpList3 = Employee.getAllEmployees().stream()
                .sorted((e1,e2)->new Integer(e1.getName().length()).compareTo(e2.getName().length()))
                .collect(Collectors.toList());

        System.out.println("Based on number of characters "+sortedEmpList3);

    }
}
