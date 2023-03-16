//////////////////////////////////////////////////////////////////////
//
//		Accept Number from user and check whether Number is even or odd
//
///////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public boolean evenOdd(int iNum)
	{
		if((iNum % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class EvenOdd
{
	public static void main(String arg[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		boolean iRet;
		
		iRet = nobj.evenOdd(iNo);
		
		if(iRet ==  true )
		{
			System.out.println(iNo+" is an Even Number ");
		}
		else
		{
			System.out.println(iNo+" is an Odd Number ");
		}
	}
}

			