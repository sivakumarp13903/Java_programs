package loop;
import java.util.*;
public class Ascending_array {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Smalest Value"+arr[0]);
		System.out.println("Largest Value"+arr[n-1]);
		sc.close();
	}
}
