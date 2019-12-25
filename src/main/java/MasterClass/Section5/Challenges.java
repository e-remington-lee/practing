package main.java.MasterClass.Section5;

import java.util.ArrayList;
import java.util.List;

public class Challenges {

    public static void main(String[] args) {

        System.out.println(sharedDigit(11,20));

    }

    public static boolean sharedDigit(int num1, int num2) {
        if (num1 > 99 || num1 < 10 || num2 > 99 || num2 < 10) {
            return false;
        }

        int x = num1%10;
        int x2 = num1/=10;
        int y = num2%10;
        int y2 = num2/=10;

        if (x == y || x == y2 || x2 == y || x2 == y2) {
            return true;
        }
        return true;
    }

    public static int sumEven2(int num){
        int sum = 0;
        do {
            if (isEven(num%10)) {
                sum+=num%10;
            }
            num/=10;
        } while (num!=0);
        return sum;
    }

    public static boolean isEven(int num) {
        return num%2==0;
    }


    public static int sumDigits2(int num) {
        int first = num%10;
        do {
            num /= 10;
        } while (num>=10);
        return num+first;
    }

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int a = num;
        while (num!=0){
            reverse*=10;
            reverse+=num%10;
            num/=10;
        }
        return a == reverse;
    }

    public static Integer sumDigits(int num){
        if (num<10) {
            return -1;
        }
        int sum = 0;
        while (num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }

    public static List countEven(){
        int count = 0;
        int total = 0;
        List array = new ArrayList();
        while (total < 5) {
            count++;
            if (count%2==1){
               continue;
            }
            total+=1;
            array.add(count);
        }
        return array;
    }

    public static void countOdd(){
        int count = 0;
        int total = 0;
        while (total < 5){
            count++;
            if (!isOdd(count)){
                continue;
            }
            total++;
        }
        System.out.println(total);
    }

    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
        int ans = number%2;
        return ans == 1;
    }

    public static boolean sumOdd(int start, int end) {
        for (int i=start; i<end; i++) {
            int ans = i%2;
            return i == 1;
        }
        return false;
    }

}





