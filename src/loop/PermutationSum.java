package loop;

public class PermutationSum {
	static int sum=0;
	   // Function to swap characters at position i and j in a string
    static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    // Function to generate all permutations of the string
    static void permute(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
            int temp=Integer.parseInt(str);
            sum=sum+temp;
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i); // Backtrack to restore the original string
            }
        }
    }

    // Main method
    public static void main(String[] args) {
    	
    	
        int num=123;
        String str = Integer.toString(num);
        int n = str.length();
        permute(str, 0, n - 1);
        System.out.println("Sum = "+sum);

    }
}
