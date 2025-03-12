package practice.pro;

import java.util.ArrayList;

public class NumbOfPeopleInBus {

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10,0});
        list.add(new int[]{1,3});
        list.add(new int[]{2,5});
        list.add(new int[]{0, 2});

        System.out.println("num of people in the bus = " + numOfPeopleInBus(list));
    }

    public static int numOfPeopleInBus(ArrayList<int[]> busStops) {
        int people= 0;
        for (int[] busStop : busStops) {
            people += busStop[0]- busStop[1];
        }
        return people;
    }
}
