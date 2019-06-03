import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class F2Process {

    public static void main(String[] args) {


        List<Employee> employees = Employee.getAllEmployees().stream().map(e -> new Employee(e.getName() ,
                e.getMarks()*2)).collect(Collectors.toList());

        List<Employee> employeeList1 = Employee.getAllEmployees().stream().filter(e->e.getName().contains("i"))
           .map(e->new Employee(e.getName() , e.getMarks()*2)).collect(Collectors.toList());

        System.out.println(employees);
       System.out.println(employeeList1);

        List<Student> studentList = Student.getAllstudents().stream()
                .filter(e->(e.getDate().getYear()- LocalDate.now().getYear())*-1 >18).collect(Collectors.toList());

        System.out.println(studentList);
    }
}
