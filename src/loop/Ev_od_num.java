package loop;
import java.util.Scanner;
public class Ev_od_num {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n];
		int first=0;
		int last=n-1;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				arr2[first++]=arr[i];
			}
			else {
				arr2[last--]=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
		sc.close();
	}
	
}
