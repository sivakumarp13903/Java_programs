package loop;

import java.util.Scanner;

public class PrimePair {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int start=sc.nextInt();
	    int end=sc.nextInt();
	    int d=0,c=0;
	    int arr[]=new int[end];
	    int count=0,sum=0;
	    for(int k=start;k<=end;k++) {
	    	count=0;
	    	for(int i=1;i<=k;i++){
		        if(k%i==0){
		            count++;
		        }
		    }
		    if(count==2){
		        arr[d++]=k;
		    }
	    }
	    for(int i=0;i<d;i++) {
	    	for(int j=i+1;j<d;j++) {
	    		if(arr[j]-arr[i]==6) {
	    			c++;
	    		}
	    	}
	    }
	    System.out.print(c);
	    sc.close();
	}
}
