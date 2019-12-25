package main.java.MasterClass.Section5;

import java.util.Scanner;

public class ControlFlow {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("year");
        Integer year = scanner.nextInt();

        scanner.nextLine();

        System.out.println("enter text");
        String name = scanner.nextLine();
        int x = 2018-year;
        System.out.println("Name: " +name+" Year: "+x);

        System.out.println("enter text");
        String name2 = scanner.nextLine();

        System.out.println(name2);

        scanner.close();
    }


}
