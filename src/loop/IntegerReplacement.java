package loop;

public class IntegerReplacement {

    public static void main(String[] args) {
        int n = 8 ;
        int count = 0;
        long num = n; 

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
            	num--;
                }
            count++;
        }
        System.out.println("Minimum number of replacements needed to reduce " + n + " to 1 is: " + count);
    }
}
