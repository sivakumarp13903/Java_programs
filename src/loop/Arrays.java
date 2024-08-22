package loop;
import java.util.*;
public class Arrays {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size:\t\n");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int arr3[]=new int[n];
		System.out.print("Enter the array 1\n");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter the array 2\n");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}
}













/*Array => Collection of Object
         
		It has Similar datatype
		  int
		  float
		  double
		  String
		  character accessed with StringName.charAt(index)
		  
		  It contiguous memory
		  
		  Index start from 0 and end with n-1
		  n refers to the size the arry
		  
		  if access the 3rd 
		  
		  for instance the array size will be 5
		  
		  0    1    2	3	4
		  
		  Array immutable We cannot change the size of the array 
		  once one if you declare the size you cannot the change
		  =>  array_name[]
		  
		  
		  
		  Array Declaration
		  
		  Syntax:
		  
		  1 D Array
		  
		  int arry_name[size];
		  
		  
		  int[size] array_name;
		  
		  
		  
		  int array_name[]=new int[size];
		  
		  
		   int[] array_name=new int[size];
		   
		   
		   int arr_name[]={1,2,3,4,5};
		   
		   
		   finding array length means
		   
		   
		   array_name.length
		  */









