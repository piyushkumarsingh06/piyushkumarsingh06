package Day2.BitManipulation;

public class FindUnique {
    static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 5, 3, 4 };
        System.out.println("Unique element is: " + findUnique(arr));
    }

}
