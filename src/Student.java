import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Student {

    String name;
    LocalDate date ;


    public Student(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public static List<Student> getAllstudents(){
        List<Student> sList = new ArrayList<>();


        sList.add(new Student("Tharindu" ,  LocalDate.of(1994,9,9)));
        sList.add(new Student("Chethiya" ,  LocalDate.of(2012,9,9)));
        sList.add(new Student("Sahan" ,  LocalDate.of(1998,9,9)));

        sList.add(new Student("Kasun" ,  LocalDate.of(2013,9,9)));
        sList.add(new Student("Chamila" ,  LocalDate.of(1994,9,9)));
        sList.add(new Student("Harshana" ,  LocalDate.of(1992,9,9)));


        return sList;

    }

    @Override
    public  String toString(){
        return  "name " + name + " date " + date;
    }

}
