/////////////////////////////////////////////////////////////////
//
//		Write a Program Summation of N Numbers
//
////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public int SummationNum(int iNum)
	{
		int iCnt = 0;
		int iSum = 0;
		
		for(iCnt = 1; iCnt <= iNum;iCnt++)
		{
			iSum = iSum + iCnt;
		}
		return iCnt;
	}
}
class SumofN
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		int iRet = 0;
		iRet = nobj.SummationNum(iNo);
		
		System.out.println("Summation of Number is "+iRet);
	}
}