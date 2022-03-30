package SelfEvol;
//Q 2 wap to check whether a single digit number is automorphic number or not .
//automorphic number is number whose square ends with number itself  i.e  5 * 5 =25 
//if automorphic display "its automorphic number else not automorphic . 

import java.util.Scanner;
public class Automorphic {
     

	public static void main(String[] args)
	{
		 int num;  
	     Scanner sc = new Scanner(System.in);
	     System.out.println("ENTER NO TO CHECK IS IT  AUTOMORPHIC");
	     num=sc.nextInt();
	       
	     int square= num*num;
		 int lastdigit= (square%10);    //to find last digit of square
		 System.out.println( square);
		 System.out.println(lastdigit);
		if( num>0)   
	      {
			if (num%10==square%10)       //to compare  no last digit and sqare last digit.
	         System.out.println(" automorphic");
	         else 
	        	 System.out.println(" NOT automorphic");
	     
	       }

    }
}
