package loop;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        scanner.close();

        int pascal[][] = new int[n][n];

        // Initialize the first row
        for (int i = 0; i < n; i++) {
        	for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                // First and last values in every row are 1
                if (i == j || j == 0) {
                    pascal[i][j] = 1;
                } else {
                    // Other values are sum of values just above and left of above
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}

