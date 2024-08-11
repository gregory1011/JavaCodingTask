package practice.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {

    public static void main(String[] args) {


        List<Integer> nums= Arrays.asList(10,2,2,4,8,8,4,11,66,7,8,1);
        List<Integer> collect1 = nums.stream().map(n -> n * n).collect(Collectors.toList());
//        collect1.stream().sorted().reduce()

        List<Integer> collect = nums.stream().sorted().collect(Collectors.toList());
        Stream<Integer> sorted = nums.stream().sorted();
        System.out.println(sorted.collect(Collectors.toList()));
        System.out.println(collect);

        String g= "023";
        System.out.println(Integer.parseInt(g));
        // reference static method
        Function<String, Integer> fm= str -> Integer.parseInt(str);
        System.out.println(fm.apply("123"));
        System.out.println(fm.apply(g));

        // method reference, (using lambda static method)
        Function<String, Integer> gm= Integer::parseInt;
        System.out.println(gm.apply("456"));

        Function<String, Integer> hh= String::length;
        System.out.println(hh.apply("Home"));

        //lambda using constructor
        Function<String, StringBuilder> jj= StringBuilder::new;
        System.out.println(jj.apply("Hello"));
    }
}
