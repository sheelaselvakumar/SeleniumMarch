/**
 * 
 */
package week1;

import java.util.Scanner;

/**
 * @author Sheela
 *
 */
public class Prime 
{
	
	public static void main(String[] args)
	
	{
//Get input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number greater than two");
		int num= sc.nextInt();//get the num from user
		int i=2;
		for(i=2;i<=10;i++)//loop to check if the number is divisible from 2 to 10
		{
			if(num%i==0&&num!=i)//number divisible by 2 to 10 && by itself
			{
				System.out.println("given number"+num+"is not prime");
				break;//no need to check if its a prime further
			}
			if(i==10)
			{
				System.out.println("number"+num+"is prime");
			}
		}	
	}
	}
			
	

		
