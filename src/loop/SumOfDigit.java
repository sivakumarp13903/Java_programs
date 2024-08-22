package loop;
import java.util.*;
public class SumOfDigit {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0,temp=0;
		while(a>0) {
			temp=a%10;
			sum=sum+temp;
			a=a/10;

			if(a==0 && sum>9) {
				a=sum;
				sum=0;
			}
		}
		System.out.print(sum+" ");
	}
}
