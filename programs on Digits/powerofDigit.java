/////////////////////////////////////////////////////////////////////////////
//
//		Write a program to perform Power of the Number
//
//////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number 
{
	public int Power(int iNum1, int iNum2)
	{
		int iCnt = 0;
		int iMult = 1;
		
		for(iCnt = 1; iCnt < iNum2; iCnt++)
		{
			iMult = iMult * iNum1;
		}
		return iMult;
	}
}

class powerofDigit
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Base ");
		int iBase = sobj.nextInt();
		
		System.out.println("Enter Power ");
		int iPower = sobj.nextInt();
		
		int iRet = nobj.Power(iBase,iPower);
		System.out.println(iRet);
	}
}
