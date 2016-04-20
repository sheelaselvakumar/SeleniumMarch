package week1;

public class Fibonacci

{

	public static void main(String[] args)
	
	{
		double first,second,fibonext;//declaring variables
		first=0; //initializing variables
		second=1;
		fibonext=1;	
		for(int i=1;i<=100;i++)//print first 100 fibonacci number by looping 100 times
		{
			if(i==1)
				System.out.println(fibonext);//print first number of fibonacci
			
			else
			{
				fibonext=first+second;
				//fibonext will always be the sum of two variables first 
				//and the second position from fibonext
				first=second;
				second=fibonext;
				if(fibonext<=100)
				System.out.println(fibonext);
			}
		}

	}

}
