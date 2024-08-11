package practice.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerFunction {


    public static void main(String[] args) {


        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Consumer<Integer> print= n -> System.out.println(n+n+"->");
//        System.out.println(print.getClass());

        nums.forEach(print);

        Supplier<Integer> modify= ()-> nums.get(2);
        System.out.println(modify.get());

//        Comparator<Integer>


    }

}
