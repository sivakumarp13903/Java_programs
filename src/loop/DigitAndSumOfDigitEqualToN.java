package loop;
import java.util.*;
public class DigitAndSumOfDigitEqualToN {
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int sum=0,res=-1;
		for(int i=n;i>0;i--) {
			int num=i;
			sum=0;
			while(num>0) {
				int temp=num%10;
				sum=sum+temp;
				num=num/10;
				if(num==0) {
					res=sum+i;
					if(res==n) {
						System.out.print(i);
						return;
					}
				}
				if(i==1) {
					res=-1;
					System.out.print(res);
				}
			}
		}sc.close();
	}
}
