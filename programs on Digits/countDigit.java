//////////////////////////////////////////////////////////////
//
//		program to count Digits in Number
//
//////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public int CountDigits(int iNum)
	{
		int iDigit = 0;
		int iCnt = 0;
		
		if(iNum < 0)
		{
			iNum = -iNum;
			
		}
		
		while(iNum > 0)
		{
			iDigit = iNum % 10;
			iCnt++;
			iNum = iNum / 10;
		}
		return iCnt;
	}
	
}

class countDigit
{
	public static void main(String args[])
	{
		
	
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
	
		int iRet = 0;
		iRet = nobj.CountDigits(iNo);
	
		System.out.println(iRet);
	}
	
}
