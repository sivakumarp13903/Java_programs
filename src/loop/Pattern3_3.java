package loop;
import java.util.*;
public class Pattern3_3 {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}System.out.print("\n");
		}
		sc.close();
	}
}
