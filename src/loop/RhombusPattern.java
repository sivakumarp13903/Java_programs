package loop;

public class RhombusPattern {
	public static void main(String args[]) {
		int n=5;
		for (int i = 1; i <= n-2; i++) {
            // Print spaces
            for (int j =1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
		for (int i = n-3; i >= 1; i--) {
            // Print spaces
            for (int j =1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
