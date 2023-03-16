////////////////////////////////////////////////////////////////////////
//
//			Program Accept Number from the user nd check whether that Number is palindrom or not
//
/////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public boolean checkPalindrom(int iNum)
	{
		int iDigit = 0;
		int iRev = 0;
		int iTemp = 0;
		
		
		if(iNum < 0)
		{
			iNum = -iNum;
		}
		
			iTemp = iNum;
			
		while(iNum > 0)
		{
			iDigit = iNum % 10;
			iRev = iRev * 10 +iDigit;
			iNum = iNum / 10;
		}
		if(iRev== iTemp)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

}
class palindromDigit
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		boolean iRet;
		iRet = nobj.checkPalindrom(iNo);
		
		if(iRet == true)
		{
			
			System.out.println(iNo+" is Palindrom Number");
		}
		else
		{
			System.out.println(iNo+" is not a Palindrom Number");
		}
		
	}
}