package loop;

public class PyramidPattern {
    public static void main(String[] args) {
        int n = 4; 
        for (int i = 1; i < n-1; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");  
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");  
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

