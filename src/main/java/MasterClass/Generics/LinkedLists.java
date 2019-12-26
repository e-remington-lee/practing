package main.java.MasterClass.Generics;

import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("f");
        ll.add("e");
        ll.add("d");

        addOrder(ll, "z");
        addOrder(ll, "z");
        addOrder(ll, "a");
        addOrder(ll, "b");
        addOrder(ll, "c");

        Iterator i2 = ll.iterator();
        while(i2.hasNext()) {
            System.out.println(i2.next());
        }

//        for (String s : ll){
//            System.out.println(s);
//        }
    }

    private static boolean addOrder(LinkedList<String> ll, String f) {
        ListIterator<String> i = ll.listIterator();
        while(i.hasNext()) {
            int compare = i.next().compareTo(f);
            if (compare == 0) {
                System.out.println("already taken...");
                return false;
            } else if (compare < 0) {
                i.previous();
                i.add(f);
                System.out.println("added "+f);
                return true;
            } else if (compare > 0) {
            }
        }
        if (!i.hasNext()) {
            i.add(f);
        }
        return false;
    }

    private static void printL(LinkedList<String> ll) {
        Iterator<String> i = ll.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
