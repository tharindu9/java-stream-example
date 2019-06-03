import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.*;
import java.util.stream.*;

public class F9Of {

    public static void main(String[] args) {

        Stream.of(1,2,3,5,8,5365,486,587,895).sorted().forEach(System.out::println);

        Stream.of("abc","bcg","abk").sorted().forEach(System.out::println);

        Integer[] integers = {1,2,5,2,6,4,8,2,1};

        Stream<Integer> streamInteger =  Stream.of(integers);
        streamInteger.sorted().forEach(System.out::println);


    }
}
