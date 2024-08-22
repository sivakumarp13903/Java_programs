package loop;

public class InvertedHollowPrymid {
	public static void main(String arg[]) {
		int n=5;
		 for (int i = n; i >0; i--) {
             for (int j = i; j < n; j++) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= (2 * i - 1); k++) {
                 if (k == 1 || k == (2 * i - 1)||n==i) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
     }
	}

}
