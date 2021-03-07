package automation;

import java.util.Scanner;
import java.util.Arrays;   

//array

/*public class Practice {

    public static void main(String[] args) {  
         
        for (int i = 1; i <=10; i++) {  
          //  System.out.print(i + " ");  - in same line 
            
         //   System.out.println(i + " ");  //1way- to print in new line
            System.out.print("\n " + i); //2way-to print in new line
        }  
    }  	
}*/


// print 1-5 by using array
/*public class Practice {

	    public static void main(String[] args) {  
	        //Initialize array  
	        int [] arr = new int [] {1, 2, 3, 4, 5};  
	        System.out.println("Elements of given array: ");  
	        //Loop through the array by incrementing value of i  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	    }  	
}*/



//Java Program to Print Array Elements using For Loop

/* public class Practice {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int i, Number;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Number = sc.nextInt();	
		
		int [] Array = new int[Number];
		
		System.out.print(" Please Enter " + Number + " elements of an Array  : ");
		for (i = 0; i < Number; i++)
		{
			Array[i] = sc.nextInt();
		}     
	 
		System.out.println("\n **** Elements in this Array are  **** ");
		for (i = 0; i < Number; i++)
		{
			System.out.print(Array[i] + "\t");
		}
	}
}*/


//sort an array using the sort() method of the Arrays class.
/*public class Practice  
{   
	public static void main(String[] args)   
	{   
		//defining an array of integer type   
		int [] ia = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(ia);   
		System.out.println("Elements of array sorted in ascending order: ");  
//		System.out.println(ia); //it print this - [I@15db9742
 
		//prints array using the for loop  
		System.out.println(ia[0]);  
		System.out.println(ia[1]);  
		System.out.println(ia[2]);
		System.out.println(ia[3]); 
		//tiil ia[7] instead of doing 1by 1 using for loop
		
		
		for (int i = 0; i<ia.length; i++)   
		{       

			System.out.println(ia[i]);   
		}  
	}  
}  
*/


/*//A string array can be initialized by using:

//inline initialization
String[] stringArray1 = new String[] {"R","S","T"};
String[] stringArray2 = {"R","S","T"};
//initialization after declaration
String[] stringArray3 = new String[3];
stringArray3[0] = "R";
stringArray3[1] = "S";
stringArray3[2] = "T";*/

/*public class Practice  
{   
	public static void main(String[] args)   
	{   
		//defining an array of string type   
	
		String[] sa = {"R","Q", "w"};
		//iterating all elements in the array
		for (int i = 0; i < sa.length; i++) {
		System.out.print(sa[i]);
		}
		
	}	
}  */

/*// print 1stLargestNumberInAnArray
public class Practice {
	   public static void main(String args[]){
	      int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      //int [] ia  = {10, 20, 25, 63, 96, 57};
	      //int []array  = {10, 20, 25, 63, 96, 57};  // user can write any of way
	       
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println(" largest number is:: " +array[size-1]);
	   }
	}*/



// print 2nd tLargestNumberInAnArray  1st way
/*public class Practice {
	   public static void main(String args[]){
	      int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("second largest number is:" +array[size-2]);
	   }
	}*/



//print 2nd tLargestNumberInAnArray 2nd way using sort method
/*public class Practice { 

	public static void main(String args[]){
		int array[] = {10, 20, 25, 63, 96, 57};
		int size = array.length;

		Arrays.sort(array);
		for (int i = 0; i < size; i++)   
		{       

			System.out.println(array[i]);   
		}  
		
	//The java.util.Arrays.toString(int[]) method returns a string representation of the contents of the specified int array. 
		//The string representation consists of a list of the array's elements, enclosed in square brackets ("[]").
		//Adjacent elements are separated by the characters ", " (a comma followed by a space).

		// below is to print arrays element in string
		System.out.println("sorted Array ::"+Arrays.toString(array));
		int res = array[size-2];
		System.out.println("2nd largest element is:" +res);
	}
}*/



//ThirdLargestNumberInAnArray

/*public class Practice { 

	public static void main(String args[]){
		int array[] = {10, 20, 25, 63, 96, 57};
		int size = array.length;

		Arrays.sort(array);
		for (int i = 0; i < size; i++)   
		{       

			System.out.println(array[i]);   
		}  
		
		int res = array[size-3];
		System.out.println("3rd largest element is:" +res);
	}
}*/


public class Practice { 

	public static void main(String args[]){
		int [] ia  = {10, 20, 25, 63, 96, 57};
		int size = ia.length;

		Arrays.sort(ia);
		for (int i = 0; i < size; i++)   
		{       

			System.out.println(ia[i]);   
		}  
		
		// below is to print arrays element in string
	//	System.out.println("sorted Array ::"+Arrays.toString(ia));
		int res = ia[size-3];
		System.out.println("3rd largest element is:" +res);
	}
}
