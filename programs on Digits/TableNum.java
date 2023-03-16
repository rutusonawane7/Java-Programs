///////////////////////////////////////////////////////////////
//
//		Accept Number from user nd Display Table of that Number
//
///////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number 
{
	public void Table(int iNum)
	{
		int iCnt = 0;
		int iTab = 1;
		
		System.out.println("Table of " +iNum+" is :");
		for(iCnt =1; iCnt <= 10; iCnt++)
		{
			iTab = iNum * iCnt;
			System.out.println(iTab);
		}
	}

}
class TableNum
{
	public static void main(String args[])
	{
		Number nobj = new Number();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int iNo = sobj.nextInt();
		
		nobj.Table(iNo);
	}
}