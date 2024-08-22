package loop;
import java.util.*;
public class NSEW {
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		int x=0,y=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='N') {
				y++;
			}
			else if(str.charAt(i)=='S') {
				y--;
			}
			else if(str.charAt(i)=='E') {
				x++;
			}
			else if(str.charAt(i)=='W') {
				x--;
			}
		}
		if(x==0 && y==0) {
			System.out.print("Sucess");
		}
		else {
			System.out.print("Fail");
		}
		sc.close();
	}
}
