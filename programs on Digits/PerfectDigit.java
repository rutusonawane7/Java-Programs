/////////////////////////////////////////////////////////////////
//
//		Accept Number from user and check whether that Number is Perfect or not
//
////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public boolean PerfectNum(int iNum)
	{
		int iCnt = 0;
		int iSum = 0;
		
		for(iCnt = 1; iCnt < iNum;iCnt++)
		{
			 if(iNum % iCnt == 0)
            {
                iSum = iSum + iCnt;   
            }    
		}
		if (iSum == iNum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
class PerfectDigit
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		boolean iRet;
		iRet = nobj.PerfectNum(iNo);
		
		if(iRet == true)
		{
			System.out.println(iNo+" is Number  Perfect");
		}
		else
		{
			System.out.println(iNo+" is not a  Perfect Number");
		}
		

	}
}