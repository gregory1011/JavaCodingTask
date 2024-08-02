package practice.Recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class practice {

    public static void main(String[] args) {



        // predicate interface, takes 1 argument and return boolean, calls test() method
        Predicate<String> str= s -> 5 > s.length();
        System.out.println(str.test("Hello"));

        Predicate<Integer> in = n -> n > 5;
        System.out.println(in.test(50));

        // Functional Interface, take 2 args, 1st is the input and 2nd is the return type, calls apply() method
        Function<String, Integer> on= s -> s.length();
        System.out.println(on.apply("Hello"));
        Function<Integer, Integer> mon= f -> f * 100;
        System.out.println(mon.apply(2));

        // Consumer Interface, takes one input, calls accept() method -> it returns void
        Consumer<Integer> con = n -> System.out.println(n* (n-1));
        con.accept(5);


        //Supplier Interface, it doesn't take any input arg, but it takes arg for return type
        Supplier<Integer> sup = () -> (5 * 100);
        System.out.println(sup.get());

        // Lambda expression () ->
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//        list.sort( (n1) -> n1+10);

        int a= 2;
        int b= 5;
//        (a, b) -> System.out.println(a+b);

        System.out.println();




    }

}
