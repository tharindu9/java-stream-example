public class F8Array {

    public static void main(String[] args) {

        Employee[] employees = Employee.getAllEmployees().stream().toArray(Employee[]::new);

    }
}
