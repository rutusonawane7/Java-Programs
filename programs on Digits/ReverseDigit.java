////////////////////////////////////////////////////////////////////////
//
//			Program Accept Number from the user nd return reverse
//
/////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
	public int Reverse(int iNum)
	{
		int iDigit = 0;
		int iRev = 0;
		
		if(iNum < 0)
		{
			iNum = -iNum;
		}

		while(iNum > 0)
		{
			iDigit = iNum % 10;
			iRev = iRev * 10 +iDigit;
			iNum = iNum / 10;
		}
		return iRev;
	}
	

}
class ReverseDigit
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		int iRet = 0;
		iRet = nobj.Reverse(iNo);
		
		System.out.println("Reverse Number is "+iRet);
	}
}