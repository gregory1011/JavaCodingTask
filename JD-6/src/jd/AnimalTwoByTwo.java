package jd;

import java.util.*;

public class AnimalTwoByTwo {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("Duck");
        animals.add("Duck");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");
        animals.add("Horse");


//        System.out.println(animalPairs(animals)); // time complexity O(n+n)
        System.out.println(animalPairs2(animals)); // time complexity O(n)
    }


    public static Map<String, Integer> animalPairs(List<String> animals) {

        if (animals.size() <= 1) return new HashMap<>();

        Map<String, Integer> map = new HashMap<>();
        for (String animal : animals) {
            map.put(animal, map.getOrDefault(animal, 0)+1);
        }

        HashMap<String, Integer> result = new HashMap<>();
        for(String pair : map.keySet()) {
            if ( map.get(pair) == 2 ) {
                result.put(pair, map.get(pair));
            }
        }

        return result;
    }


    public static Map<String, Integer> animalPairs2(List<String> list) {

        if(list.size() <= 1) return new HashMap<>();

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (String animal : list) {
            if(set.contains(animal)) {
                map.put(animal, 2);
            }
            set.add(animal);
        }

        return map;
    }




}
