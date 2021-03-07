package automation;

import java.util.Arrays;
import java.util.Scanner;

//read this way row increasing then i++,if column increasing then j++, space incre then k++
//if column decreasing then after each row the j--, space dec after each row then k-- 

/*public class Pattern {
 
	
	public static void main(String args[]) 
    { 
       
   //    Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter the number of rows: ");
	 
	//    int rows = sc.nextInt(); 
       
        for(int i=0; i<5; i++) // for row
            {           
            
            for(int j=0; j<=i; j++) //  inner loop for columns
            {     
            	
                System.out.print("* "); // print star
            }   
            
            System.out.println(); // ending line after each row
        } 
        
    //    sc.close();
    } */

/*// output
*
* *
* * *
* * * **/


//2nd
/*public class Pattern {

public static void main(String args[]) 
{ 
       int num =10, row =4;
       
        for(int i=1; i<=row; i++) // for row
            {           
            
            for(int j=1; j<=i; j++) //  inner loop for columns
            {     
            	
                System.out.print(num+ " "); 
                num--;
            }   
            
            System.out.println(); // ending line after each row
        } 
}	
}*/

/*output
10 
9 8 
7 6 5 
4 3 2 1 
*/


// read this way if row increasing then i++, if column increasing then j++
// if space use k
//3rd read this way
/*public class Pattern {

	public static void main(String args[]) 
    { 
		
	       int i, j, row= 5;
	       
	        for( i=1; i<=row; i++) // for row
	            {           
	            
	            for( j=row; j>=i; j--) //  inner loop for columns
	            {     
	            	
	                System.out.print("*"); 
	              
	            }   
	            
	            System.out.println(); // ending line after each row
	        } 
	    }  
}*/
/*output
*****
****
***
**
*/


//4th read this way
/*public class Pattern {

	public static void main(String args[]) 
    { 
		
	       int i, j, row= 4, num=10;
	       
	        for( i=1; i<=row; i++) // for row
	            {           
	            
	            for( j=row; j>=i; j--) //  inner loop for columns
	            {     
	            	
	                System.out.print(num+ " "); 
	                num--;
	            }   
	            
	            System.out.println(); // ending line after each row
	        } 
	    }  
}
*/
/*//output
10 9 8 7 
6 5 4 
3 2 
1 */



//read this way row increasing then i++,if column increasing then j++, space incre then k++
//if column decreasing then after each row the j--, space dec after each row then k-- 

//5th - read this way
/*public class Pattern {

	public static void main(String args[]) 
    { 
		
	       int i, j, k, row= 5, num=10;
	       
	        for( i=1; i<=row; i++) // for row
	            { 
	        	
	        	for (k=row; k>=i; k--)         
				{  
					System.out.print(" ");   
				}   
	            
	            for( j=1; j<=i; j++) //  inner loop for columns
	            { 
	               System.out.print("*");  
	            }   
	            	            
	         System.out.println(); // ending line after each row
	        } 
	    }  
}*/
/*	
output
     *
    **
   ***
  ****
 *****
 */


//6th
/*public class Pattern {

	public static void main(String args[]) 
    { 
		//will work for 4 row and num-10 for more row and num need to chnage k,j loop also
		int i, j, k, row = 4, num=10;     
		
		for (i=0; i<row; i++)   //Outer loop work for rows  
		{  
			for (k=row; k>=i; k--)         
			{  
				System.out.print(" ");   
			}   
	
			for (j=0; j<=i; j++ )   
			{        
				System.out.print(num);   
				num--;
			}  
			
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   

    }	
}*/

/*output
    10
   98
  765
 4321
*/






//dont read this way below is another way
/*public class Pattern {

	public static void main(String args[]) 
    { 
		   
		
		int i, j, k, rows = 10;
	    for ( i= rows; i>=1; i--)
	    {
	        for ( k=rows; k>=i; k--)
	        {
	            System.out.print(" ");
	        }
	        for (j=1; j<=i; j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	
	}
}*/


/*output
*****
 ****
  ***
   **
    *
*/

//dont read this 2nd way. in below 7th number have some diff way 
/*	
		int i, j, k, rows = 5;
	    for ( i= 1; i<= rows ; i++)
	    {
	        for ( k=1; k<=i; k++)
	        {
	            System.out.print(" ");
	        }
	        for (j=1; j<=rows-i; j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();

}*/
  


/*output

 ****
  ***
   **
    *

*/


//7th -  3rd way- read this
/*public class Pattern {

	public static void main(String args[]) 
    { 
		
		int i, j, k, rows = 10;
	    for ( i= 1; i<= rows ; i++)
	    {
	        for ( k=1; k<=i; k++)
	        {
	            System.out.print(" ");
	        }
	        for (j=rows; j>=i; j--)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	 
	}
}*/
/*
output
****
 ***
  **
   *
*/




// 8th
/*public class Pattern {

	public static void main(String args[]) 
    { 
		
	
	       int i, j, k, row= 4, num=10 ;
	       
	        for( i=1; i<=row; i++) // for row
	          {           
	        	for ( k=1; k<=i; k++)
		        {
		            System.out.print(" ");
		        }
		        for (j=row; j>=i; j--)
		        {
		            System.out.print(num); // num or "1" or "*"
		            num--;
		        }  
	            
	            System.out.println(); // ending line after each row
	        } 
	    }  
}*/


/*output
10987
  654
   32
    1
*/




//9th
/*public class Pattern {

	public static void main(String args[]) 
    { 
		
	//	give num = 2,3,4,5,6 any number to print below pattern
	       int i, j, k, row= 5, num=1 ;
	       
	        for( i=1; i<=row; i++) // for row
	          {           
	        	for ( k=row; k>=i; k--)
		        {
		            System.out.print(" ");
		        }
		        for (j=1; j<=i; j++)
		        {
		            System.out.print(num); // num or "1" or "*"
		            
		        }  
	            
	            System.out.println(); // ending line after each row
	        } 
	    }  
}*/

/*output
     1
    11
   111
  1111
 11111
*/
 


//10th half top pyramid
/*public class Pattern {

	public static void main(String args[]) 
  { 
		
	//	give num = 2,3,4,5,6 any number to print below pattern
	       int i, j, k, row= 8, num=1 ;
	       
	        for( i=1; i<=row; i++) // for row
	          {           
	        	for ( k=row; k>=i; k--)
		        {
		            System.out.print(" ");
		        }
		        for (j=1; j<=i; j++)
		        {
		        	   // one space after star to print like pyramid pattern
		            System.out.print(num +" "); // num or "1" or "*"      
		        }  
	            
	            System.out.println(); // ending line after each row
	        } 
	    }  
}
*/

/*output

    1 
   1 1 
  1 1 1 
 1 1 1 1 
1 1 1 1 1 
*/

//11th  half pyramid   // one space after star to print like pyramid pattern

/*
public class Pattern {

	public static void main(String args[]) 
    { 
		
		int i, j, k, rows = 10;
	    for ( i= 1; i<= rows ; i++)
	    {
	        for ( k=1; k<=i; k++)
	        {
	            System.out.print(" ");
	        }
	        for (j=rows; j>=i; j--)
	        {
	         // one space after star to print link pyramid pattern
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	 
	}
}*/

/*output
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
*/




//full pyramid to make this join 10th,11th loops code 
//in this output of mid 2 line will same width to chnage that start 2nd loop from row 1 extra and extra space


/*public class Pattern {

	public static void main(String args[]) 
    { 
		
	//	give num = 2,3,4,5,6 any number to print below pattern
	       int i, j, k, row= 6, num=1 ;
	       
	        for( i=1; i<=row; i++) // for row
	          {           
	        	for ( k=row; k>=i; k--)
		        {
		            System.out.print(" ");
		        }
		        for (j=1; j<=i; j++)
		        {
		        	   // one space after star to print like pyramid pattern
		            System.out.print("* "); // num or "1" or "*"      
		        }  
	            
	            System.out.println(); // ending line after each row
	        } 
	        
	              		
	        //		int i, j, k, row = 5;
	 
	        	    for ( i= 1; i<= row ; i++)
	        	    {
	        	        for ( k=1; k<=i; k++)
	        	        {
	        	            System.out.print(" ");
	        	        }
	        	        for (j=row; j>=i; j--)
	        	        {
	        	         // one space after star to print link pyramid pattern
	        	            System.out.print("* ");
	        	        }
	        	        System.out.println();
	        	    }
	        	 
	        	}
	        }
	        */

/*output
	* 
   * * 
  * * * 
 * * * * 
* * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    */



public class Pattern {

	public static void main(String args[]) 
    { 
		
	//	give num = 2,3,4,5,6 any number to print below pattern
	       int i, j, k, row= 6, num=1 ;
	       
	        for( i=1; i<=row; i++) // for row
	          {           
	        	for ( k=row; k>=i; k--)
		        {
		            System.out.print(" ");
		        }
		        for (j=1; j<=i; j++)
		        {
		        	   // one space after star to print like pyramid pattern
		            System.out.print(j+" "); // num or "1" or "*"      
		        }  
	            
	            System.out.println(); // ending line after each row
	        } 
	        
	        
	        
	        
	        for( i=row-1; i>=1; i--) // for row
	          {           
	        	for ( k=row; k>=i; k--)
		        {
		            System.out.print(" ");
		        }
		        for (j=1; j<=i; j++)
		        {
		        	   // one space after star to print like pyramid pattern
		            System.out.print(j+" "); // num or "1" or "*"      
		        }  
		        
		        System.out.println();
	          }
	       
	      }
	  }
		        
	        
	              		
	       /* //		int i, j, k, row = 5;
	 
	        	    for ( i= 1; i<= row ; i++)
	        	    {
	        	        for ( k=1; k<=i; k++)
	        	        {
	        	            System.out.print(" ");
	        	        }
	        	      //  for (j=row; j>=i; j--)
	        	          for (j=1; j<row; j++)
	        	        {
	        	         // one space after star to print link pyramid pattern
	        	            System.out.print(j+" ");
	        	        }
	        	        System.out.println();
	        	    }
	        	 
	        	}
	        }
	        
*/
