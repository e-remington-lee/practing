package main.java.Random;

public class LongestPrefix {

    public static void main(String[] args) {

        String[] list = {"flower", "flight", "fight"};
        System.out.println(answer(list));

    }

    public static String answer(String[] str){
        String firstString = str[0];
        System.out.println(firstString);
        // check each string against the first string, compare indexes
        for (int i = 1; i<str.length; i++) {
            StringBuilder sb = new StringBuilder(str[i]);
            System.out.println(sb);
        }
        return "bob";
    }

}
