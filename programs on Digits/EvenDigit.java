////////////////////////////////////////////////////////////////////////
//
//		Accept Number from user and display Even Digits from Number
//
/////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public void DisplayEvenDigit(int iNum)
	{
		int iDigit = 0;
		
		if(iNum < 0)
		{
			iNum = -iNum;
		}
		
		System.out.println("Even Digits in Number are :");
		
		
		while(iNum > 0)
		{
			iDigit = iNum % 10;
			
			if((iDigit % 2) == 0)
			{
				System.out.println(iDigit);
			}
			iNum = iNum / 10;
		}
	}
	

}
class EvenDigit
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		nobj.DisplayEvenDigit(iNo);
	}
}