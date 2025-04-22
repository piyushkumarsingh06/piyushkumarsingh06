package Day2.BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of two");
        }
    }
}
