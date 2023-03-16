/////////////////////////////////////////////////////////////////////////
//
//		Accept Number from user and check whether Number is prime or not
//
/////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public boolean checkPrime(int iNum)
	{
		int iCnt = 0;
		for(iCnt = 2; iCnt < (iNum/2); iCnt++)
		{
			if(iNum % iCnt == 0)
			{
				return false;
			}
		}
		return true;
	}
}

class prime
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		boolean bRet;
		bRet = nobj.checkPrime(iNo);
		
		if(bRet == true)
			
		{
			System.out.println(iNo+" is an Prime Number ");
		}
		else
		{
			System.out.println(iNo+" is not a Prime Number ");
		}
	}
}
