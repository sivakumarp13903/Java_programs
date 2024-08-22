package loop;
import java.util.*;
public class Break_Continue {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		
		
		
		/*int x=sc.nextInt();
		int y=sc.nextInt();
		double num=0.5;
		double sum=0.5;
		
		for(int i=1;i<Math.abs(y);i++) {
			sum=sum*num;
		}
		System.out.print(sum);*/
		
		// IP = 3    123 45 24     op = 6,9,4
		/*int n=sc.nextInt();
		int arr[]=new int[n];
		int arr_sum[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=0;
			arr[i]=sc.nextInt();
			while(arr[i]>0) {
				sum=sum+arr[i]%10;
				arr[i]=arr[i]/10;
				if(arr[i]==0) {
					System.out.print(sum+" ");;
				}
			}
		}*/
		
		String str = "abc";
        generatePermutations(str, "");
    }

    public static void generatePermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, permutation + ch);
        }
		
	}

}
