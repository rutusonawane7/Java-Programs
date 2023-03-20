///////////////////////////////////////////////////////////////////
//
//		Display Fibonacci 
//
///////////////////////////////////////////////////////////////////
import java.lang.*;
import java.util.*;

class Number 
{
	 static int n3 = 0;
	 static int n1 = 1, n2 = 1;
	 
	 
	public void Fibo(int iNum)
	{
		int n1 = 1, n2 = 1, n3 = 0;
		
		System.out.print(n1+"\t"+n2);
		
		for(int i = 2; i < iNum; i++)
		{
			n3 = n1 + n2 ;
			
			System.out.print("\t"+n3);
			
			n1 = n2;
			n2 = n3;
		}
	}
	static void FiboR(int iNum)
	{
		  
		if(iNum > 0)
		{
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println(n3+"\t");
			
			FiboR(iNum - 1);
		}
	}
		
	
}
class Fibonacci
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iValue = sobj.nextInt();
		int n1 = 1, n2 = 1;
		System.out.println(n1+"\t"+n2);
		
		nobj.FiboR(iValue);
	}
}
