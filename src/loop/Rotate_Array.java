package loop;
import java.util.Scanner;
public class Rotate_Array {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int k=0;
		int rotated_arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int index=sc.nextInt();
		//index=index+1;
		for(int i=n-index;i<n;i++) {
			rotated_arr[k++]=arr[i];
		}
		for(int i=0;i<n-index;i++) {
			rotated_arr[k++]=arr[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(rotated_arr[i]+" ");
		}
		sc.close();
	}
}