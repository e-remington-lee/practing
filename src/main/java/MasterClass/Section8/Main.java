package main.java.MasterClass.Section8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private int[] x;
    private static ArrayList<String> y = new ArrayList<String>();
    private static Object[] bob;

    public static void main(String[] args) {
        List<Object> namesList = Arrays.asList(1,2,"alex");
        ArrayList<Object> otherList = new ArrayList<>(namesList);
        namesList.stream().filter(y->!y.equals(1) && !y.equals(2)).forEach(otherList::add);
        System.out.println(otherList);

        ArrayList<Integer> xx = new ArrayList<Integer>();

        System.out.println(namesList.get(2));
        System.out.println(namesList.indexOf(2));

        Object[] list = new Object[otherList.size()];
        bob = otherList.toArray(new Object[otherList.size()]);
    }

//    public static int[] resize(int[] x, int y) {
//
//        int[] copy = x;
//
//        x = new int[copy.length+1];
//        for (int i=0;i<copy.length;i++){
//            x[i]= copy[i];
//        }
//        x[5] = y;
//        return x;
//    }

}
