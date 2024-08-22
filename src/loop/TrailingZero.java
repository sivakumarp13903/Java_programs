package loop;

public class TrailingZero {
    public static int trailingZeroes(int n) {
        int count = 0;
        // Iterate through the powers of 5
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println("Number of trailing zeroes in " + n + "! is: " + trailingZeroes(n));
    }
}