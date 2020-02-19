package sausamya_maven;

public class CompoundInterest extends getData
{
	double compoundinterest;
	double amount;
public CompoundInterest(double principal,double interestrate,double timeinyears)
{
	super(principal,interestrate,timeinyears);
	
}
public double CalculateCompoundInterest()
{   
	double basepart;
	basepart=(1+(interestrate/100));
	amount=principal*(Math.pow(basepart,timeinyears));
	compoundinterest=amount-principal;
	return compoundinterest;
}
}
