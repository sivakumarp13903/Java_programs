package loop;

public class Missing_Array
{
    
    public static void main(String arg[])
    {
      	int a[ ] = {1, 2, 4, 5, 6};
      	int i, total;
      	int n=a.length;
     	total  = (n + 1) * (n + 2) / 2;
     	for ( i = 0; i < n; i++) {
     		total -= a[i];
     	}
      	System.out.println("The number missing is :"+total);
    }
}