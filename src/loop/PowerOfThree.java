package loop;
import java.util.*;
public class PowerOfThree {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		boolean res=false;
		int a=sc.nextInt();
		 
		for(int i=1;i<a/2;i++) {
			if(Math.pow(i, 3)==a) {
				res=true;
			}
		}
		System.out.println(res);
	}

}
