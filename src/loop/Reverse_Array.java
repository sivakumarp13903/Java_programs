package loop;
import java.util.*;
public class Reverse_Array {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n-1;
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[k--]=arr1[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
		sc.close();
	}
}
