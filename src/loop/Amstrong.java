package loop;

import java.util.*;
import java.lang.*;
public class Amstrong
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int c,d;
	    boolean res;
	    int temp=0,count=0,sum=0;
	    c=a;
	    d=a;
	    while(c!=0){
	        temp=c%10;
	        count++;
	        c=c/10;
	    }
	    while(d!=0){
	        temp=d%10;
	        sum+=(Math.pow(temp,count));
	        d=d/10;
	    }
	    if(a==sum){
	        res=true;
	        System.out.println(res);
	    }
	    else{
	        res=false;
	        System.out.println(res);
	    }
	}
}