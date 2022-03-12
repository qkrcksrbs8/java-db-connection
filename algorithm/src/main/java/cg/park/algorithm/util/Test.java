package cg.park.algorithm.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    static int[] one = {1, 5, 10, 50, 100 ,500};
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static int toMoney (int money) {

        int quo = 0;// 몫
        int rem = 0;// 나머지
        int sum = 0;// 결과

        for (int cost : one) {
            quo = money % cost;
            rem = (money - quo) / cost;
            sum += map.get(cost) * rem;
            if (quo == 0) return sum;
        }
        return sum;
    }

    public static void setOneToCost (int[] costs) {
        map.put(one[0], costs[0]);
        map.put(one[1], costs[1]);
        map.put(one[2], costs[2]);
        map.put(one[3], costs[3]);
        map.put(one[4], costs[4]);
        map.put(one[5], costs[5]);
    }

    public static void main(String[] args) {
        int[] costs = {2, 11, 20, 100, 200, 600};
        int money = 4578;
        double x = 2 / 17;
        setOneToCost(costs);
        System.out.println(toMoney(money));
    }

}
