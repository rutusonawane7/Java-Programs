//////////////////////////////////////////////////////////
// Input : 7856
// Output :
// 6
// 5
// 8
// 7
/////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number 
{
	public void DisplayNumber(int iNo)
	{
		int iDigit = 0;

			if(iNo < 0)
			{
				iNo = -iNo;
			}

			while(iNo > 0)
			{
				iDigit = iNo % 10;
				System.out.println(iDigit);
				iNo = iNo /10;
			}
	}

}
class disDigit
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj =new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		nobj.DisplayNumber(iNo);
	}
}
