//////////////////////////////////////////////////////////////////////
// 
//		Accept Number from user and perform Addition of the Digits
//
///////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public int DigitSum(int iNum)
	{
		int iDigit = 0;
		int iSum = 0;
		
		if(iNum < 0)
		{
			iNum = -iNum;
		}
		
		while(iNum > 0)
		{
			iDigit = iNum % 10;
			iSum = iSum + iDigit;
			iNum = iNum / 10;
		}
		return iSum;
	}
	
}
class sumDigit
{
	public static void main(String ars[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int iNo = sobj.nextInt();
		
		int iRet = 0;
		
		iRet = nobj.DigitSum(iNo);
		System.out.println(iRet);
	}
}