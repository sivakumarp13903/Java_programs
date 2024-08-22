package loop;
import java.util.*;
public class Primecheck {

			public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    int a=sc.nextInt();
		    int d;
		    boolean res;
		    int count=0,sum=0;
		    d=a;
		    for(int i=1;i<=a;i++){
		        if(a%i==0){
		            count++;
		        }
		    }
		    if(count==2){
		        res=true;
		        System.out.println(res);
		    }
		    else{
		        res=false;
		        System.out.println(res);
		    }
		}
}
