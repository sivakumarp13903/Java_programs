package loop;
import java.util.*;
public class Duplictes_Array {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int Duplicate_arr[]=new int[20];
		int k=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					Duplicate_arr[k++]=arr[j];
				}
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(Duplicate_arr[i]+" ");
		}
	}
}
