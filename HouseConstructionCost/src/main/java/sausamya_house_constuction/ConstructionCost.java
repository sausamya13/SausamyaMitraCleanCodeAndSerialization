package sausamya_house_constuction;



import java.io.FileDescriptor;
import  java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class ConstructionCost
{
double materialStandard;
double totalArea;
double fullyAutomatedHome;
double totalCost;
public  ConstructionCost(double materialStandard,double totalArea,double fullyAutomatedHome)
{
	this.materialStandard=materialStandard;
	this.totalArea=totalArea;
	this.fullyAutomatedHome=fullyAutomatedHome;
	
}
public double Calculate()
{ 
	
	if(materialStandard==1&& fullyAutomatedHome==0) 
	{
			totalCost= totalArea *1200;
	
	}
	else if(materialStandard==2  && fullyAutomatedHome==0)
	{
		totalCost=totalArea*1500;
		
	}
	else if(materialStandard==3 && fullyAutomatedHome==0 )
	{
		totalCost=totalArea*1800;
		
	}
	else if(materialStandard==3 && fullyAutomatedHome==1)
	{
		totalCost=totalArea*2500;
		
	}
	else
	{
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("invalid choice");
		
	}
return totalCost;
}

}


