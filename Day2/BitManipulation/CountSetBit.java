package Day2.BitManipulation;

public class CountSetBit {
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29; // 11101
        System.out.println("Set bits in " + number + ": " + countSetBits(number));
    }

}
