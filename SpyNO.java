package SelfEvol;
import java.util.Scanner;
public class SpyNO {

	public static void main(String[] args) 
		{   
			int num, product=1, sum=0, lastdigit;  
			 
			Scanner sc = new Scanner(System.in);  
			System.out.print("Enter the number to check: " );  
			num=sc.nextInt();                                              //123
			while(num>0)  //we calculate sum and product of digit in while.
			{  
		         
			lastdigit=num%10; //finds the last digit of the number          // 3  //2  //1
			 
			sum=sum+lastdigit; //adds last digit to the variable sum        //0+3=3 //3+2=5//6
			
			 
			product=product*lastdigit; //calculates the product             //1*3=3 //3*2=6//6
			
			//removes the last digit from the given number  
			num=num/10;                                           //12   //1 
			}
			       //compares the sum and product  
			if(sum==product)                                                  // 6=6
				System.out.println("The given number is a spy number.");  
			else  
				System.out.println("The given number is not a spy number.");  
			}  
		}
	