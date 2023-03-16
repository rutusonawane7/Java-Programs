///////////////////////////////////////////////////////////////////////
//
//		Program Accept Number from User and Check that Number is Armstrong Number or not
//
///////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number 
{
	public boolean checkArmstrong(int iNo)
	{
	int iTemp = 0, iCnt = 0,iMult = 1;
    int iDigCnt = 0, iDigit = 0, iSum = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    iTemp = iNo;

    // Calculate number of digits
    while(iNo != 0)
    {
        iDigCnt++;
        iNo = iNo / 10;
    }
    iNo = iTemp;

    while(iNo != 0)
    {
        iMult = 1;
        iDigit = iNo % 10;

        for(iCnt = 1; iCnt <= iDigCnt; iCnt++)
        {
            iMult = iMult * iDigit;       // 4
        }

         iSum = iSum + iMult;
        iNo = iNo / 10;
    }

    if(iSum == iTemp)
    {
        return true;
    }
    else
    {
        return false;
    }
	}
}
class Armstrong
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNum = sobj.nextInt();
		
		boolean bRet;
		
		bRet = nobj.checkArmstrong(iNum);
		if(bRet ==  true)
		{
			System.out.println(iNum+" is an Armstrong Number ");
		}
		else
		{
			System.out.println(iNum+" is not an Armstrong Number ");
		}
	}
}