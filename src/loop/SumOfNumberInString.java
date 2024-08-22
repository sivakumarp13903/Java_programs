package loop;

public class SumOfNumberInString {

    public static int sumOfNumbers(String s) {
        int sum = 0;
        int currentNumber = 0;
        boolean isNumber = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
                isNumber = true;
            } else {
                if (isNumber) {
                    sum += currentNumber;
                    currentNumber = 0; 
                    isNumber = false;
                }
            }
        }

        if (isNumber) {
            sum += currentNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers("1abc23"));   
    }
}
