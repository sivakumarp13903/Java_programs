package loop;
import java.util.*;
public class IntegerToRoman {
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		if(num>=1 && num<=3999) {
			String M[] = {"", "M", "MM", "MMM"};
		    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		    System.out.print(M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10]);
		}
		else {
			System.out.print("Invalid Input");
		}
		sc.close();
	}
}
