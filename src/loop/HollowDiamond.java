package loop;

import java.util.Scanner;

public class HollowDiamond {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j==n+1||j-i==n-1||i==n)
					System.out.print("*");
				else
					System.out.print(" ");		
				}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j==n+1||j-i==n-1||i==n)
					System.out.print("*");
				else
					System.out.print(" ");		
			}
			System.out.println();
		}
	}
}

