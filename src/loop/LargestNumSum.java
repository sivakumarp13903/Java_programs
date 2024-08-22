package loop;
import java.util.*;
public class LargestNumSum {
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		int s=sc.nextInt();
		int d=sc.nextInt();
		int sum=0,op=0;
		int range=((int)Math.pow(10, d))-1;
		for(int i=range;i>0;i--) {
			int num=i;
			while(num>0) {
				int temp=num%10;
				sum=sum+temp;
				num=num/10;
				if(sum==s && num==0) {
					
					op=i;
					System.out.print(op);
					return;
				}
				if(num==0) {
					sum=0;
				}
			}
			
		}
	}
}
