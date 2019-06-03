import java.util.ArrayList;
import java.util.List;

public class Employee {

    String name;
    Integer marks;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name,Integer marks) {
        this.name = name;
        this.marks=marks;
    }



    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    @Override
    public String toString(){
        return  "name :" + name +  " marks :" +marks.toString();
    }

    public static List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tharindu",90));
        employees.add(new Employee("Hirushan",88));
        employees.add(new Employee("Lahu",95));
        employees.add(new Employee("Kasun",85));
        employees.add(new Employee("Sisira",98));
        employees.add(new Employee("Krishantha",91));
        employees.add(new Employee("Isuru",92));

        return employees;
    }
}
