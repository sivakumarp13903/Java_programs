package loop;
import java.util.Scanner;
public class SelfDividing {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int count=0;
        int temp=n;
        while (temp>0) {
            if(n%(temp%10)!=0){
                count++;
            }
            temp/=10;
        }
        if (count==0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
