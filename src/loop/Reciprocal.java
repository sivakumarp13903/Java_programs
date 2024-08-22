package loop;
import java.util.Scanner;
public class Reciprocal {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        double sum = 0.0;
	        int num=sc.nextInt();
	        while (num > 0) {//123
	            int digit = num % 10; 
	            if (digit != 0) { 
	                sum += 1.0 / digit;
	            }
	            num /= 10; 
	        }
	        System.out.printf("%.4f",sum);
	        sc.close();
	    }
  
}
