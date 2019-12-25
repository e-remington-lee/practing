package main.java.MasterClass.Section8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private int[] x;
    private static ArrayList<String> y = new ArrayList<String>();
    private static Object[] bob;

    public static void main(String[] args) {
        List<Object> namesList = Arrays.asList(20);
        ArrayList<Object> otherList = new ArrayList<>(20);
        namesList.stream().filter(y->!y.equals(1) && !y.equals(2)).forEach(otherList::add);
        System.out.println(otherList);

        ArrayList<Integer> xx = new ArrayList<Integer>();

        System.out.println(namesList.get(2));
        System.out.println(namesList.indexOf(2));

        Object[] list = new Object[otherList.size()];
        bob = otherList.toArray(new Object[otherList.size()]);
    }


}
