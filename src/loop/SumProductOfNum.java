package loop;
import java.util.*;
public class SumProductOfNum {
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int product=1,sum=0;
		while(num>0) {
			int temp=num%10;
			sum=sum+temp;
			if(temp!=0)
			product=product*temp;
			num=num/10;
		}
		System.out.print("Sum = "+sum+"\nProduct = "+product);
		sc.close();
	}
}
