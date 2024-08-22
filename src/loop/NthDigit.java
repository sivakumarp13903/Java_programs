package loop;

public class NthDigit {
    public static int findNthDigit(int n) {
        int digitLength = 1;
        long count = 9;
        int start = 1;

        // Find the range in which the nth digit falls
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Find the exact number that contains the nth digit
        start += (n - 1) / digitLength;
        String number = Integer.toString(start);
        int digitIndex = (n - 1) % digitLength;

        // Return the digit
        return Character.getNumericValue(number.charAt(digitIndex));
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println("The " + n + "th digit is: " + findNthDigit(n));
    }
}

