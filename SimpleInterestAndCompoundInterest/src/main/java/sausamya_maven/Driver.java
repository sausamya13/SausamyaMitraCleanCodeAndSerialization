package sausamya_maven;

import java.util.*;

import java.io.FileDescriptor;
import  java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Driver 
{
	public static void main(String args[])throws IOException
	{
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("ENTER THE PRINCIPAL RATE AND TIME");
		Scanner sc=new Scanner(System.in);
		double principal, interestrate , timeinyears;
		//myOutput.print("ENTER THE PRINCIPAL RATE AND TIME    ");
		principal=sc.nextDouble();
		
		
		interestrate=sc.nextDouble();
		
		timeinyears=sc.nextDouble();
		
		SimpleInterest si=new SimpleInterest(principal,interestrate,timeinyears);
		
		//si.SimpleInterest(principal,interestrate,timeinyears);
		
		double SimpleInterest=si.CalculateSimpleInterest();
		myOutput.print("     THE SIMPLE INTEREST IS    "+SimpleInterest);
		
		CompoundInterest ci=new CompoundInterest(principal,interestrate,timeinyears);
		//ci.CompoundInterest(principal,interestrate,timeinyears);
		
		double CompoundInterest=ci.CalculateCompoundInterest();
		myOutput.print("     THE COMPOUND INTEREST IS   "+CompoundInterest);
		
		
	}
	
}
