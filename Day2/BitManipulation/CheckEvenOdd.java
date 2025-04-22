package Day2.BitManipulation;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void CheckEvenOdd(int num) {
        if ((num & 1) == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " 3is odd");
            ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CheckEvenOdd(num);
    }
}
