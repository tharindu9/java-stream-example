import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class F10MapSort {

    public static void main(String[] args) {

        Map<String , Integer> students = new HashMap<>();

        students.put("krish",100);
        students.put("tharindu",60);
        students.put("chethiya",50);
        students.put("kasun",44);
        students.put("ishan",85);

        int passMark = 59;
//Bad Way
      students.entrySet().stream().filter(s->s.getValue()>=passMark)
              .sorted((s1,s2)->-s1.getValue().compareTo(s2.getValue())).collect(Collectors.toList())
              .stream().forEach(s-> System.out.println(s.getKey()));

      //Good way

        List<String> studentName = new ArrayList<>();

        students.entrySet().stream().filter(s->s.getValue()>=passMark)
                .sorted((s1,s2)->-s1.getValue().compareTo(s2.getValue()))
                .peek(s->studentName.add(s.getKey())).collect(Collectors.toList());

   //     System.out.println(studentName);


        Map<Integer , String> vehicles = new HashMap<>();

        vehicles.put(10,"Car");
        vehicles.put(50,"Suv");
        vehicles.put(20,"Jeep");
        vehicles.put(12,"Bus");
        vehicles.put(15,"Ship");
        vehicles.put(16,"Lorry");
        vehicles.put(4,"Cycle");

//need two list , key must be desending order values except ship in assending
List<Integer> keys = new ArrayList<>();
List<String> values = new ArrayList<>();
        vehicles.entrySet().stream().sorted((v1,v2)->-v1.getKey().compareTo(v2.getKey()))
                .peek(v->keys.add(v.getKey())).collect(Collectors.toList())
                .stream().filter(v1->v1.getKey()!=15).sorted((v1,v2)->v1.getValue().compareTo(v2.getValue()))
                .peek(vv->values.add(vv.getValue())).collect(Collectors.toList());

        System.out.println(values);
        System.out.println(keys);



    }


}
