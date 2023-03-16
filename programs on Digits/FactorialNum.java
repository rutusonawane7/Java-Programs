///////////////////////////////////////////////////////////////////////
//
//		Accept Number from user and Display Factorial of that Number
//
//////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public int Factorial(int iNum)
	{
		int iCnt = 0;
		int iFact = 1;
		for(iCnt = 1; iCnt <= iNum; iCnt++)
		{
			iFact = iFact * iCnt ;
		}
		return iFact;
	}
	
		
}
class FactorialNum
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		int iRet = 0;
		iRet = nobj.Factorial(iNo);
		System.out.println("Factorial of Number is "+iRet);
	}
}