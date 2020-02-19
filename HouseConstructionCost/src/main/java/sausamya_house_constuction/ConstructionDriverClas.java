

package sausamya_house_constuction;
import java.util.*;


import java.io.FileDescriptor;
import  java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ConstructionDriverClas 
{
	public static void main(String args[])throws IOException
	{
PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
//myOutput.print("ENTER THE DETAILS:");
Scanner sc=new Scanner(System.in);
double tA;
double mS,fAH;
myOutput.print("ENTER 1:TO USE STANDARD MATERIALS"
		      +"ENTER 2:TO USE ABOVE STANDARD MATERIALS"
		      +"ENTER 3:TO USE HIGH STANDARD MATERIALS");
mS=sc.nextDouble();
myOutput.print("ENTER THE TOTALL AREA OF THE HOUSE");
tA=sc.nextDouble();
myOutput.print("ENTER 1:IF YOU WANT FULLY AUTOMATED HOME"
		      +"ENTER 0:IF YOU DON'T WANT FULLY AUTOMATED HOME ");
fAH=sc.nextDouble();
ConstructionCost c=new ConstructionCost(mS,tA,fAH);

double totalCost;
totalCost=c.Calculate();
myOutput.print("THE TOTAL COST IS:-"+totalCost);


	}
}
