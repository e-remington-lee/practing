package main.java.Random;

import java.util.HashMap;
import java.util.Map;

public class abc {
    public static int[] answer(int[] list, int target) {

        Map<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < list.length; i++){
            int num = target - list[i];
            if (dict.containsKey(num)) {
                return new int[] {dict.get(num), i};
            } else {
                dict.put(list[i], i);
            }
        }
        throw new IllegalArgumentException("no solution");
    }
    public static void main(String[] args) {

        int[] li = {1, 2, 3};
        int target = 7;
        answer(li, target);
    }

}


