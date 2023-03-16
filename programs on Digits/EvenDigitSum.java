////////////////////////////////////////////////////////////////////////
//
//			Program Accept Number from the user nd return Summation of Even Digits of that Number
//
/////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public int SumEvenDigits(int iNum)
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
			
			if((iDigit % 2) == 0)
			{
				iSum = iSum + iDigit;
			}
			iNum = iNum / 10;
		}
		return iSum;
	}
	

}
class EvenDigitSum
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		int iRet = 0;
		iRet = nobj.SumEvenDigits(iNo);
		
		System.out.println("Summation of Even Digits is "+iRet);
	}
}